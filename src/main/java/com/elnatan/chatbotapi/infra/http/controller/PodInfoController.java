package com.elnatan.chatbotapi.infra.http.controller;

import com.elnatan.chatbotapi.infra.helper.BashCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PodInfoController {
    @RequestMapping(method = RequestMethod.GET, path = "info/environment")
    public Map<String, String> envInfo() throws IOException, InterruptedException {
        Map<String, String> environmentInfo = new HashMap<>();
        environmentInfo.put("hostname", BashCommand.getHostname());
        return environmentInfo;
    }
}
