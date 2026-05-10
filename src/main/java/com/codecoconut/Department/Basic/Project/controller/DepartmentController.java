package com.codecoconut.Department.Basic.Project.controller;

import com.codecoconut.Department.Basic.Project.entity.DepartmentEntity;
import com.codecoconut.Department.Basic.Project.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity departmentEntity) {
        return departmentService.saveDepartment(departmentEntity);

    }

    @GetMapping("/departments")
  public List<DepartmentEntity> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public DepartmentEntity getDepartmentById(@PathVariable("id") Long departmentid) {

        return departmentService.getDepartmentById(departmentid);
    }


}
