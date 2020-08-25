package com.ynz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("shape")
@Slf4j
public class JigSaw implements Saw {
    @Override
    public void cut() {
        log.info("cut a board in a round line.");
    }
}
