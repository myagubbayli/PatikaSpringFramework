package com.mahammadyagubbayli.iocdi;

public class Boss implements BossInterface {

    @Override
    public String version(String data) {
        return "version " + data;
    }
}

