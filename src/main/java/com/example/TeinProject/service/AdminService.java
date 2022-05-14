package com.example.TeinProject.service;


import com.example.TeinProject.model.Admin;
import com.example.TeinProject.repository.IAdmin;
import com.example.TeinProject.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final IAdmin iadmin;

    public Result<Admin> login(String name, String password)
    {
        Admin admin = this.iadmin.getAdminByNameAndPassword(name, password);

        if(admin == null){
            return new Result<Admin>(false,null , "Kullanıcı adı veya parola hatalı");
        }
        return new Result<Admin>(false, admin , "Giriş başarılı");
    }


}
