package SpringProject.LoanManagement.Service;

import java.util.List;

import SpringProject.LoanManagement.Repository.CorporateUserRepository;
import SpringProject.LoanManagement.model.CorporateUser;
import SpringProject.LoanManagement.model.IndividualUser;

public interface CorporateUserService {
	CorporateUser saveUser(CorporateUser corporateUserObj);
	List<IndividualUser> fetchUserFromDB();
	CorporateUser getUserDetailsById(int userId);
	CorporateUser updateUserDetailsById(CorporateUser corporateUserObj, int userId);
	
	List<CorporateUser>deleteAllUsers();
	CorporateUserRepository deleteuserDetailsById(int userId);
	
	

}
