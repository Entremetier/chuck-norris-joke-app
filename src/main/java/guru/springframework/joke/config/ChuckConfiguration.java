package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

    //Spring Context sieht diese Klasse nicht mehr beim Starten, die Configuration wird über das chuck-config.xml in den resources gemacht
    //aus diesem Grund gibt es in JokeappApplication die annotation @ImportResource

    //wenn die Configuration wieder über diese Klasse laufen soll müssen die beiden Annotationen wieder aktiviert werden
}
