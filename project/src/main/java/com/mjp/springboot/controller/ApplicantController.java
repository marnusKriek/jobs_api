package com.mjp.springboot.controller;

import com.mjp.springboot.entity.Applicant;
import com.mjp.springboot.service.ApplicantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/applicants")
public class ApplicantController {

    private ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/searchApplicants")
    public ResponseEntity<List<Applicant>> searchApplicants(@RequestParam("query") String query){
        return ResponseEntity.ok(applicantService.searchApplicants(query));
    }

    @PostMapping("/createApplicant")
    public Applicant createApplicant(@RequestBody Applicant applicant){
        return applicantService.createApplicant(applicant);
    }
}
