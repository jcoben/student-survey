package gmu.edu.swe645.student_survey.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import gmu.edu.swe645.student_survey.model.SurveyEntry;
import gmu.edu.swe645.student_survey.repository.SurveyRepository;
import gmu.edu.swe645.student_survey.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService{

	private final SurveyRepository surveyRepository;
	
	public SurveyServiceImpl(SurveyRepository surveyRepository) {
		super();
		this.surveyRepository = surveyRepository;
	}

	@Override
	public SurveyEntry saveEntry(SurveyEntry entry) {
		return surveyRepository.save(entry);
	}

	@Override
	public List<SurveyEntry> getAllEntries() {
		return surveyRepository.findAll();
	}

	@Override
	public SurveyEntry getEntryById(long id) {
		Optional<SurveyEntry> entry = surveyRepository.findById(id);
		
		if (entry.isPresent()) {
			return entry.get();
		} else {
			throw new IllegalArgumentException("Entry not found with this id.");
		}
	}

	@Override
	public SurveyEntry updateEntry(SurveyEntry entry, long id) {
		SurveyEntry existingEntry = surveyRepository.findById(id).orElseThrow(
				() -> new IllegalArgumentException("Entry not found with this id."));
		
		existingEntry.update(entry);
		
		//save to database
		surveyRepository.save(existingEntry);
		
		return existingEntry;
	}

	@Override
	public void deleteEntry(long id) {
		surveyRepository.deleteById(id);
	}

}
