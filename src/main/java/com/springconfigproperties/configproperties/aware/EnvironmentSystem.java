package com.springconfigproperties.configproperties.aware;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import lombok.Getter;

@Component
public class EnvironmentSystem implements EnvironmentAware {

    @Getter
    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
