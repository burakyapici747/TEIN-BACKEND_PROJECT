package com.example.TeinProject.repository;

import com.example.TeinProject.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdmin extends JpaRepository<Admin, Long> {

    Admin getAdminByNameAndPassword(String name, String password);

}
