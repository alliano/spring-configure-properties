package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import com.springconfigproperties.configproperties.aware.EnvironmentSystem;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class EnvirontmentTest {
    
    @Autowired
    public EnvironmentSystem environmentSystem;

    @Test
    public void testEnvirontment() {
        Environment environment = this.environmentSystem.getEnvironment();
        // mislanya disini kita ingin mengetahui user dari komputer kita
        String property = environment.getProperty("USER");
        Assertions.assertEquals("alliano-dev", property);
    }
}