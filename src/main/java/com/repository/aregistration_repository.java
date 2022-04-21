package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.registration.applicant_registration;

@Repository
@Component
public interface aregistration_repository extends JpaRepository<applicant_registration,Integer> {

}
