package gmu.edu.swe645.student_survey.service;

import java.util.List;

import gmu.edu.swe645.student_survey.model.SurveyEntry;

public interface SurveyService {
	SurveyEntry saveEntry(SurveyEntry entry);
	List<SurveyEntry> getAllEntries();
	SurveyEntry getEntryById(long id);
	SurveyEntry updateEntry(SurveyEntry entry, long id);
	void deleteEntry(long id);
}
