package com.codecoconut.Department.Basic.Project.service;

import com.codecoconut.Department.Basic.Project.entity.DepartmentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {

    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity);

   public List<DepartmentEntity> getAllDepartments();

   public DepartmentEntity getDepartmentById(Long departmentid);

   public void deleteDepartmentById(Long departmentid);
}
