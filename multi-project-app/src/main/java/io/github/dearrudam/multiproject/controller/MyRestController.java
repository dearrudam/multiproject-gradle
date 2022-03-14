package io.github.dearrudam.multiproject.controller;

import io.github.dearrudam.multiproject.spec.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyRestController {

    private final MyService myService;

    public MyRestController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("message")
    MyMessage getMessage() {
        return new MyMessage(myService.doSomething());
    }

    public record MyMessage(String message) { }

}
