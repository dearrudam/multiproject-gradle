package io.github.dearrudam.multiproject.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = {"message=My test"},
        classes = {MyServiceImpl.class},
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
class MyServiceImplTest {

    @Autowired
    MyServiceImpl myService;

    @Test
    void testDoSomething() {
        assertEquals("My test", myService.doSomething());
    }

}