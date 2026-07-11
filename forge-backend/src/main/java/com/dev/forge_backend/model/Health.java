package com.dev.forge_backend.model;

public class Health {
    private String status;
    private String service;

    public Health(String status,String service) {
        this.status = status;
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public String getService() {
        return service;
    }
}
