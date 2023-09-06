package com.example.TeinProject.service;

import com.example.TeinProject.model.AnnualPermission;
import com.example.TeinProject.repository.AnnualPermissionRepository;
import com.example.TeinProject.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class AnnualPermissionService {

    private final AnnualPermissionRepository iannualPermission;



    public Result<List<AnnualPermission>> getAll(){
        return new Result<List<AnnualPermission>>(false,this.iannualPermission.findAll(), "");
    }

    public Result<List<AnnualPermission>> getAllByEmployeeId(Long employeeId){
        return new Result<List<AnnualPermission>>(false,this.iannualPermission.getAllByEmployeeId(employeeId), "");
    }

    public Result<AnnualPermission> create(AnnualPermission annualPermission)
    {
        return new Result<AnnualPermission>(false, iannualPermission.save(annualPermission), "İzin başarıyla oluşturuldu.");
    }


    public Result<AnnualPermission> save(AnnualPermission annualPermission)
    {
        return new Result<AnnualPermission>(false, iannualPermission.save(annualPermission), "İzin başarıyla oluşturuldu.");
    }


    public Result<Boolean> delete(Long id){
        iannualPermission.deleteById(id);
        return new Result<Boolean>(false, true , "İzin talebi başarıyla silindi.");
    }

}
