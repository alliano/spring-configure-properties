package com.springconfigproperties.configproperties.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import lombok.Getter;

/**
 * jika kita memiliki lebih dari 1 resource yang ingin di load,
 * maka kita bisa mengkombinasikan @PropertySources dengan @PropertySource
 */
@PropertySources(value = {
    @PropertySource(value = { "classpath:/app.properties"})
})
@Getter @Configuration
public class PropertySourcesConfiguration {

    @Value(value = "${example.version}")
    private int version;

    @Value(value = "${example.name}")
    private String name;
}
