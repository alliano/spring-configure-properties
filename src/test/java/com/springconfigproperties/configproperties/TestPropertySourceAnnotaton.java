package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySources;
import com.springconfigproperties.configproperties.configurations.PropertySourcesConfiguration;
import org.springframework.test.context.TestPropertySource;

@TestPropertySources(value = {
    @TestPropertySource("classpath:/app.properties")
})
@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class TestPropertySourceAnnotaton {
    
    @Autowired
    public PropertySourcesConfiguration property;

    @Test
    public void testPropery() {
        String name = this.property.getName();
        int version = this.property.getVersion();
        Assertions.assertSame(2, version);
        Assertions.assertEquals("spring-properties-test", name);
    }   
}
