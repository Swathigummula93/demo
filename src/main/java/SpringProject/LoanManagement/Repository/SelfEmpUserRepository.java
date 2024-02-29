package SpringProject.LoanManagement.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import SpringProject.LoanManagement.model.SelfEmpUser;
@Repository
public interface SelfEmpUserRepository extends JpaRepository<SelfEmpUser , Integer> {
	@Query(value = "SELECT * FROM SELF_EMP_USER u WHERE u.user_email = ?1",nativeQuery = true  )
	public Optional<SelfEmpUser> findByuserEmail(String email);
	
	
	@Query(value = "SELECT * FROM SELF_EMP_USER u WHERE u.user_email = ?1 AND u.user_password = ?2 ",nativeQuery = true  )
	public Optional<SelfEmpUser>  findByuserEmailAndPassword(String email, String password);

}
//	void save(SelfEmpUser user);
//
//	List<SelfEmpUser> findAll();
//
//	Optional<SelfEmpUser> findById(Integer userId);
//
//}
