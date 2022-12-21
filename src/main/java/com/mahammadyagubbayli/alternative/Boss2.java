package com.mahammadyagubbayli.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss2 implements BossInterface {

    @Override
    public String version(String data) {
        return "boss 2 " + data;
    }
}

