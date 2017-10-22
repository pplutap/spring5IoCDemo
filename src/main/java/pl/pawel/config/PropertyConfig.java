package pl.pawel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import pl.pawel.datasource.FakeDataSource;

/**
 * Created by Pawel on 2017-10-22.
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${pawel.username}")
	String user;

	@Value("${pawel.password}")
	String password;

	@Value("${pawel.dburl}")
	String url;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource dataSource = new FakeDataSource();
		dataSource.setUser(user);
		dataSource.setPassword(password);
		dataSource.setUrl(url);
		return dataSource;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		return configurer;
	}
}
