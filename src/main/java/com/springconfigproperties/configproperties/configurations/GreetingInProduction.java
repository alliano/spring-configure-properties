package com.springconfigproperties.configproperties.configurations;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.springconfigproperties.configproperties.utils.Greeting;

/**
 * bean ini akan dibuat dan digunakan ketika
 * profile active nya production,
 * kalo profile active nya bukan production
 * maka bean ini tidak akan pernah dbuat
 */
@Profile(value = {"production"})
@Component
public class GreetingInProduction implements Greeting {

    @Override
    public String greet() {
       return "Hello from production profile";
    }
}
