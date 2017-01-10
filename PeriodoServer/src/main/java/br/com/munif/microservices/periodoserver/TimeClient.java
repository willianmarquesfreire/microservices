package br.com.munif.microservices.periodoserver;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("time-server")
public interface TimeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    String getTime();

}
