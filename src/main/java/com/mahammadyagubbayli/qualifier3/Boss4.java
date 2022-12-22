package com.mahammadyagubbayli.qualifier3;

@QualifierMultiple2(EMoreOptions.THIRD)
public class Boss4 implements BossInterface {

    @Override
    public String version(String data) {
        return "QualifierMultiple ENUM THIRD: " + data;
    }
}

