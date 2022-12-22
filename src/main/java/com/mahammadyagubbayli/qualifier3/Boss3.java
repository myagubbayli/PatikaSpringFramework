package com.mahammadyagubbayli.qualifier3;

@QualifierMultiple2(EMoreOptions.SECOND)
public class Boss3 implements BossInterface {

    @Override
    public String version(String data) {
        return "QualifierMultiple ENUM SECOND: " + data;
    }
}

