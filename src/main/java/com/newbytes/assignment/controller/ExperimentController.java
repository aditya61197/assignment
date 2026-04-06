package com.newbytes.assignment.controller;

import org.springframework.web.bind.annotation.RestController;

import com.newbytes.assignment.serviceImpl.ExperimentServiceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ExperimentController {

    private final ExperimentServiceImpl experimentServiceImpl;

    public ExperimentController (ExperimentServiceImpl experimentServiceImpl){
        this.experimentServiceImpl = experimentServiceImpl;
    }

    @GetMapping("experiment")
    public ResponseEntity<Map<String,String>> experimentHandler(@RequestParam(value = "user_id") Integer userId) {
        Map<String, String> map = experimentServiceImpl.dicideVariant(userId);
        return new ResponseEntity(map, HttpStatus.OK);
    }

    @GetMapping("experiment1/{userId}/{name}") //example for Path Variable
    public ResponseEntity<Map<String,String>> experimentHandler2(@PathVariable Integer userId, @PathVariable String name) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Id", String.valueOf(userId));
        map.put("Name", name);
        return new ResponseEntity(map, HttpStatus.OK);
    }
    
}