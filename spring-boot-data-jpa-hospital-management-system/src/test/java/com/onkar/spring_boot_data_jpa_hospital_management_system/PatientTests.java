package com.onkar.spring_boot_data_jpa_hospital_management_system;

import com.onkar.spring_boot_data_jpa_hospital_management_system.entity.Patient;
import com.onkar.spring_boot_data_jpa_hospital_management_system.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientTests {
    @Autowired
    private PatientRepository patientRepository;
    @Test
    public void testPatientRepository(){
        List<Patient> patientList =patientRepository.findAll();
        System.out.println(patientList);

    }
}
