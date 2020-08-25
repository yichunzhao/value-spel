package com.ynz;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class Worker {
    private final Saw saw;

    public void doTask() {
        saw.cut();
    }

}
