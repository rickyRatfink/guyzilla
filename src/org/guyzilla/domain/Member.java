package org.guyzilla.domain;

// Generated Nov 26, 2013 10:21:56 AM by Hibernate Tools 3.4.0.CR1

/**
 * Member generated by hbm2java
 */
public class Member implements java.io.Serializable {

	private Long memberId;
	private String username;
	private String password;
	private String email;
	private String birthdate;
	private String country;
	private String state;
	private String city;
	private String postalCode;
	private String ethnicity;
	private String role;
	private String height;
	private String weight;
	private String eyecolor;
	private String haircolor;
	private String buildType;
	private String bodyArt;
	private String status;
	private String endowment;
	private String description;
	private byte[] photo;
	private String creationDate;
	private String lastUpdateDate;

	public Member() {
	}

	public Member(String username, String password, String email,
			String birthdate, String country, String state, String city,
			String postalCode, String ethnicity, String role, String height,
			String weight, String eyecolor, String haircolor, String buildType,
			String bodyArt, String status, String endowment,
			String description, byte[] photo, String creationDate,
			String lastUpdateDate) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.birthdate = birthdate;
		this.country = country;
		this.state = state;
		this.city = city;
		this.postalCode = postalCode;
		this.ethnicity = ethnicity;
		this.role = role;
		this.height = height;
		this.weight = weight;
		this.eyecolor = eyecolor;
		this.haircolor = haircolor;
		this.buildType = buildType;
		this.bodyArt = bodyArt;
		this.status = status;
		this.endowment = endowment;
		this.description = description;
		this.photo = photo;
		this.creationDate = creationDate;
		this.lastUpdateDate = lastUpdateDate;
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getEyecolor() {
		return this.eyecolor;
	}

	public void setEyecolor(String eyecolor) {
		this.eyecolor = eyecolor;
	}

	public String getHaircolor() {
		return this.haircolor;
	}

	public void setHaircolor(String haircolor) {
		this.haircolor = haircolor;
	}

	public String getBuildType() {
		return this.buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}

	public String getBodyArt() {
		return this.bodyArt;
	}

	public void setBodyArt(String bodyArt) {
		this.bodyArt = bodyArt;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEndowment() {
		return this.endowment;
	}

	public void setEndowment(String endowment) {
		this.endowment = endowment;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

}
