package com.cicddemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {

    @Test
    void testHomeEndpoint() {

        HomeController controller = new HomeController();

        assertEquals(
                "Hello from CI/CD Pipeline",
                controller.home()
        );
    }

    @Test
    void testHealthEndpoint() {

        HomeController controller = new HomeController();

        assertEquals(
                "Application is Healthy",
                controller.health()
        );
    }
}