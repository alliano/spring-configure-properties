package com.springconfigproperties.configproperties.registries;

import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import com.springconfigproperties.configproperties.converters.StringToDateConverter;

@Configuration
public class ConverterRegistryConfiguration {
    
    @Bean
    public ConversionService conversionService(StringToDateConverter stringToDateConverter) {
        ApplicationConversionService applicationConversionService = new ApplicationConversionService();
        applicationConversionService.addConverter(stringToDateConverter);
        return applicationConversionService;
    }

}
