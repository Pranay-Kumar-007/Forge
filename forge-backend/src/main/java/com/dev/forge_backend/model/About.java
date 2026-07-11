package com.dev.forge_backend.model;

public class About {
    private String appName;
    private String version;
    private String author;

    public About(String appName, String version, String author) {
        this.appName = appName;
        this.version = version;
        this.author = author;
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public String getAuthor() {
        return author;
    }
}
