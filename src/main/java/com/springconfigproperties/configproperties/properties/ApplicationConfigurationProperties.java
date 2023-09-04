package com.springconfigproperties.configproperties.properties;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@ConfigurationProperties(prefix = "application")
public class ApplicationConfigurationProperties {
    
    private String name;

    private Integer version;

    private boolean productionMode;

    private Map<String, ServerProperties> serverProperties;

    private List<DatabaseServer> databaseServers;

    private MessageBroker messageBroker;

    public boolean getProductionMode() {
        return this.productionMode;
    }
}
