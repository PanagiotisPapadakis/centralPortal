package com.example.centralPortal.controllers;

import com.example.centralPortal.logicRepos.JsonDataLogicClient;
import com.example.centralPortal.modelCopy.PropertyApartment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/json")
public class GateJsonController {
    private final JsonDataLogicClient jsonDataLogicClient;

    public GateJsonController(JsonDataLogicClient jsonDataLogicClient) {
        this.jsonDataLogicClient = jsonDataLogicClient;
    }

    @GetMapping("/records")
    public List<PropertyApartment> listApartments() {
        return jsonDataLogicClient.getAllApartments();
    }
}
