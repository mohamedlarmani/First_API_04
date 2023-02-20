package co.develhope.firstapi4.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
public class HeaderController {


    @RequestMapping("/headers")
    public String getHostInfo(@RequestHeader("host") String hostname, @RequestHeader("port") int port) {
        return "Hostname: " + hostname + ", Port: " + port;
    }
}
