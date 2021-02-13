package jalil.demo.firstTimers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FirstTimersApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstTimersApplication.class, args);
	}

	@Override
	public void run(String... args){
		log.info("I am alive !!!!");
	}
}
