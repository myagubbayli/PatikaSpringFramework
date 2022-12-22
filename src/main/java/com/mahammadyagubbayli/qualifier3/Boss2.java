package com.mahammadyagubbayli.qualifier3;

@QualifierMultiple2(EMoreOptions.FIRST)
public class Boss2 implements BossInterface {

    @Override
    public String version(String data) {
        return "QualifierMultiple ENUM FIRST: " + data;
    }
}

