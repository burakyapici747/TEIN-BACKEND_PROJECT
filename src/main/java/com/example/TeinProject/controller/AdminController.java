package com.example.TeinProject.controller;

import com.example.TeinProject.result.Result;
import com.example.TeinProject.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping(path = "/admin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AdminController {

    private final AdminService adminService;

    @GetMapping(path = "/login/{name}/{password}")
    public ResponseEntity<Result> login(@PathVariable String name, @PathVariable String password){
        return ResponseEntity.ok().body(adminService.login(name, password));
    }


}
