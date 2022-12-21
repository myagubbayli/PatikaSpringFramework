package com.mahammadyagubbayli.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Boss1 implements BossInterface {

    // @Alternative:
    @Override
    public String version(String data) {
        return "boss 1 " + data;
    }
}

