package SpringProject.LoanManagement.model;
import java.util.Arrays;
import java.util.Date;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
@Entity
@DynamicUpdate
public class SelfEmpUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(length = 100, nullable = false)
	private String userName;
	
	@Column(updatable = true)
    private Date dob;

    @Column(length = 150, updatable = true)
    private String natureOfBusiness;

    @Column(nullable = false, updatable = true)
    private Double monthlyIncome;
    
    @Column(nullable = false, updatable = true)
    private Double noOfEmployees;

    @Lob
    private byte[] expensesSheet; // Use MultipartFile to handle file uploads

    @Lob
    private byte[] personalExpenses;

    @Override
	public String toString() {
		return "SelfEmpUser [userId=" + userId + ", userName=" + userName + ", dob=" + dob + ", natureOfBusiness="
				+ natureOfBusiness + ", monthlyIncome=" + monthlyIncome + ", noOfEmployees=" + noOfEmployees
				+ ", expensesSheet=" + Arrays.toString(expensesSheet) + ", personalExpenses="
				+ Arrays.toString(personalExpenses) + ", documentsToUpload=" + Arrays.toString(documentsToUpload) + "]";
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public Double getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(Double noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public byte[] getExpensesSheet() {
		return expensesSheet;
	}

	public void setExpensesSheet(byte[] expensesSheet) {
		this.expensesSheet = expensesSheet;
	}

	public byte[] getPersonalExpenses() {
		return personalExpenses;
	}

	public void setPersonalExpenses(byte[] personalExpenses) {
		this.personalExpenses = personalExpenses;
	}

	public byte[] getDocumentsToUpload() {
		return documentsToUpload;
	}

	public void setDocumentsToUpload(byte[] documentsToUpload) {
		this.documentsToUpload = documentsToUpload;
	}

	@Lob
    private byte[] documentsToUpload;


}
