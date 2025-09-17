package com.jsp.pa.person_aadhaar_springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AadhaarService {

	@Autowired
	private AadhaarDao aadhaarDao;
	
	public String saveAadhaar(Aadhaar aadhaar){
	    aadhaarDao.save(aadhaar);
		return "Aadhaar saved";
	}
	
	public Aadhaar getAadhaarg(int id) {
		return aadhaarDao.findById(id).orElse(null);
	}
	
	 public List<Aadhaar> getAllAadhaars() {
	        return aadhaarDao.findAll();
	    }

	    public Aadhaar updateAadhaar(Aadhaar aadhaar) {
	        return aadhaarDao.save(aadhaar);
	    }

	    public void deleteAadhaar(int id) {
	        aadhaarDao.deleteById(id);
	    }
}
