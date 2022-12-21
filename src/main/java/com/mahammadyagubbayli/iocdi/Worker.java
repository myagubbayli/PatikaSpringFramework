package com.mahammadyagubbayli.iocdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "workerIOCDI")
@ApplicationScoped
public class Worker {

    @Inject
    private BossInterface bossInterface;

    // constructor without parameter
    public Worker() {
        // bossInterface = new Boss();
    }

    public String getData(String data) {
        return bossInterface.version(data);
    }
}
