
package com.niyas.demo;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@RestController
public class JobController {

    @GetMapping("/api/jobs")
    public List<Map<String, Object>> getJobs() {
        return List.of(
            Map.of(
                "id", 1,
                "title", "Java Developer",
                "company", "ABC Technologies",
                "location", "Dubai",
                "type", "Full-time"
            ),
            Map.of(
                "id", 2,
                "title", "IT Support Engineer",
                "company", "Tech Solutions",
                "location", "Abu Dhabi",
                "type", "Full-time"
            ),
            Map.of(
                "id", 3,
                "title", "Spring Boot Developer",
                "company", "Digital Systems",
                "location", "Sharjah",
                "type", "Internship"
            )
        );
    }

    @GetMapping("/api/jobs/{id}")
    public Map<String, Object> getJobById(@PathVariable int id) {
        return getJobs().stream()
            .filter(job -> (int) job.get("id") == id)
            .findFirst()
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Job not found"
            ));
    }
}

