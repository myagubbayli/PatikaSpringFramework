package com.mahammadyagubbayli.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss1 implements BossInterface {

    // @Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    @Override
    public String version(String data) {
        return "boss 1 " + data;
    }
}

