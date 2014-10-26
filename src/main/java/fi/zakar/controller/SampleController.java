package fi.zakar.controller;

import fi.zakar.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zakar on 26/10/14.
 */
@Controller
public class SampleController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/")
    public @ResponseBody String sayHello() {
        return helloWorldService.getHelloMessage();
    }
}
