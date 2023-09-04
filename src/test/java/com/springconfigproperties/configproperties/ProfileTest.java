package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springconfigproperties.configproperties.configurations.GreetingInProduction;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class ProfileTest {
    
    @Autowired
    public GreetingInProduction production;

    @Test
    public void testGreetingInProduction() {
        String greet = this.production.greet();
        Assertions.assertNotNull(greet);
        Assertions.assertEquals("Hello from production profile", greet);
    }
}
