package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

import br.com.scheduler.ScheduledTasks;

@SpringBootApplication
@EnableScheduling
@PropertySource({
	"classpath:scheduler.properties",
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public ScheduledTasks getScheduledTasks() {
		return new ScheduledTasks();
	}
}
