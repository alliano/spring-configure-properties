package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import com.springconfigproperties.configproperties.configurations.GreetingInProduction;

/**
 * Dengan menggunakan annotation @ActiveProfiles, unit test ini
 * tidak akan menghiraukan profile apa yang diaktifkan di application.properties
 * melainkan spring akan mengoveride profiles yang di seting di application.properties
 * dengan value yang diberikan di annotations @ActiveProfiles
 */
@ActiveProfiles(profiles = {"production", "development"})
@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class ActiveProfilesTest {

    @Autowired
    private GreetingInProduction production;

    /**
     * kita juga dapat memanfaatkan Environment atau EnvironmentAware 
     * untuk mendapatkan profile apa yang sedang aktif sekarang
     */
    @Autowired
    private Environment environment;
    
    @Test
    public void testProduction() {
        String greet = this.production.greet();
        Assertions.assertEquals("Hello from production profile", greet);
        String[] activeProfiles = this.environment.getActiveProfiles();
        Assertions.assertArrayEquals(new String[]{"production", "development"}, activeProfiles);
    }
}
