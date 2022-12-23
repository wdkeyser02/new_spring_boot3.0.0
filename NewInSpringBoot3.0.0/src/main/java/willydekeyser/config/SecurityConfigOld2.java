package willydekeyser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfigOld2 {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		return http
				.authorizeRequests(
						auth -> auth
						.requestMatchers("/tokenbybody").permitAll()
						.requestMatchers("/user").hasAnyAuthority("ROLE_USER", "ROLE_ADMIN")
						.requestMatchers("/admin").hasAuthority("ROLE_ADMIN")
						.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults())
				.formLogin(Customizer.withDefaults())
				.build();
	}
}
