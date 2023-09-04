package com.springconfigproperties.configproperties.configurations;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class SampleSource implements MessageSourceAware {

    
    private MessageSource messageSource;
    
    public String greeting(Locale locale) {
        return this.messageSource.getMessage("sampleMessage", new Object[]{"Alliano"}, locale);
    }

    @Override
    public void setMessageSource(@Qualifier(value = "messageSource")MessageSource messageSource) {
        this.messageSource = messageSource;
    }
}
