/*package com.Manasvi.Career.controller;


import com.Manasvi.Career.model.CareerInput;
import com.Manasvi.Career.repository.CareerInputRepository;
import com.Manasvi.Career.repository.UserRepository;
import com.Manasvi.Career.service.CareerAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class CareerController {

    @Autowired
    private CareerAdviceService adviceService;

    @Autowired
    private UserRepository userRepository; 

    @Autowired
    private CareerInputRepository inputRepo;

    @PostMapping("/advice")
    public String getAdvice(@RequestBody CareerInput input) {
        inputRepo.save(input);
        return adviceService.getAdvice( input.getInterests());
    }
}
    */
  /*   package com.Manasvi.Career.controller;
import com.Manasvi.Career.service.CareerAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/career")
@CrossOrigin(origins = "http://localhost:5500")
public class CareerController {

    @Autowired
    private CareerAdviceService careerAdviceService;
package com.Manasvi.Career.controller;

import com.Manasvi.Career.service.CareerAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/career")
@CrossOrigin(origins = "http://localhost:5500")
public class CareerController {

    @Autowired
    private CareerAdviceService careerAdviceService;

    public static class AdviceRequest {
        private String skills;
        private String interests;
        private int experience; // Changed from String to int

        // Getters and Setters
        public String getSkills() {
            return skills;
        }

        public void setSkills(String skills) {
            this.skills = skills;
        }

        public String getInterests() {
            return interests;
        }

        public void setInterests(String interests) {
            this.interests = interests;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }
    }

    @PostMapping("/advice")
    public String getCareerAdvice(@RequestBody AdviceRequest request) {
        // Validate experience input
        if (request.getExperience() < 0) {
            return "Experience cannot be negative";
        }
        
        return careerAdviceService.getAdvice(
            request.getSkills(), 
            request.getInterests(), 
            request.getExperience()
        );
    }
}
    public static class AdviceRequest {
        public String experience;
        public String skills;
        public String interests;
    }

    @PostMapping("/advice")
    public String getCareerAdvice(@RequestBody AdviceRequest request) {
        return careerAdviceService.getAdvice(request.skills, request.interests);
    }
}
    */
   /*  package com.Manasvi.Career.controller;

import com.Manasvi.Career.service.CareerAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/career")
@CrossOrigin(origins = "http://localhost:5500")
public class CareerController {

    @Autowired
    private CareerAdviceService careerAdviceService;

    public static class AdviceRequest {
        private String skills;
        private String interests;
        private int experience; // Changed from String to int

        // Getters and Setters
        public String getSkills() {
            return skills;
        }

        public void setSkills(String skills) {
            this.skills = skills;
        }

        public String getInterests() {
            return interests;
        }

        public void setInterests(String interests) {
            this.interests = interests;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }
    }

    @PostMapping("/advice")
    public String getCareerAdvice(@RequestBody AdviceRequest request) {
        // Validate experience input
        if (request.getExperience() < 0) {
            return "Experience cannot be negative";
        }
        
        return careerAdviceService.getAdvice(
            request.getSkills(), 
            request.getInterests(), 
            request.getExperience()
        );
    }
}*/
package com.Manasvi.Career.model.controller;

import com.Manasvi.Career.service.CareerAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/career")
@CrossOrigin(origins = "http://localhost:5500")
public class CareerController {

    @Autowired
    private CareerAdviceService careerAdviceService;

    public static class AdviceRequest {
        private String skills;
        private String interests;
        private int experience;

        // Getters and setters
        public String getSkills() { return skills; }
        public void setSkills(String skills) { this.skills = skills; }
        public String getInterests() { return interests; }
        public void setInterests(String interests) { this.interests = interests; }
        public int getExperience() { return experience; }
        public void setExperience(int experience) { this.experience = experience; }
    }

    @PostMapping("/advice")
    public String getCareerAdvice(@RequestBody AdviceRequest request) {
        try {
            if (request.getExperience() < 0) {
                return "Error: Experience cannot be negative";
            }
            return careerAdviceService.getAdvice(
                request.getSkills(),
                request.getInterests(),
                request.getExperience()
            );
        } catch (Exception e) {
            return "Error processing your request: " + e.getMessage();
        }
    }
}