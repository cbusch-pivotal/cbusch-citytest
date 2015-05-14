package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StagingController {

    @RequestMapping("/")
    public String index() {
        String timestamp = System.getProperty("staging.timestamp");
        if (timestamp == NULL) timestamp = new Date().toString();
        return "Application was staged at: " + timestamp;
    }
}
