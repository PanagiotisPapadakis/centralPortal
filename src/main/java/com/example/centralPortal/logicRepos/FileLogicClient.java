package com.example.centralPortal.logicRepos;

import com.example.centralPortal.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(
        name = "fileLogic",
        url = "http://localhost:8081",
        configuration = FeignConfig.class
)
public interface FileLogicClient {

    // Upload a file: POST /files/upload
    @PostMapping(value = "/files/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String uploadFile(@RequestPart("file") MultipartFile file);

    // List uploaded files: GET /files/list
    @GetMapping("/files/list")
    List<String> listFiles();



}
