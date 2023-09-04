package com.springconfigproperties.configproperties;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import com.springconfigproperties.configproperties.configurations.ApplicationConfigProiperties;

public class ResourceTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    public void setUp() {
        this.context = new AnnotationConfigApplicationContext(ApplicationConfigProiperties.class);
        this.context.registerShutdownHook();
    }

    @Test
    public void testResource() throws IOException {
        ClassPathResource classPathResource = new ClassPathResource("application.properties");
        Assertions.assertNotNull(classPathResource);
        Assertions.assertTrue(classPathResource.exists());
    }
}
