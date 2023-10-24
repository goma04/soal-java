package eil.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eil.rest.common.SayHelloRequest;
import eil.rest.common.SayHelloResponse;
import eil.rest.common.CustomSayHelloRequest;
import eil.rest.common.CustomSayHelloResponse;
import eil.rest.common.CustomName;
import eil.rest.common.When;
import eil.rest.common.CustomGreeting;

@RestController
@RequestMapping(path = "/Hello")
public class HelloController {
    @Autowired
    private HelloService _service;

    @PostMapping(path = "/SayHello", consumes = "application/json", produces = "application/json")
    public SayHelloResponse sayHello(@RequestBody SayHelloRequest __request) {
        String name = __request.getName();
        SayHelloResponse __response = new SayHelloResponse();
        __response.setResult(__result);
        return __response;
    }

    @PostMapping(path = "/CustomSayHello", consumes = "application/json", produces = "application/json")
    public CustomSayHelloResponse customSayHello(@RequestBody CustomSayHelloRequest __request) {
        CustomName customName = __request.getCustomName();
        When when = __request.getWhen();
        CustomSayHelloResponse __response = new CustomSayHelloResponse();
        __response.setResult(CustomGreeting.fromCommon(__result));
        return __response;
    }


}

