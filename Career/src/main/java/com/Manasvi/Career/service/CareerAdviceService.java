
package com.Manasvi.Career.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CareerAdviceService {

    private static final Map<String, Map<String, CareerPath>> adviceMap = new HashMap<>();

    static {
        // ========= BEGINNER (0-2 years) =========
        Map<String, CareerPath> beginnerAdvice = new HashMap<>();
        
        beginnerAdvice.put("data", new CareerPath(
            "📌 Data Analyst | Research Assistant | BI Specialist \n",
            "🚀 Quick Wins:\n" +
            "• Master Excel (PivotTables, VLOOKUP)\n" +
            "• Learn SQL basics (SELECT, JOIN, GROUP BY)\n" +
            "• Complete Google Data Analytics Certificate\n\n" +
            "🔮 Next-Level Prep:\n" +
            "• Build 3 projects using Kaggle datasets\n" +
            "• Learn Python pandas for data cleaning\n" +
            "• Network at local data meetups"
        ));

        beginnerAdvice.put("ai", new CareerPath(
            "📌 ML Intern | AI Research Assistant | Data Labeler",
            "🚀 Quick Wins:\n" +
            "• Complete Python for Everybody course\n" +
            "• Study linear algebra fundamentals\n" +
            "• Build MNIST digit classifier\n\n" +
            "🔮 Next-Level Prep:\n" +
            "• Contribute to open-source AI projects\n" +
            "• Document learning journey on GitHub\n" +
            "• Attend AI hackathons"
        ));

        beginnerAdvice.put("web", new CareerPath(
            "📌 Frontend Intern | WordPress Developer | QA Tester",
            "🚀 Quick Wins:\n" +
            "• Build 5 static HTML/CSS sites\n" +
            "• Learn JavaScript DOM manipulation\n" +
            "• Complete FreeCodeCamp Responsive Design\n\n" +
            "🔮 Next-Level Prep:\n" +
            "• Create React/Node.js fullstack app\n" +
            "• Solve 50+ LeetCode easy problems\n" +
            "• Get first freelance client"
        ));

         beginnerAdvice.put("mobile", new CareerPath(
            "📌 Junior Mobile Developer | QA Tester | App Maintenance",
            "🚀 Quick Wins:\n" +
            "• Build 3 simple Flutter/React Native apps\n" +
            "• Complete Android/iOS developer fundamentals\n" +
            "• Publish one app on Play Store/App Store\n\n" +
            "🔮 Next-Level Prep:\n" +
            "• Master platform-specific APIs (Camera, GPS)\n" +
            "• Learn state management (Provider/Bloc)\n" +
            "• Contribute to open-source mobile projects"
        ));

        // UI/UX DESIGN
        beginnerAdvice.put("design", new CareerPath(
            "📌 UI Intern | Visual Designer | UX Researcher Assistant",
            "🚀 Quick Wins:\n" +
            "• Complete 10 daily UI challenges\n" +
            "• Learn Figma/Sketch fundamentals\n" +
            "• Build portfolio with 3 case studies\n\n" +
            "🔮 Next-Level Prep:\n" +
            "• Conduct user testing sessions\n" +
            "• Study Material Design/iOS HIG\n" +
            "• Network at design meetups"
        ));

        // ========= INTERMEDIATE (3-5 years) =========
        Map<String, CareerPath> intermediateAdvice = new HashMap<>();
        
        intermediateAdvice.put("data", new CareerPath(
            "📌 Data Scientist | Database Admin | Analytics Engineer",
            "💎 Pro Moves:\n" +
            "• Master Spark/PySpark for big data\n" +
            "• Get AWS/Azure data certification\n" +
            "• Implement CI/CD for data pipelines\n\n" +
            "🏆 Career Boosters:\n" +
            "• Publish technical case studies\n" +
            "• Mentor junior analysts\n" +
            "• Specialize in industry vertical"
        ));

        intermediateAdvice.put("ai", new CareerPath(
            "📌 Machine Learning Engineer | NLP Specialist | Computer Vision Engineer",
            "💎 Pro Moves:\n" +
            "• Containerize models with Docker\n" +
            "• Optimize model inference speed\n" +
            "• Implement MLOps practices\n\n" +
            "🏆 Career Boosters:\n" +
            "• Publish PyPI utility package\n" +
            "• Speak at local tech events\n" +
            "• Lead Kaggle competition team"
        ));

        intermediateAdvice.put("web", new CareerPath(
            "📌 Fullstack Developer | Tech Lead | Solutions Architect",
            "💎 Pro Moves:\n" +
            "• Master TypeScript + GraphQL\n" +
            "• Implement microservices architecture\n" +
            "• Get cloud certification (AWS/GCP)\n\n" +
            "🏆 Career Boosters:\n" +
            "• Contribute to popular OSS projects\n" +
            "• Build developer tools/library\n" +
            "• Negotiate senior title"
        ));

          intermediateAdvice.put("mobile", new CareerPath(
            "📌 Senior Mobile Developer | Tech Lead | Mobile Architect",
            "💎 Pro Moves:\n" +
            "• Implement CI/CD pipelines for apps\n" +
            "• Optimize app performance (Renderscript)\n" +
            "• Get platform certifications (Android/Kotlin)\n\n" +
            "🏆 Career Boosters:\n" +
            "• Create popular plugin/library\n" +
            "• Speak at mobile conferences\n" +
            "• Mentor junior developers"
        ));

        // UI/UX DESIGN
        intermediateAdvice.put("design", new CareerPath(
            "📌 Product Designer | UX Lead | Design System Manager",
            "💎 Pro Moves:\n" +
            "• Master advanced prototyping (Figma)\n" +
            "• Conduct accessibility audits\n" +
            "• Build design system from scratch\n\n" +
            "🏆 Career Boosters:\n" +
            "• Publish design articles/talks\n" +
            "• Lead design sprints\n" +
            "• Specialize in AR/VR interfaces"
        ));

        // ========= ADVANCED (5+ years) =========
        Map<String, CareerPath> advancedAdvice = new HashMap<>();
        
        advancedAdvice.put("data", new CareerPath(
            "📌 Data Architect | Chief Data Officer | Analytics Director",
            "🎯 Executive Playbook:\n" +
            "• Design petabyte-scale systems\n" +
            "• Develop data governance policies\n" +
            "• Align data strategy with business goals\n\n" +
            "🌟 Legacy Builders:\n" +
            "• Create data literacy program\n" +
            "• Patent novel data technique\n" +
            "• Launch data podcast/newsletter"
        ));

        advancedAdvice.put("ai", new CareerPath(
            "📌 AI Architect | Principal Researcher | Head of AI",
            "🎯 Executive Playbook:\n" +
            "• Set organizational AI ethics standards\n" +
            "• Secure AI research funding\n" +
            "• Build cross-functional AI teams\n\n" +
            "🌟 Legacy Builders:\n" +
            "• Publish influential white paper\n" +
            "• Found AI startup\n" +
            "• Advise government panels"
        ));

        advancedAdvice.put("web", new CareerPath(
            "📌 CTO | VP Engineering | Distinguished Engineer",
            "🎯 Executive Playbook:\n" +
            "• Architect multi-cloud solutions\n" +
            "• Establish engineering excellence standards\n" +
            "• Negotiate tech acquisitions\n\n" +
            "🌟 Legacy Builders:\n" +
            "• Create engineering fellowship\n" +
            "• Keynote at major conferences\n" +
            "• Write technical book"
        ));

         // MOBILE DEVELOPMENT
        advancedAdvice.put("mobile", new CareerPath(
            "📌 Director of Mobile Engineering | CTO | Principal Architect",
            "🎯 Executive Playbook:\n" +
            "• Set cross-platform development standards\n" +
            "• Negotiate app monetization strategies\n" +
            "• Architect enterprise mobile solutions\n\n" +
            "🌟 Legacy Builders:\n" +
            "• Create mobile developer academy\n" +
            "• Advise on platform SDK development\n" +
            "• Found mobile-first startup"
        ));

        // UI/UX DESIGN
        advancedAdvice.put("design", new CareerPath(
            "📌 VP of Design | Chief Design Officer | UX Evangelist",
            "🎯 Executive Playbook:\n" +
            "• Establish design OKRs company-wide\n" +
            "• Build inclusive design practices\n" +
            "• Lead design M&A integrations\n\n" +
            "🌟 Legacy Builders:\n" +
            "• Launch design scholarship program\n" +
            "• Publish industry design standards\n" +
            "• Keynote at major design events"
        ));

        adviceMap.put("beginner", beginnerAdvice);
        adviceMap.put("intermediate", intermediateAdvice);
        adviceMap.put("advanced", advancedAdvice);
    }

    public String getAdvice(String skills, String interests, int experience) {
        String level = determineExperienceLevel(experience);
        Map<String, CareerPath> levelAdvice = adviceMap.get(level);
        
        StringBuilder response = new StringBuilder();
        response.append("\n🌟 ==== YOUR ").append(level.toUpperCase())
               .append(" LEVEL ROADMAP (").append(experience).append(" years) ==== 🌟\n\n");

        String[] tokens = (skills + "," + interests).toLowerCase().split(",");
        Set<String> processed = new HashSet<>();

        for (String token : tokens) {
            token = token.trim();
            if (!processed.contains(token) && levelAdvice.containsKey(token)) {
                processed.add(token);
                CareerPath path = levelAdvice.get(token);
                response.append(path.roles).append("\n\n");
                response.append(path.advice).append("\n\n");
                response.append("══════════════════════════════════════\n\n");
            }
        }

        if (processed.isEmpty()) {
            return "🔍 No specific advice found for your profile.\n" +
                   "Try combining different skills/interests or exploring new areas!";
        }

        return response.toString();
    }

    private String determineExperienceLevel(int experience) {
        if (experience <= 2) return "beginner";
        if (experience <= 5) return "intermediate";
        return "advanced";
    }

    private static class CareerPath {
        String roles;
        String advice;

        CareerPath(String roles, String advice) {
            this.roles = roles;
            this.advice = advice;
        }
    }
}
