package com.gh.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * <p>Created by IntelliJ IDEA.
 * <p>Date: 12/1/22
 * <p>Time: 12:26 AM
 *
 * @author Miguel Mu\u00f1oz
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  public void configure(final WebSecurity web) throws Exception {
    web
        .ignoring()
        .antMatchers("/demo/server/getDummyData");
  }

//  @Override
// The full application overrides protected void configure(final HttpSecurity http)
// but that's not necessary for this test case.
}
