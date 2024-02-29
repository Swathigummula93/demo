package SpringProject.LoanManagement.Controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework  .web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import SpringProject.LoanManagement.ServiceImplementation.CorporateUserServiceImp;
import SpringProject.LoanManagement.model.CorporateUser;
import SpringProject.LoanManagement.model.IndividualUser;

@RestController
@CrossOrigin
@RequestMapping("/strifin.com")
public class CorporateUserController {
	@Autowired
	private CorporateUserServiceImp userService;
	
	@PostMapping("/corporateUserSaved")
    public ResponseEntity<String> signup(@RequestPart("file") MultipartFile file, @RequestBody IndividualUser user) throws IOException {
        String response = userService.addUser(file, user);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/getAllCorUserDetails")
    public List<IndividualUser> readAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/getCorUserDetailsById/{userId}")
    public ResponseEntity<IndividualUser> viewUser(@PathVariable("userId") Integer userId) {
        IndividualUser user = userService.viewUser(userId);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/deleteAllUsers")
    public List<CorporateUser> deleteAllUser(){
		return userService.deleteAllUsers();
    	
    }
    @DeleteMapping("/deleteUserDetailsById/{userId}")
    	public ResponseEntity<IndividualUser> deleteById(@PathVariable("userId") Integer userId){
    	IndividualUser user = userService.deleteById(userId);
    	if(user != null) {
    		return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    		
    	}
    	else {
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	}
		
    	
    		
    	}
    
}


	
	


