package com.simpleform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpleform.entity.FormEntity;
import com.simpleform.repository.FormRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/api/users")
public class FormController {
	 @Autowired
	    private FormRepository formRepository;

	    @GetMapping
	    public List<FormEntity> getAllUsers() {
	        return formRepository.findAll();
	    }
	    
	    @PostMapping("/save")
		public FormEntity saveForm(@RequestBody FormEntity form) {
			return formRepository.save(form);
		}
	    
	    @DeleteMapping("/{id}")
	    public void deleteUser(@PathVariable int id) {
	    	formRepository.deleteById(id);
	    }
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<FormEntity> updateUser(@PathVariable int id, @RequestBody FormEntity form) {
	    	//FormEntity existingForm = formRepository.findById(id).
	        FormEntity existingForm = formRepository.findById(id).orElse(null);
	        FormEntity updatedForm = formRepository.save(form);

			return null;
	    }
}

