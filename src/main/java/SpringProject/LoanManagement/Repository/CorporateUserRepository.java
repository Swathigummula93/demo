package SpringProject.LoanManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import SpringProject.LoanManagement.model.CorporateUser;
import SpringProject.LoanManagement.model.IndividualUser;
@Repository
public interface CorporateUserRepository  extends JpaRepository<IndividualUser , Integer> {
	@Query(value = "SELECT * FROM CORPORATE_USER u WHERE u.user_email = ?1",nativeQuery = true  )
	public Optional<IndividualUser> findByuserEmail(String email);
	
	
	@Query(value = "SELECT * FROM CORPORATE_USER u WHERE u.user_email = ?1 AND u.user_password = ?2 ",nativeQuery = true  )
	public Optional<IndividualUser>  findByuserEmailAndPassword(String email, String password);


	CorporateUser save(CorporateUser corporateUserObj);

	List<IndividualUser> findAll();

	CorporateUser findById(int userId);

	void deleteById(int userId);

	void deleteAll();

	//CorporateUser save(CorporateUser corporateUserObj);

}
