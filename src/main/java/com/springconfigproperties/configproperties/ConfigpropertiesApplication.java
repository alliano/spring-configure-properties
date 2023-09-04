package com.springconfigproperties.configproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.springconfigproperties.configproperties.properties.ApplicationConfig;
import com.springconfigproperties.configproperties.properties.ApplicationConfigurationProperties;

@EnableConfigurationProperties(value = {
	ApplicationConfigurationProperties.class,
	ApplicationConfig.class
})
@SpringBootApplication
public class ConfigpropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigpropertiesApplication.class, args);
	}

}