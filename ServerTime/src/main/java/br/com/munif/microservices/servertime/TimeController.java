package br.com.munif.microservices.servertime;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @RequestMapping("/")
    public String getTime() {
        return new Date().toString();
    }

}
