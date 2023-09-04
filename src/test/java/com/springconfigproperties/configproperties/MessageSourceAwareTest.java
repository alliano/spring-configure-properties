package com.springconfigproperties.configproperties;

import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springconfigproperties.configproperties.configurations.SampleSource;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class MessageSourceAwareTest {
    
    @Autowired
    public SampleSource sampleSource;

    @Test
    public void testsampleMessage() {
        String greeting = sampleSource.greeting(Locale.getDefault());
        Assertions.assertEquals("Hello Alliano, good afternoon", greeting);
    }
}
