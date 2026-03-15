package com.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.clinic.model.Patient;

/**
 * Repository for accessing Patient data.
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

    /**
     * Retrieve a patient by email address.
     */
    Patient findByEmail(String email);

    /**
     * Retrieve patient by email OR phone number.
     */
    @Query("SELECT p FROM Patient p WHERE p.email=?1 OR p.phone=?2")
    Patient findByEmailOrPhone(String email,String phone);
}
