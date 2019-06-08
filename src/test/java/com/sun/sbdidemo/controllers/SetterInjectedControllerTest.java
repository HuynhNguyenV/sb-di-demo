package com.sun.sbdidemo.controllers;

import com.sun.sbdidemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
       this.setterInjectedController = new SetterInjectedController();
       this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}