package SpringProject.LoanManagement.model;


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
public class IndividualUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(length = 100, nullable = false)
	private String userName;
	
	@Column(updatable = true)
    private Date dob;

    @Column(length = 150, updatable = true)
    private String empId;

    @Column(nullable = false, updatable = true)
    private Double monthlySalary;

    @Lob
    private byte[] expensesSheet; // Use MultipartFile to handle file uploads

    @Lob
    private byte[] loansSummary;

    @Lob
    private byte[] documentsToUpload;

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

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public byte[] getExpensesSheet() {
		return expensesSheet;
	}

	public void setExpensesSheet(byte[] expensesSheet) {
		this.expensesSheet = expensesSheet;
	}

	public byte[] getLoansSummary() {
		return loansSummary;
	}

	public void setLoansSummary(byte[] loansSummary) {
		this.loansSummary = loansSummary;
	}

	public byte[] getDocumentsToUpload() {
		return documentsToUpload;
	}

	public void setDocumentsToUpload(byte[] documentsToUpload) {
		this.documentsToUpload = documentsToUpload;
	}

	@Override
	public String toString() {
		return "IndividualUser [userId=" + userId + ", userName=" + userName + ", dob=" + dob + ", empId=" + empId
				+ ", monthlySalary=" + monthlySalary + ", expensesSheet=" + expensesSheet + ", loansSummary="
				+ loansSummary + ", documentsToUpload=" + documentsToUpload + "]";
	}

	public void setFileName(String originalFilename) {
		// TODO Auto-generated method stub
		
	}
	
	

}
