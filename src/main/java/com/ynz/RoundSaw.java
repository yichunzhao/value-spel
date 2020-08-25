package com.ynz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("cut")
@Slf4j
public class RoundSaw implements Saw {
    @Override
    public void cut() {
        log.info("cut a board in a straight line");
    }
}
