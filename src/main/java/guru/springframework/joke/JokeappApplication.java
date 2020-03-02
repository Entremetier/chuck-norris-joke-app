package guru.springframework.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
//Beim starten der Application wird der Context über chuck-config.xml geleitet um diese Resource zu laden. Sollte das nicht geschehen
//wird die Bean "ChuckNorrisQuotes" nicht gefunden und der Context wird nicht geladen.
public class JokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeappApplication.class, args);
	}

}
