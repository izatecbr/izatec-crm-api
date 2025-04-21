package com.izatec.crm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements ApplicationRunner {
    @Autowired
    private ClienteService service;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //service.criarClientes();
    }
}
