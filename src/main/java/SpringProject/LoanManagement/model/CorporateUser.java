package SpringProject.LoanManagement.model;

import java.util.Arrays;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
@DynamicUpdate
public class CorporateUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(length = 100, nullable = false)
	private String userName;
	
	@Column(length = 100, nullable = false)
	private String[] directors;
	
	@Column(length = 100, nullable = false)
	private String websiteLink;
	
	@Column(length = 100, nullable = false)
	private String natureOfBusiness;
	
	@Lob
    private byte[] register;

    @Lob
    private byte[] uploadDocs;

	@Column(length = 500, nullable = false)    
    private String loansRequirementsInBrief;

	@Override
	public String toString() {
		return "CorporateUser [userId=" + userId + ", userName=" + userName + ", directors="
				+ Arrays.toString(directors) + ", websiteLink=" + websiteLink + ", natureOfBusiness=" + natureOfBusiness
				+ ", register=" + Arrays.toString(register) + ", uploadDocs=" + Arrays.toString(uploadDocs)
				+ ", loansRequirementsInBrief=" + loansRequirementsInBrief + ", getUserId()=" + getUserId()
				+ ", getUserName()=" + getUserName() + ", getDirectors()=" + Arrays.toString(getDirectors())
				+ ", getWebsiteLink()=" + getWebsiteLink() + ", getNatureOfBusiness()=" + getNatureOfBusiness()
				+ ", getRegister()=" + Arrays.toString(getRegister()) + ", getUploadDocs()="
				+ Arrays.toString(getUploadDocs()) + ", getLoansRequirementsInBrief()=" + getLoansRequirementsInBrief()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String[] getDirectors() {
		return directors;
	}

	public void setDirectors(String[] directors) {
		this.directors = directors;
	}

	public String getWebsiteLink() {
		return websiteLink;
	}

	public void setWebsiteLink(String websiteLink) {
		this.websiteLink = websiteLink;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public byte[] getRegister() {
		return register;
	}

	public void setRegister(byte[] register) {
		this.register = register;
	}

	public byte[] getUploadDocs() {
		return uploadDocs;
	}

	public void setUploadDocs(byte[] uploadDocs) {
		this.uploadDocs = uploadDocs;
	}

	public String getLoansRequirementsInBrief() {
		return loansRequirementsInBrief;
	}

	public void setLoansRequirementsInBrief(String loansRequirementsInBrief) {
		this.loansRequirementsInBrief = loansRequirementsInBrief;
	}

   
	
	
	
}
