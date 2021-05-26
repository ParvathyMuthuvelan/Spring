package com.training.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.restservice.Person;
import com.training.exception.InvalidIdException;
import com.training.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	private static final Logger LOG = LoggerFactory.getLogger(PersonController.class);
	public PersonController() {

	}

	@DeleteMapping("/persons/{id}")
	// @RequestMapping(value = "/persons/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deletePerson(@PathVariable("id") int id) {
		personService.remove(id);
		return new ResponseEntity<>("Person is deleted successsfully", HttpStatus.OK);
	}

	@PutMapping("/persons/{id}")
	// @RequestMapping(value = "/persons/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> updatePerson(@PathVariable("id") int id, @RequestBody Person person) {
		// personService.remove(id);
		// person.setId(id);

		personService.put(id, person);
		return new ResponseEntity<>("Person is updated successsfully", HttpStatus.OK);
	}

	@PostMapping("/persons/add")
	//@RequestMapping(value = "/persons", method = RequestMethod.POST)
	public ResponseEntity<Object> createPerson(@Valid @RequestBody Person person) {
		/*ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		 
		    // Validation is done against the annotations defined in person bean 
	
		Set<ConstraintViolation<Person>> violations=validator.validate(person);
	List<String> errors=new ArrayList<String>(); 
for (ConstraintViolation<Person> violation:violations){ 
	errors.add(violation.getMessage()); 
} 
			 
			      // Throw exception so that the user of this web service receives appropriate error message
			      if(violations.size()>0)
			      {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,errors.toString()); 
			      }
			      else
			      {*/

		personService.put(person.getId(), person);
			     
		return new ResponseEntity<>("Person is created successfully", HttpStatus.CREATED);
			   //   }
	}

	@GetMapping("/persons")
	// @RequestMapping(value = "/persons")
	public ResponseEntity<Object> getPerson() {
		LOG.info("PersonController initialized");
		return new ResponseEntity<>(personService.getAll(), HttpStatus.OK);
	}

	@GetMapping("/persons/{id}")
	public Person findPersonById(@PathVariable(value = "id") int id) throws InvalidIdException {
		LOG.info("PersonController initialized");
		Person person = personService.findById(id);

		return person;
//		if (person != null) {
//			return ResponseEntity.ok().body(person);
//		} else {
//			return ResponseEntity.notFound().build();
//		}
	}
}
