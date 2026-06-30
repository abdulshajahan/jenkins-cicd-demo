package com.demo.jenkins_cicd_demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${app.version}")
    private String version;

    @Value("${app.environment}")
    private String environment;

    @Value("${app.company}")
    private String company;

    @Value("${app.owner}")
    private String owner;

    public String getApplicationName() {
        return applicationName;
    }

    public String getVersion() {
        return version;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getCompany() {
        return company;
    }

    public String getOwner() {
        return owner;
    }
}