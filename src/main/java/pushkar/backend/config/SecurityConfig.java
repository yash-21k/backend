package pushkar.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity https) throws Exception {
        https
                .authorizeRequests()
                .antMatchers("/pushkareye/**").permitAll() // Allow access to specific endpoints
                .anyRequest().authenticated() // Or disable security completely
                .and().csrf().disable(); // Disable CSRF protection for testing
    }
}
