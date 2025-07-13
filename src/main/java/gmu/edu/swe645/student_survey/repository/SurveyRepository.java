package gmu.edu.swe645.student_survey.repository;

import gmu.edu.swe645.student_survey.model.SurveyEntry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<SurveyEntry, Long> {

}
