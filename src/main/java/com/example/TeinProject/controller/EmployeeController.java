package com.example.TeinProject.controller;

import com.example.TeinProject.model.Employee;
import com.example.TeinProject.result.Result;
import com.example.TeinProject.service.PersonalService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping(path = "/employee")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {

    private final PersonalService personalService;

    @GetMapping(path = "/login/{name}/{password}")
    public ResponseEntity<Result> login(@PathVariable String name, @PathVariable String password){
        return  ResponseEntity.ok().body(personalService.getPersonalByNameAndPassword(name, password));
    }

}
