package com.springconfigproperties.configproperties.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Getter;

@Getter
@Component(value = "applicationInfo")
public class ApplicationInfo {
    
    @Value(value = "${application.name}")
    private String name;

    @Value(value = "${application.version}")
    private int version;
    
    /**
     * kita juga dapat mengambil env variabel didalam sistem operasi kita
     * misalnya, kita ingin mengambil user dari komputer kita
     */
    @Value(value = "${USER}")
    private String userAdmin;
    
    @Value(value = "${application.production-mode}")
    private boolean producton;

    public boolean getProduction() {
        return this.producton;
    }
}
