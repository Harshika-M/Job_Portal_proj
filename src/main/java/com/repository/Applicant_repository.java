package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.job_seeker.Applicant;

@Repository
@Component
public interface Applicant_repository extends JpaRepository<Applicant,Integer>{

}
