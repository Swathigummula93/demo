package SpringProject.LoanManagement.Controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import SpringProject.LoanManagement.ServiceImplementation.SelfEmpUserServiceImp;

import SpringProject.LoanManagement.model.SelfEmpUser;

@RestController
@CrossOrigin
@RequestMapping("/strifin.com")
public class SelfEmpUserController {
	@Autowired
	private SelfEmpUserServiceImp userService;

	

	
	@PostMapping("/selfEmpUserSaved")
	public ResponseEntity<Map<String,String>> signup(@RequestParam("file") MultipartFile file,
            @RequestParam("user") String userJson){
		 // Convert JSON string to SelfEmpUser object
        SelfEmpUser user = convertJsonToSelfEmpUser(userJson);
		
     // Check if file is present
        if (file.isEmpty()) {
            Map<String, String> response = new HashMap<>();
            response.put("status", "error");
            response.put("message", "File is required.");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        // Save the file and user data
        // You may need to implement the logic for saving the file
        // and associating it with the user
        
        userService.addUser(user);
        
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "User registered!!");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
		
	@GetMapping("/getSelfEmpUserDetailsById/{userId}")
    public ResponseEntity<SelfEmpUser> viewUser(@PathVariable("userId") Integer userId) {
        SelfEmpUser user = userService.viewUser(userId);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }
    
    // Helper method to convert JSON string to SelfEmpUser object
    private SelfEmpUser convertJsonToSelfEmpUser(String userJson) {
        // Implement JSON to object conversion logic here
        // You can use libraries like Jackson or Gson
        // For example:
        // SelfEmpUser user = objectMapper.readValue(userJson, SelfEmpUser.class);
        return null; // Implement accordingly
    }
	
}



