package com.codecoconut.Department.Basic.Project.repositoty;

import com.codecoconut.Department.Basic.Project.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositoty extends JpaRepository<DepartmentEntity,Long> {
}
