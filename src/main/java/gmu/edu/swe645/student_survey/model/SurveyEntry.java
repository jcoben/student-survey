package gmu.edu.swe645.student_survey.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="surveyEntries")
public class SurveyEntry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", nullable=false)
	private String fName;
	
	@Column(name="last_name", nullable=false)
	private String lName;
	
	@Column(name="street_address", nullable=false)
	private String streetAddress;
	
	@Column(name="city", nullable=false)
	private String city;
	
	@Column(name="state", nullable=false)
	private String state;
	
	@Column(name="zip", nullable=false)
	private String zip;
	
	@Column(name="telephone", nullable=false)
	private String telephone;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="date", nullable=false)
	private String date;
	
	@Column(name="like_students", nullable=false)
	private String likeStudents;
	
	@Column(name="like_location", nullable=false)
	private String likeLocation;
	
	@Column(name="like_atmos", nullable=false)
	private String likeAtmos;
	
	@Column(name="like_dorms", nullable=false)
	private String likeDorms;
	
	@Column(name="like_sports", nullable=false)
	private String likeSports;
	
	@Column(name="interest_friends", nullable=false)
	private String interestFriends;
	
	@Column(name="interest_tv", nullable=false)
	private String interestTv;
	
	@Column(name="interest_internet", nullable=false)
	private String interestInternet;
	
	@Column(name="interest_other", nullable=false)
	private String interestOther;
	
	@Column(name="likely", nullable=false)
	private String likely;
	
	@Column(name="raffle", nullable=false)
	private String raffle;
	
	@Column(name="comment", nullable=false)
	private String comment;
	
	public void update(SurveyEntry entry) {
		this.fName = entry.fName;
		this.lName = entry.lName;
		this.streetAddress = entry.streetAddress;
		this.city = entry.city;
		this.state = entry.state;
		this.zip = entry.zip;
		this.telephone = entry.telephone;
		this.email = entry.email;
		this.date = entry.date;
		this.likeStudents = entry.likeStudents;
		this.likeLocation = entry.likeLocation;
		this.likeAtmos = entry.likeAtmos;
		this.likeDorms = entry.likeDorms;
		this.likeSports = entry.likeSports;
		this.interestFriends = entry.interestFriends;
		this.interestTv = entry.interestTv;
		this.interestInternet = entry.interestInternet;
		this.interestOther = entry.interestOther;
		this.likely = entry.likely;
		this.raffle = entry.raffle;
		this.comment = entry.comment;
	}
}
