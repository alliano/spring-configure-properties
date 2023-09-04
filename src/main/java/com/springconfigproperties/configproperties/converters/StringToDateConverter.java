package com.springconfigproperties.configproperties.converters;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import lombok.SneakyThrows;

@Component
public class StringToDateConverter implements Converter<String, Date> {

    private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-mm-dd");
    
    @Override @SneakyThrows
    public Date convert(String source) {
        return DATE_FORMAT.parse(source);
    }
    
}
