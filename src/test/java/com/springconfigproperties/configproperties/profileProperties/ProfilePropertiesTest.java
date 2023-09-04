// package com.springconfigproperties.configproperties.profileProperties;

// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.stereotype.Component;
// import org.springframework.test.context.ActiveProfiles;

// import lombok.Getter;

// @ActiveProfiles(profiles = {"development", "production"})
// @SpringBootTest(classes = ProfilePropertiesTest.TestApplication.class)
// public class ProfilePropertiesTest {

//     @Autowired
//     private TestApplication.ProfileProperties properties; 
    
//     @Test
//     public void profilePropertiesTest() {
//         Assertions.assertEquals("default", properties.getDefaultFile());
//         Assertions.assertEquals("development", properties.getDevelopmentFile());
//         Assertions.assertEquals("production", properties.getProductionFile());
//     }

//     @SpringBootApplication
//     public static class TestApplication {

//         @Component @Getter
//         public static class ProfileProperties {

//             @Value("${profile.defautl}")
//             private String defaultFile;

//             @Value("${profile.production}")
//             private String productionFile;

//             @Value("${profile.development}")
//             private String developmentFile;
//         }
//     }
// }