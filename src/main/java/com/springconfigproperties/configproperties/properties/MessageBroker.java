package com.springconfigproperties.configproperties.properties;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class MessageBroker {
 
    private String driver;

    private String username;

    private String password;

    private String name;

    private String url;
}
