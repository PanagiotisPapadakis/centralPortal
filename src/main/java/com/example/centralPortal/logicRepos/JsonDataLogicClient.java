package com.example.centralPortal.logicRepos;

import com.example.centralPortal.config.FeignConfig;
import com.example.centralPortal.modelCopy.PropertyApartment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "jsonData",
        url = "http://localhost:8082",
        configuration = FeignConfig.class
)
public interface JsonDataLogicClient {


    @GetMapping("/api/json/records")
    List<PropertyApartment> getAllApartments();


}
