package projetlogger01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppSl4j {
	public static final Logger log = LoggerFactory.getLogger(AppSl4j.class);

	public static void main(String[] args) {
		log.debug("Hello tout le monde");

	}

}
