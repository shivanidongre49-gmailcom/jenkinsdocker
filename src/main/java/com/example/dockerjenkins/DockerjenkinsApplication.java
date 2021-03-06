package com.example.dockerjenkins;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.dockerjenkins.model.ThemeParkRide;
import com.example.dockerjenkins.repo.ThemeParkRideRepository;

@SpringBootApplication
public class DockerjenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerjenkinsApplication.class, args);
	}
	@Bean
    public CommandLineRunner sampleData(ThemeParkRideRepository repository) {
        return (args) -> {
            repository.save(new ThemeParkRide("Rollercoaster", "Train ride that speeds you along.", 5, 3));
            repository.save(new ThemeParkRide("Log flume", "Boat ride with plenty of splashes.", 3, 2));
            repository.save(new ThemeParkRide("Teacups", "Spinning ride in a giant tea-cup.", 2, 4));
        };
    }

}
