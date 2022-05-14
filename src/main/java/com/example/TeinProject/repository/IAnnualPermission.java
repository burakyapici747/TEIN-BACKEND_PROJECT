package com.example.TeinProject.repository;

import com.example.TeinProject.model.AnnualPermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAnnualPermission extends JpaRepository<AnnualPermission, Long> {


    //tüm izinleri al
    List<AnnualPermission> findAll();


    //personelin izinlerini al
    List<AnnualPermission> getAllByEmployeeId(Long employeeId);





}
