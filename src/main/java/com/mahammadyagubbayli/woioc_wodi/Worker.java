package com.mahammadyagubbayli.woioc_wodi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "workerWocdi")
@ApplicationScoped
public class Worker {

    private Boss boss;

    // constructor without parameter
    public Worker() {
        boss = new Boss();
    }

    public String getData(String data) {
        return boss.version(data);
    }
}
