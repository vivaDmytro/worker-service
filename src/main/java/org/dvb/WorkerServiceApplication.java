package org.dvb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.dvb")
public class WorkerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkerServiceApplication.class, args);
    }

}
