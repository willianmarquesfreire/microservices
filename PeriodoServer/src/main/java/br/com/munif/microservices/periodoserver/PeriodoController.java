package br.com.munif.microservices.periodoserver;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeriodoController {

    @Autowired
    private TimeClient timeClient;

    @RequestMapping("/")
    public String getTime() {
        return "Manha/Tarde/Noite" + timeClient.getTime();
    }

}
