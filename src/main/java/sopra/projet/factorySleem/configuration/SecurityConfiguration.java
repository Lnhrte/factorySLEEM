package sopra.projet.factorySleem.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import sopra.projet.factorySleem.services.CustomUserDetailService;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private CustomUserDetailService userDetailsService;

	// definir les pages securisees
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		// .authorizeRequests().antMatchers(HttpMethod.OPTIONS).anonymous();
		// http.authorizeRequests().antMatchers("/rest/**").permitAll();
		// http.headers().frameOptions().disable();

		http.csrf().disable();
		http.headers().frameOptions().disable();
		
		http.authorizeRequests().antMatchers("/css/**", "/img/**").permitAll();

		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/**").authenticated().and().formLogin().loginPage("/login")
				.failureUrl("/login?error=erreur").permitAll().and().logout().permitAll()
				.logoutSuccessUrl("/");
		
		
		//
		// http.authorizeRequests().antMatchers("/rest/**").authenticated().and().httpBasic();
	}

	// // definition la methode d'authentification
//	 @Override
//	 protected void configure(AuthenticationManagerBuilder auth) throws Exception
//	 {
//	 auth.inMemoryAuthentication().withUser("olivier").password("{noop}olivier").roles("Administrateur");
//	 }

	// @Override
	// protected void configure(AuthenticationManagerBuilder auth) throws
	// Exception {
	// auth.jdbcAuthentication().dataSource(dataSource)
	// .usersByUsernameQuery("select username,password,enable from users where
	// username=?")
	// .authoritiesByUsernameQuery("select username,role from user_role where
	// username=?");
	// }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
	}

	@Bean(name = "passwordEncoder")
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
