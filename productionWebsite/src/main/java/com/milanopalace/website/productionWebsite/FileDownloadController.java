package com.milanopalace.website.productionWebsite;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FileDownloadController {

    // Hardcoded credentials for authentication
    private static final String VALID_USERNAME = "user53425";
    private static final String VALID_PASSWORD = "UAC8837";
  

    
    @Value("classpath:static/MilanoPalaceEventsProposal.pdf") // Load from the JAR's static folder
    private Resource file;

    
    @GetMapping("/download")
    public String downloadFile(
    		   @RequestParam(name = "usn") String username,
               @RequestParam(name = "pwd") String password
    		) {
    	  if (!VALID_USERNAME.equals(username) || !VALID_PASSWORD.equals(password)) {
    		  return "Invalid credentials";
          }
        return "https://milanollc.com/MilanoPalaceEventsProposal.pdf";
    }
    
}  
