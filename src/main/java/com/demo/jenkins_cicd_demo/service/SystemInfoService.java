package com.demo.jenkins_cicd_demo.service;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.time.LocalDateTime;

@Service
public class SystemInfoService {

    public String getHostName() {

        try {

            return InetAddress.getLocalHost().getHostName();

        }

        catch (Exception ex) {

            return "Unknown";

        }

    }

    public String getIPAddress() {

        try {

            return InetAddress.getLocalHost().getHostAddress();

        }

        catch (Exception ex) {

            return "Unknown";

        }

    }

    public String getJavaVersion() {

        return System.getProperty("java.version");

    }

    public String getOperatingSystem() {

        return System.getProperty("os.name");

    }

    public String getUserName() {

        return System.getProperty("user.name");

    }

    public int getProcessors() {

        return Runtime.getRuntime().availableProcessors();

    }

    public long getMaximumMemory() {

        return Runtime.getRuntime().maxMemory() / 1024 / 1024;

    }

    public LocalDateTime getCurrentTime() {

        return LocalDateTime.now();

    }

}