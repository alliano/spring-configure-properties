package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import com.springconfigproperties.configproperties.configurations.PropertySourcesConfiguration;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class PropertysourceTest {
    
    @Autowired
    public PropertySourcesConfiguration proiperties;

    @Autowired
    public Environment environment;

    @Test
    public void testPropertySource() {
        String name = this.proiperties.getName();
        int version = this.proiperties.getVersion();
        String property1 = this.environment.getProperty("example.version");
        String property2 = this.environment.getProperty("example.name");
        Assertions.assertNotNull(name);
        Assertions.assertNotNull(version);
        Assertions.assertNotNull(property1);
        Assertions.assertNotNull(property2);
        Assertions.assertSame(Integer.parseInt(property1), version);
        Assertions.assertEquals(property2, name);
    }

}
