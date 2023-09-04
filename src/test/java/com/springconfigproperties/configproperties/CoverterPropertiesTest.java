package com.springconfigproperties.configproperties;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;

import com.springconfigproperties.configproperties.properties.ApplicationConfig;
import lombok.SneakyThrows;


@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class CoverterPropertiesTest {

    @Autowired
    private ApplicationConfig config;

    @Autowired
    private ConversionService conversionService;

    @Test
    public void testDuration() {
        Duration duration = this.config.getDuration();
        Assertions.assertEquals(Duration.ofSeconds(10), duration);
    }

    @Test @SneakyThrows
    public void testDate() {
        Date date = this.config.getDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-mm-dd");
        Assertions.assertEquals(simpleDateFormat.parse("2022-8-7"), date);
    }

    @Test
    public void testConvert() {
        // canConvert() digunakan untuk mengecek apakah kedua tipe data tersebut dapat di konversi
        boolean canConvert = this.conversionService.canConvert(String.class, Date.class);
        // convert() digunakan untuk mengkonversi secara langusung
        Duration durationConvert = this.conversionService.convert("30s", Duration.class);
        /**
         * conversion langusung menggunakan ConvesionService dapat dilakukan secara programatic
         * dengan syarat kita telah buatkan logic konversinya (dengan cara implementasi Conversion<S, T>)
         * dan kita telah meregistrasikanya kedalam ConversionService
         * seperti yang telah dilakukan diatas
         */
        
        Assertions.assertTrue(canConvert);
        Assertions.assertEquals(Duration.ofSeconds(30), durationConvert);
    }
}
