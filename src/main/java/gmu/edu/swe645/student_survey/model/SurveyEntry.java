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


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLikeStudents() {
		return likeStudents;
	}

	public void setLikeStudents(String likeStudents) {
		this.likeStudents = likeStudents;
	}

	public String getLikeLocation() {
		return likeLocation;
	}

	public void setLikeLocation(String likeLocation) {
		this.likeLocation = likeLocation;
	}

	public String getLikeAtmos() {
		return likeAtmos;
	}

	public void setLikeAtmos(String likeAtmos) {
		this.likeAtmos = likeAtmos;
	}

	public String getLikeDorms() {
		return likeDorms;
	}

	public void setLikeDorms(String likeDorms) {
		this.likeDorms = likeDorms;
	}

	public String getLikeSports() {
		return likeSports;
	}

	public void setLikeSports(String likeSports) {
		this.likeSports = likeSports;
	}

	public String getInterestFriends() {
		return interestFriends;
	}

	public void setInterestFriends(String interestFriends) {
		this.interestFriends = interestFriends;
	}

	public String getInterestTv() {
		return interestTv;
	}

	public void setInterestTv(String interestTv) {
		this.interestTv = interestTv;
	}

	public String getInterestInternet() {
		return interestInternet;
	}

	public void setInterestInternet(String interestInternet) {
		this.interestInternet = interestInternet;
	}

	public String getInterestOther() {
		return interestOther;
	}

	public void setInterestOther(String interestOther) {
		this.interestOther = interestOther;
	}

	public String getLikely() {
		return likely;
	}

	public void setLikely(String likely) {
		this.likely = likely;
	}

	public String getRaffle() {
		return raffle;
	}

	public void setRaffle(String raffle) {
		this.raffle = raffle;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
