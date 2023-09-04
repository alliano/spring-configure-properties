package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springconfigproperties.configproperties.configurations.ApplicationInfo;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class TestValueAnnotation {

    @Autowired
    public ApplicationInfo applicationInfo;

    @Test
    public void testApplicationInfo() {
        String name = this.applicationInfo.getName();
        String userAdmin = this.applicationInfo.getUserAdmin();
        int version = this.applicationInfo.getVersion();
        boolean production = this.applicationInfo.getProduction();
        
        Assertions.assertEquals("SpringConfigProperties", name);
        Assertions.assertEquals("alliano-dev", userAdmin);
        Assertions.assertEquals(2, version);
        Assertions.assertFalse(production);
    }
}
