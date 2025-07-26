package gmu.edu.swe645.student_survey;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentSurveyApplication {
	public static void main(String[] args) {
		System.out.println("Starting application...");
		SpringApplication.run(StudentSurveyApplication.class, args);
	}
}