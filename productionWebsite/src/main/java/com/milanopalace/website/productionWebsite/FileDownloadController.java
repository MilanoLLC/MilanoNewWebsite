package com.milanopalace.website.productionWebsite;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

@RestController
@RequestMapping("/api")
public class FileDownloadController {

    // Hardcoded credentials for authentication
    private static final String VALID_USERNAME = "user53425";
    private static final String VALID_PASSWORD = "UAC8837";
  
//    @GetMapping("/download")
//    public ResponseEntity<byte[]> downloadFile(
//            @RequestParam(name = "usn") String username,
//            @RequestParam(name = "pwd") String password) {
//
//        // Authenticate user
//        if (!VALID_USERNAME.equals(username) || !VALID_PASSWORD.equals(password)) {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
//        }
//
//        try {
//            // Load file from the static folder
//            Resource resource = new ClassPathResource("static/MilanoPalaceEventsProposal.pdf");
//
//            byte[] fileContent = Files.readAllBytes(resource.getFile().toPath());
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=sample.pdf");
//            headers.add(HttpHeaders.CONTENT_TYPE, "application/pdf");
//
//            return ResponseEntity.ok()
//                    .headers(headers)
//                    .body(fileContent);
//
//        } catch (Exception e) {
//        	e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
//        }
//    }

    
    @Value("classpath:static/MilanoPalaceEventsProposal.pdf") // Load from the JAR's static folder
    private Resource file;

    @GetMapping("/download")
    public ResponseEntity<byte[]> downloadFileNew(
            @RequestParam(name = "usn") String username,
            @RequestParam(name = "pwd") String password
    		) throws IOException {
        // You can validate username and password here if needed

    	// Authenticate user
      if (!VALID_USERNAME.equals(username) || !VALID_PASSWORD.equals(password)) {
          return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
      }
    	
        if (file.exists()) {
            // Read file content as byte array
            InputStream inputStream = file.getInputStream();
            byte[] fileContent = inputStream.readAllBytes();
            inputStream.close();

            // Return file as response
            return ResponseEntity.ok()
                    .header("Content-Type", "application/pdf")
                    .header("Content-Disposition", "attachment; filename=\"MilanoPalaceEventsProposal.pdf\"")
                    .body(fileContent);
        } else {
            return ResponseEntity.status(404).body("File not found".getBytes());
        }
    }

}
