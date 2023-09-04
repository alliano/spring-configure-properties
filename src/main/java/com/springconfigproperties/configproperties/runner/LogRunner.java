package com.springconfigproperties.configproperties.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.springconfigproperties.configproperties.properties.ApplicationConfigurationProperties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Component @Slf4j
public class LogRunner implements ApplicationRunner {

    private ApplicationConfigurationProperties applicationConfigurationProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String name = this.applicationConfigurationProperties.getName();
        Integer version = this.applicationConfigurationProperties.getVersion();
        boolean productionMode = this.applicationConfigurationProperties.getProductionMode();
        log.info(name);
        log.info(String.valueOf(version));
        log.info(String.valueOf(productionMode));
    }
}
