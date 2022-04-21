package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.job_provider.Employer;

@Repository
@Component
public interface Employer_repository extends JpaRepository<Employer,Integer> {

}
