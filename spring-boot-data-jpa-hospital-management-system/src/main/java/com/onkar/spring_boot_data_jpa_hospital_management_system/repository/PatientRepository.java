package com.onkar.spring_boot_data_jpa_hospital_management_system.repository;

import com.onkar.spring_boot_data_jpa_hospital_management_system.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
