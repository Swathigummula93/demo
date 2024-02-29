package SpringProject.LoanManagement.Service;

import java.util.List;


import SpringProject.LoanManagement.model.SelfEmpUser;

public interface SelfEmpUserService {
	SelfEmpUser saveUser(SelfEmpUser selfEmpUserObj);
	List<SelfEmpUser>fetchUserFromDb();
	SelfEmpUser getUserDetailsById(int userId);
	SelfEmpUser updateUserDetailsById(SelfEmpUser selfEmpUserObj, int userId);
	void deleteUserdetailsById(int userId);
	List<SelfEmpUser> deleteallUserdetails();
}
