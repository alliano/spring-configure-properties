package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class ApplicationPropertiesTest {
    /**
     * Spring ioc akan menginject object Environtment dnegan 
     * Object bean Environtment yang terlah disediakan oleh 
     * Spring ioc, tentunya didalam environtment nya akan
     * memuat konfigurasi yang terdapat pada application.properties
     */
    @Autowired
    public Environment environment;

    @Test
    public void testApplicationProperties() {
        String property = this.environment.getProperty("application.name");
        Assertions.assertEquals("SpringConfigProperties", property);
    }
}
