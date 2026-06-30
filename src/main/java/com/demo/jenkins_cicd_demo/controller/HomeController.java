package com.demo.jenkins_cicd_demo.controller;

import com.demo.jenkins_cicd_demo.model.BuildInfo;
import com.demo.jenkins_cicd_demo.service.SystemInfoService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private SystemInfoService systemInfoService;

    @GetMapping("/")
    public String home(Model model) {

        BuildInfo buildInfo = new BuildInfo();

        model.addAttribute("build", buildInfo);

        model.addAttribute("hostname", systemInfoService.getHostName());

        model.addAttribute("ipaddress", systemInfoService.getIPAddress());

        model.addAttribute("javaVersion", systemInfoService.getJavaVersion());

        model.addAttribute("operatingSystem", systemInfoService.getOperatingSystem());

        model.addAttribute("username", systemInfoService.getUserName());

        model.addAttribute("processors", systemInfoService.getProcessors());

        model.addAttribute("memory", systemInfoService.getMaximumMemory());

        model.addAttribute("currentTime", systemInfoService.getCurrentTime());

        return "index";

    }

}