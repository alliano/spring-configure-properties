package com.springconfigproperties.configproperties.aware;

import java.io.IOException;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import lombok.Setter;

@Component
public class LoadResource implements ResourceLoaderAware {
    /**
     * properti ini akan di injection menggunakan setter Injection
     */
    @Setter
    private ResourceLoader resourceLoader;

    public String getText() {
        Resource resource = this.resourceLoader.getResource("classpath:/config/config.txt");
        try {
            return new String(resource.getInputStream().readAllBytes());
        } catch(IOException IOX) {
            throw new RuntimeException(IOX.getMessage());
        }
    }
    
}
