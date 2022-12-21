package com.mahammadyagubbayli.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class _03_Inject {

    @Inject
    List<String> consumer;

    public List<String> getConsumer() {
        return consumer;
    }
}
