package SpringProject.LoanManagement.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.LoanManagement.Repository.IndividualUserRepository;
import SpringProject.LoanManagement.Repository.SelfEmpUserRepository;
import SpringProject.LoanManagement.model.IndividualUser;
import SpringProject.LoanManagement.model.SelfEmpUser;
@Service
public class SelfEmpUserServiceImp {
	@Autowired
	private SelfEmpUserRepository selfEmpUserRepository;


	public void addUser(SelfEmpUser user) {
		this.selfEmpUserRepository.save(user);
		
	}

	public List<SelfEmpUser> getAllUser() {
		
		return selfEmpUserRepository.findAll();
	}

	
	
	public SelfEmpUser viewUser(Integer userId ) {
		Optional<SelfEmpUser> user =  selfEmpUserRepository.findById(userId);  //null , or it can 5tg person rec
		if(user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}
	}

}


