package com.gbcreation.app.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import static org.slf4j.LoggerFactory.getLogger;

@Component
@Slf4j
public class TestService implements CommandLineRunner {
    //private static final Logger LOG = getLogger(Process.class);
    @Override
    public void run(String... args) throws Exception {
        log.debug("C'est parti !!!");
    }
}
