package com.mjp.springboot.service.impl;

import com.mjp.springboot.entity.Applicant;
import com.mjp.springboot.repository.ApplicantRepository;
import com.mjp.springboot.service.ApplicantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    private ApplicantRepository applicantRepository;

    public ApplicantServiceImpl(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @Override
    public List<Applicant> searchApplicants(String query) {
       List<Applicant> applicant = applicantRepository.searchApplicants(query);
       return applicant;
    }

    @Override
    public Applicant createApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    public void deleteApplicant(Applicant applicant) {
        applicantRepository.delete(applicant);
    }
}
