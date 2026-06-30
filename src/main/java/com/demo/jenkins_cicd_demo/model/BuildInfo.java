package com.demo.jenkins_cicd_demo.model;

public class BuildInfo {

    private final String applicationName;
    private final String version;
    private final String environment;
    private final String buildNumber;

    public BuildInfo() {

        applicationName = "Corporate Jenkins CI/CD Demo";

        version = "1.0.0";

        environment = "Development";

        buildNumber = "LOCAL";

    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getVersion() {
        return version;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

}