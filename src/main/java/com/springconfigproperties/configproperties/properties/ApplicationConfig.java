package com.springconfigproperties.configproperties.properties;

import java.time.Duration;
import java.util.Date;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@ConfigurationProperties(prefix = "app")
public class ApplicationConfig {

    private Duration duration;

    private Date date;
    
}
