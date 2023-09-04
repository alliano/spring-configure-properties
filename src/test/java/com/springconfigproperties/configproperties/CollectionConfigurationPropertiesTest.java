package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springconfigproperties.configproperties.properties.ApplicationConfigurationProperties;
import com.springconfigproperties.configproperties.properties.DatabaseServer;
import com.springconfigproperties.configproperties.properties.ServerProperties;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class CollectionConfigurationPropertiesTest {

    @Autowired
    private ApplicationConfigurationProperties properties;

    @Test
    public void testConfigList() {
        DatabaseServer databaseServer1 = this.properties.getDatabaseServers().get(0);
        DatabaseServer databaseServer2 = this.properties.getDatabaseServers().get(1);

        Assertions.assertNotNull(databaseServer1);
        Assertions.assertNotNull(databaseServer2);

        Assertions.assertArrayEquals(
            new String[]{"Postgresql", "com.cj.jdbc.Driver", "jdbc:postgres://192.168.0.1:5432", "alliano-dev", "secretPassword"}, 
            new String[]{databaseServer1.getName(), databaseServer1.getDriver(), databaseServer1.getUrl(), databaseServer1.getUsername(), databaseServer1.getPassword()});
        
        Assertions.assertArrayEquals(
            new String[]{"Mysql", "mysql.cj.jdbc.Driver", "jdbc:mysql://192.168.0.1:5432", "alliano-dev", "secretPassword"}, 
            new String[]{databaseServer2.getName(), databaseServer2.getDriver(), databaseServer2.getUrl(), databaseServer2.getUsername(), databaseServer1.getPassword()});
        
    }

    @Test
    public void testConfigMap() {
        ServerProperties serverProperties1 = this.properties.getServerProperties().get("server1");
        ServerProperties serverProperties2 = this.properties.getServerProperties().get("server2");

        Assertions.assertArrayEquals(
            new Object[]{"https://server-configration.net", 9072},
            new Object[]{serverProperties1.getHost(), serverProperties1.getPort()});
        
            Assertions.assertArrayEquals(
            new Object[]{"https://main-server-configuration.net", 9073},
            new Object[]{serverProperties2.getHost(), serverProperties2.getPort()});
    }
    
}
