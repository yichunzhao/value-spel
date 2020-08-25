package com.ynz;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
@RequiredArgsConstructor
public class ValueSpELApplication implements CommandLineRunner {
    @Value("#{${valuesMap}}")
    private Map<String, String> valuesMap;

    private final Worker worker;

    public static void main(String[] args) {
        SpringApplication.run(ValueSpELApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        worker.doTask();

        valuesMap.values().stream().map(s -> s.concat(" ")).forEach(System.out::print);
    }
}
