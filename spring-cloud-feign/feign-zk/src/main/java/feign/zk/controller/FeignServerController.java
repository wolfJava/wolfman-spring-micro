package feign.zk.controller;

import feign.zk.service.feign.clients.SayingService;
import feign.zk.service.rest.clients.FeignSayingRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignServerController {

    @Autowired
    private SayingService sayingService;

    @GetMapping("/feign/say")
    public String feignSay(@RequestParam String message){
        return sayingService.say(message);
    }

    @Autowired
    private FeignSayingRestService feignSayingRestService;

    @GetMapping("/myself/feign/say")
    public String myselfFeignSay(@RequestParam String message){
        return feignSayingRestService.say(message);
    }


}
