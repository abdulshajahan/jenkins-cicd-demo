package com.demo.jenkins_cicd_demo.service;

import com.demo.jenkins_cicd_demo.config.ApplicationProperties;
import com.demo.jenkins_cicd_demo.model.BuildInfo;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    private final ApplicationProperties properties;

    public DashboardService(ApplicationProperties properties) {
        this.properties = properties;
    }

    public BuildInfo getBuildInformation() {

        BuildInfo info = new BuildInfo();

        info.setApplicationName(properties.getApplicationName());

        info.setVersion(properties.getVersion());

        info.setEnvironment(properties.getEnvironment());

        info.setCompany(properties.getCompany());

        info.setOwner(properties.getOwner());

        info.setBuildNumber("LOCAL");

        return info;
    }

}