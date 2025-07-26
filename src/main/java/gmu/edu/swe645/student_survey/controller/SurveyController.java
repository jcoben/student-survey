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
	
	@PostMapping("/survey")
	public ResponseEntity<SurveyEntry> saveEntry(@RequestBody SurveyEntry surveyEntry) {
		return new ResponseEntity<SurveyEntry>(surveyService.saveEntry(surveyEntry), HttpStatus.CREATED);
	}
	
	@GetMapping("/survey")
	public List<SurveyEntry> getAllEntries() {
		System.out.println("Got request for all entries.");
		return surveyService.getAllEntries();
	}
	
	@GetMapping("/survey/{id}")
	public ResponseEntity<SurveyEntry> getEntryById(@PathVariable("id") long entryId) {
		return new ResponseEntity<SurveyEntry>(surveyService.getEntryById(entryId), HttpStatus.OK);
	}

	@PutMapping("/survey/{id}")
	public ResponseEntity<SurveyEntry> updateEntry(@PathVariable("id") long id, @RequestBody SurveyEntry entry) {
		return new ResponseEntity<SurveyEntry>(surveyService.updateEntry(entry, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/survey/{id}")
	public ResponseEntity<String> deleteEntry(@PathVariable("id") long id) {
		surveyService.deleteEntry(id);
		
		return new ResponseEntity<String>("Entry deleted successfully.", HttpStatus.OK);
	}
}
