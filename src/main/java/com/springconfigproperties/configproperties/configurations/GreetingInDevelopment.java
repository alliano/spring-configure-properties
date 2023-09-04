package com.springconfigproperties.configproperties.configurations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.springconfigproperties.configproperties.utils.Greeting;

@Profile(value = {"development"})
@Component
public class GreetingInDevelopment implements Greeting {

    @Override
    public String greet() {
        return "Hello from development profile";
    }    
}
