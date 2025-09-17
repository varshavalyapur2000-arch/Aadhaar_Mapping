package com.jsp.pa.person_aadhaar_springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aadhaar")
public class AadhaarController {
	
	@Autowired
	private AadhaarService  aadhaarService;
	
	@PostMapping
	public String saveAadhaar(@RequestBody Aadhaar aadhaar) {
		return aadhaarService.saveAadhaar(aadhaar);
	}
    @GetMapping("/{id}")
    public Aadhaar getAadhaar(@PathVariable int id) {
        return aadhaarService.getAadhaarg(id);
    }

    @GetMapping
    public List<Aadhaar> getAll() {
        return aadhaarService.getAllAadhaars();
    }

    @PutMapping
    public Aadhaar update(@RequestBody Aadhaar aadhaar) {
        return aadhaarService.updateAadhaar(aadhaar);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
    	aadhaarService.deleteAadhaar(id);
    }

}
