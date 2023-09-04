package com.springconfigproperties.configproperties.properties;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ServerProperties {
    
    private String host;

    private int port;
}
