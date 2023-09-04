package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springconfigproperties.configproperties.properties.ApplicationConfigurationProperties;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class ConfigurationPropertiesTest {
    
    @Autowired
    public ApplicationConfigurationProperties confingProperties;

    @Test
    public void testConfigurationProperties() {
        boolean productionMode = this.confingProperties.getProductionMode();
        String name = this.confingProperties.getName();
        Integer version = this.confingProperties.getVersion();

        Assertions.assertArrayEquals(new Object[]{false, "SpringConfigProperties", 2}, new Object[]{productionMode, name, version});
    }
    
}
