package com.codecoconut.Department.Basic.Project.service;

import com.codecoconut.Department.Basic.Project.entity.DepartmentEntity;
import com.codecoconut.Department.Basic.Project.repositoty.DepartmentRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    private DepartmentRepositoty departmentRepositoty;

    @Override
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {
        return departmentRepositoty.save(departmentEntity);
    }

    @Override
    public List<DepartmentEntity> getAllDepartments() {
        return departmentRepositoty.findAll();
    }

    @Override
    public DepartmentEntity getDepartmentById(Long departmentid) {
        return departmentRepositoty.findById(departmentid).get();
    }
}
