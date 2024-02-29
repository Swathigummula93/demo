package SpringProject.LoanManagement.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import SpringProject.LoanManagement.Repository.CorporateUserRepository;
import SpringProject.LoanManagement.Service.CorporateUserService;
import SpringProject.LoanManagement.model.CorporateUser;
import SpringProject.LoanManagement.model.IndividualUser;

@Service
public class CorporateUserServiceImp implements CorporateUserService{
	@Autowired
	private CorporateUserRepository corporateUserRepository;

	@Override
	public CorporateUser saveUser(CorporateUser corporateUserObj) {
		// TODO Auto-generated method stub
		return corporateUserRepository.save(corporateUserObj);
	}

	

	@Override
	public CorporateUser getUserDetailsById(int userId) {
		// TODO Auto-generated method stub
		return (CorporateUser) corporateUserRepository.findById(userId);
	}

	@Override
	public CorporateUser updateUserDetailsById(CorporateUser corporateUserObj, int userId) {
		// TODO Auto-generated method stub
		CorporateUser existingUser = (CorporateUser) corporateUserRepository.findById(userId);
        if (existingUser != null) {
            // Update the fields of the existing user
            existingUser.setUserName(corporateUserObj.getUserName());
            existingUser.setDirectors(corporateUserObj.getDirectors());
            existingUser.setWebsiteLink(corporateUserObj.getWebsiteLink());
            existingUser.setNatureOfBusiness(corporateUserObj.getNatureOfBusiness());
            existingUser.setRegister(corporateUserObj.getRegister());
            existingUser.setUploadDocs(corporateUserObj.getUploadDocs());
            existingUser.setLoansRequirementsInBrief(corporateUserObj.getLoansRequirementsInBrief());
            // Save the updated user
            return corporateUserRepository.save(existingUser);
        }

		return null;
	}

	@Override
	public CorporateUserRepository deleteuserDetailsById(int userId) {
		// TODO Auto-generated method stub
		corporateUserRepository.deleteById(userId);
		return corporateUserRepository;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CorporateUser> deleteAllUsers() {
		// TODO Auto-generated method stub
		corporateUserRepository.deleteAll();
		return (List<CorporateUser>) corporateUserRepository;
	}

	public String addUser(MultipartFile file, IndividualUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IndividualUser> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public IndividualUser viewUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public IndividualUser deleteById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<IndividualUser> fetchUserFromDB() {
		// TODO Auto-generated method stub
		return null;
	}


}
