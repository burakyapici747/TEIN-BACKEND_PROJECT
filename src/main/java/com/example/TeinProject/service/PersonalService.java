package com.example.TeinProject.service;


import com.example.TeinProject.model.Employee;
import com.example.TeinProject.repository.EmployeeRepository;
import com.example.TeinProject.result.Result;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class PersonalService {

    private final EmployeeRepository iPersonal;

    public Result<Employee> getPersonalByNameAndPassword(String name, String password){
        Employee employee = iPersonal.getEmployeeByNameAndPassword(name, password);
        if(employee == null){
            return new Result<Employee>(false, null, "Kullanıcı adı veya şifre hatalı!");
        }
        return new Result<Employee>(false, employee, "Giriş başarılı!");
    }




}