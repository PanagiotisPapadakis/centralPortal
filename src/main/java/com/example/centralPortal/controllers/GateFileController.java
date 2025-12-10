package com.example.centralPortal.controllers;

import com.example.centralPortal.logicRepos.FileLogicClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("files")
public class GateFileController {
    private final FileLogicClient fileLogicClient;

    public GateFileController(FileLogicClient fileLogicClient) {
        this.fileLogicClient = fileLogicClient;
    }

    @PostMapping("/upload")
    public String upload(@RequestPart("file")MultipartFile file) {
        return fileLogicClient.uploadFile(file);
    }

//    @GetMapping("/list")
//    public List<String> listFiles() {
//        return fileLogicClient.listFiles();
//    }

    @GetMapping("/list")
    public ResponseEntity<List<String>> listFiles() {
        return ResponseEntity.ok(fileLogicClient.listFiles());
    }


}
