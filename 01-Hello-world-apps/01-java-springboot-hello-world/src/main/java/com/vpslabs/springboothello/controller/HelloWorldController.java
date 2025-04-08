package com.vpslabs.springboothello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final String IMAGE_URL = "/images/noventiq-vp.png"; // Serve a fixed image

    @Value("${app.title}")
    private String appTitle;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!  Check with endpoint /noventiq-vp-hello";
    }

    @GetMapping("/noventiq-vp-hello")
    public String getImageHtml() {
        return "<html>" +
                "<head><title>Image Viewer</title></head>" +
                "<body>" +
                "<h1>" + appTitle + "</h1>" +
                "<h2>App modernization</h2>" +
                "<img src='" + IMAGE_URL + "' alt='Image' width='500'/>" +
                "</body>" +
                "</html>";
    }
}
