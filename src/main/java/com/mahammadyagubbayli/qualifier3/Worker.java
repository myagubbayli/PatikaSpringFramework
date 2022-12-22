package com.mahammadyagubbayli.qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Worker {

    // defaultda çalışacak kodlar
    // @Inject
    // private BossInterface bossInterface;

    // istediğim seçeneği seçiyorum
    // @Inject
    // @QualifierMultiple2(EMoreOptions.FIRST)
    // private BossInterface bossInterface;

    // istediğim seçeneği seçiyorum
    @Inject
    @QualifierMultiple2(EMoreOptions.SECOND)
    private BossInterface bossInterface;


    public String getData(String data) {
        return bossInterface.version(data);
    }
}
