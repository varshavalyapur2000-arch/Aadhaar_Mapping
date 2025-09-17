package com.jsp.pa.person_aadhaar_springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadhaarDao extends JpaRepository<Aadhaar,Integer>{

}
