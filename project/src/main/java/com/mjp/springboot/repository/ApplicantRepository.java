package com.mjp.springboot.repository;

import com.mjp.springboot.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    @Query("SELECT o FROM Applicant o WHERE o.firstName LIKE CONCAT('%', :query, '%' ) OR o.lastName LIKE CONCAT('%', :query, '%' ) OR o.dob LIKE CONCAT('%', :query, '%' )")
    List<Applicant> searchApplicants(String query);



}
