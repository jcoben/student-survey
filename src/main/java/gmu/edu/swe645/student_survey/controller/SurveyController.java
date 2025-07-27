package gmu.edu.swe645.student_survey.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gmu.edu.swe645.student_survey.service.SurveyService;
import gmu.edu.swe645.student_survey.model.SurveyEntry;

@RestController
public class SurveyController {
	
	private SurveyService surveyService;
	
	//inject surveyService object using constructor based dependency injection
	public SurveyController(SurveyService surveyService) {
		super();
		this.surveyService = surveyService;
	}

	@CrossOrigin	
	@PostMapping("/survey")
	public ResponseEntity<SurveyEntry> saveEntry(@RequestBody SurveyEntry surveyEntry) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println("Got POST request!");
	
	        try {
			System.out.println(surveyEntry.getCity());
			System.out.println(objectMapper.writeValueAsString(surveyEntry));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<SurveyEntry>(surveyService.saveEntry(surveyEntry), HttpStatus.CREATED);
	}
	
	@CrossOrigin
	@GetMapping("/survey")
	public List<SurveyEntry> getAllEntries() {
		System.out.println("Got request for all entries.");
		return surveyService.getAllEntries();
	}
	
	@CrossOrigin
	@GetMapping("/survey/{id}")
	public ResponseEntity<SurveyEntry> getEntryById(@PathVariable("id") long entryId) {
		return new ResponseEntity<SurveyEntry>(surveyService.getEntryById(entryId), HttpStatus.OK);
	}

	@CrossOrigin
	@PutMapping("/survey/{id}")
	public ResponseEntity<SurveyEntry> updateEntry(@PathVariable("id") long id, @RequestBody SurveyEntry entry) {
		return new ResponseEntity<SurveyEntry>(surveyService.updateEntry(entry, id), HttpStatus.OK);
	}
	
	@CrossOrigin
	@DeleteMapping("/survey/{id}")
	public ResponseEntity<String> deleteEntry(@PathVariable("id") long id) {
		surveyService.deleteEntry(id);
		
		return new ResponseEntity<String>("Entry deleted successfully.", HttpStatus.OK);
	}
}
