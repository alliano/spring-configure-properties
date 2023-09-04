package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springconfigproperties.configproperties.properties.ApplicationConfigurationProperties;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class NestedConfigurationPropertiesTest {
    
    @Autowired
    private ApplicationConfigurationProperties proiperties;

    @Test
    public void testNestedProperties() {
        String name = this.proiperties.getMessageBroker().getName();
        String driver = this.proiperties.getMessageBroker().getDriver();
        String url = this.proiperties.getMessageBroker().getUrl();
        String username = this.proiperties.getMessageBroker().getUsername();
        String password = this.proiperties.getMessageBroker().getPassword();
        Assertions.assertArrayEquals(
            new String[]{"kafka", "kafka.com.cj.driver", "https://url-kafka.com", "alliano", "secretPass"}, 
            new String[]{name, driver, url, username, password});
    }
}
