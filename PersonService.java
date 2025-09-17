package com.jsp.pa.person_aadhaar_springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private AadhaarDao aadhaarDao;
	
	public Person savePerson(Person person, int aid) {
        Aadhaar aadhaar = aadhaarDao.findById(aid).orElse(null);
        if (aadhaar != null) {
            person.setAadhaar(aadhaar);
            return personDao.save(person);
        }
        return null;
    }

    public Person getPersonById(int id) {
        return personDao.findById(id).orElse(null);
    }

    public List<Person> getAllPersons() {
        return personDao.findAll();
    }

    public Person updatePerson(Person person, int aid) {
        Aadhaar aadhaar = aadhaarDao.findById(aid).orElse(null);
        if (aadhaar != null) {
            person.setAadhaar(aadhaar);
            return personDao.save(person);
        }
        return null;
    }

    public void deletePerson(int id) {
        personDao.deleteById(id);
    }
}

