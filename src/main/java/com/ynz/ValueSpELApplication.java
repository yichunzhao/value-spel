package com.ynz;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.Map;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class ValueSpELApplication implements CommandLineRunner {
    @Value("#{${valuesMap}}")
    private Map<String, String> valuesMap;

    private final Worker worker;
    private final Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(ValueSpELApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("current profile: " + Arrays.toString(environment.getActiveProfiles()));

        worker.doTask();

        //injected map
        valuesMap.values().stream().map(s -> s.concat(" ")).forEach(System.out::print);
    }
}
