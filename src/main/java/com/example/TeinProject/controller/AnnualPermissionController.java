package com.example.TeinProject.controller;


import com.example.TeinProject.model.AnnualPermission;
import com.example.TeinProject.result.Result;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.TeinProject.service.AnnualPermissionService;

@RestController
@RequestMapping(path = "/permissions")
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AnnualPermissionController {
    private final AnnualPermissionService annualPermissionService;

    @GetMapping(path = "/")
    public ResponseEntity<Result> getAll(){
        return ResponseEntity.ok().body(this.annualPermissionService.getAll());
    }

    @GetMapping(path = "/getPermissionsByEmployeeId/{employeeId}")
    public ResponseEntity<Result> getAllByEmployeeId(@PathVariable Long employeeId){
        return ResponseEntity.ok().body(this.annualPermissionService.getAllByEmployeeId(employeeId));
    }


    @PostMapping(path = "/create")
    public ResponseEntity<Result> create(@RequestBody AnnualPermission annualPermission){
        return ResponseEntity.ok().body(annualPermissionService.create(annualPermission));
    }


    @PutMapping(path = "/save")
    public ResponseEntity<Result> save(@RequestBody AnnualPermission annualPermission){
        return ResponseEntity.ok().body(annualPermissionService.save(annualPermission));
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Result> delete(@PathVariable Long id){
        return ResponseEntity.ok().body(annualPermissionService.delete(id));
    }


}
