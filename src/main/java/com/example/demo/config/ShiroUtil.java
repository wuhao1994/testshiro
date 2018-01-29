package com.example.demo.config;

import com.example.demo.entity.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.mgt.RealmSecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import static org.apache.shiro.web.filter.mgt.DefaultFilter.user;

/**
 * Created by 格讯科技有限公司 on 2018/1/26.
 */
public class ShiroUtil {

    @Autowired
    ShiroFilterFactoryBean shiroFilterFactoryBean;

    public static void reloadAuthorizing(MyShiroRealm myRealm){
        Subject subject = SecurityUtils.getSubject();
        String realmName = subject.getPrincipals().getRealmNames().iterator().next();
        UserInfo user = (UserInfo)subject.getPrincipals().getPrimaryPrincipal();
        //第一个参数为用户名,第二个参数为realmName,test想要操作权限的用户
        SimplePrincipalCollection principals = new SimplePrincipalCollection(subject.getPrincipals(),realmName);
        subject.runAs(principals);
        AuthorizationInfo a = myRealm.getAuthorizationCache().get(user.getName());
        String x = "com.example.demo.config.MyShiroRealm.authorizationCache";
        AuthorizationInfo b = myRealm.getAuthorizationCache().get(x);
        myRealm.getAuthorizationCache().remove(subject.getPrincipals());
        myRealm.getAuthorizationCache().remove(x);
        subject.releaseRunAs();
    }
}
