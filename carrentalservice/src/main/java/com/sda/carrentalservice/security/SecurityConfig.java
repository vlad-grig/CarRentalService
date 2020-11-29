package com.sda.carrentalservice.security;

import com.sda.carrentalservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //define which endpoints/resources(css) can be accessed by anyone
        http.authorizeRequests().antMatchers("/register", "/user/register").permitAll()
                .antMatchers("/branch/**", "/car/**", "/customer/**", "/employee/**", "/rentaloffice/**").hasRole("ADMIN")
                //any other endpoint is secured
                .anyRequest().authenticated()
                .and()
                //configure the login form to be at page /login and to be permitted to anyone
                .formLogin().loginPage("/login").permitAll()
                .and()
                //configure logout
                .logout()
                //delete session data from memory
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                //tell Spring Security on which URL The logout will be made
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                //tell Spring Security on which URL to redirect after logout
                .logoutSuccessUrl("/login?logout").permitAll();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        authenticationProvider.setUserDetailsService(userService);
        return authenticationProvider;
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider());
    }
}

