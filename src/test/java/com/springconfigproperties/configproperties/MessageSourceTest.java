package com.springconfigproperties.configproperties;

import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

@SpringBootTest(classes = ConfigpropertiesApplication.class)
public class MessageSourceTest {

	@Autowired @Qualifier(value = "messageSource1")
	private MessageSource messageSource;

    @Test
	public void testMessageSourceEn() {
		String message = this.messageSource.getMessage("hello", new Object[]{"Alliano"}, Locale.ENGLISH);
		Assertions.assertEquals("Hello Alliano", message);
	}

	@Test
	public void testMessageSourceInID() {
		String message_id_ID = this.messageSource
												.getMessage("hello", new Object[]{"Alliano"}, new Locale
												.Builder()
												.setRegion("ID")
												.setLanguage("id")
												.build());
		Assertions.assertEquals("Hallo Alliano kun", message_id_ID);
	}
}
