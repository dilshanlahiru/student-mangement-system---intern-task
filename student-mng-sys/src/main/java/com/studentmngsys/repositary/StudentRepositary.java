package com.studentmngsys.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.studentmngsys.entity.Student;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Long> {

} 
