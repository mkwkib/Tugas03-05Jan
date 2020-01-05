package com.btpns.training.latihan3.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@Component
public class CustomSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    private final static String ADMINISTRATOR = "Admin";
    private final static String OPERATOR = "Operator";

    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
        throws IOException, ServletException{
        String targetUrl = determineTargetUrl(authentication);

        if(response.isCommitted()){
            System.out.println("can't resirect");
            return;
        }
        redirectStrategy.sendRedirect(request,response,targetUrl);
    }

protected String determineTargetUrl(Authentication authentication) {
    String url = "";
    Collection<? extends GrantedAuthority> grantedAuthorities = authentication.getAuthorities();
    String role = "";

    for (GrantedAuthority grantedAuthorityTemp : grantedAuthorities) {
        role = grantedAuthorityTemp.getAuthority();
    }

    if(role.equalsIgnoreCase(ADMINISTRATOR)){
        url = "/main";
    }
    if(role.equalsIgnoreCase(OPERATOR)){
        url = "/main";
    }
    return url;
}
}
