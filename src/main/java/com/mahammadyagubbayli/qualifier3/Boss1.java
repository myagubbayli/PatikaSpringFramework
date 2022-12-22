package com.mahammadyagubbayli.qualifier3;

import javax.enterprise.inject.Default;

@Default
public class Boss1 implements BossInterface {

    // @Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    @Override
    public String version(String data) {
        return "default data:  " + data;
    }
}

