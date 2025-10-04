package com.Manasvi.Career;

import com.Manasvi.Career.service.CareerAdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/career")
@CrossOrigin(origins = "*")  // Allow frontend to call backend from any origin
public class CareerAdvisorController {

    @Autowired
    private CareerAdviceService careerAdviceService;

    // DTO to receive JSON request
    public static class AdviceRequest {
        public String experience;
        public String skills;
        public String interests;
    }
}
