package com.springconfigproperties.configproperties.properties;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class DatabaseServer {
    
    private String username;

    private String name;

    private String password;

    private String url;

    private String driver;
}
