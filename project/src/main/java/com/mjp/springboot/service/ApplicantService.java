package com.mjp.springboot.service;

import com.mjp.springboot.entity.Applicant;

import java.util.List;

public interface ApplicantService {

    List<Applicant> searchApplicants(String query);

    Applicant createApplicant(Applicant applicant);

}
