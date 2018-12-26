package com.guitar.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class CustomizedRestMvcConfiguration extends RepositoryRestMvcConfiguration {

	

	@Value("${pathbaseUri}")
	private String pathbaseUri;

	@Override
	public RepositoryRestConfiguration config() {
		RepositoryRestConfiguration config = super.config();
		config.setBaseUri(pathbaseUri);
		return config;
	}
	
//	@Override
//	protected void configureJacksonObjectMapper(ObjectMapper objectMapper) {
//		super.configureJacksonObjectMapper(objectMapper);
//		objectMapper.setPropertyNamingStrategy(new FirstLetterCapsStrategy());
//		objectMapper.setDateFormat(new ISO8601DateFormat());
//	}

}
