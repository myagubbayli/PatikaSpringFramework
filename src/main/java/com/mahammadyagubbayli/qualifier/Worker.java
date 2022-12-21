package com.mahammadyagubbayli.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Worker {

    // defaultda çalışacak kodlar
    // @Inject
    // private BossInterface bossInterface;

    // defaultda çalışacak kodlar
    @Inject
    @QualifierMultiple
    private BossInterface bossInterface;


    public String getData(String data) {
        return bossInterface.version(data);
    }
}
