package com.springconfigproperties.configproperties;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springconfigproperties.configproperties.aware.LoadResource;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
class ConfigpropertiesApplicationTests {

	@Autowired
	public LoadResource loadResource;

	@Test
	public void testGetText() {
		String text = this.loadResource.getText();
		Assertions.assertNotNull(text);
		Assertions.assertEquals("Watashi Alliano kun", text.trim());
	}
}
