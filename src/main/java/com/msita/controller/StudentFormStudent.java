package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentFormStudent {
    @GetMapping(path = "/student")
    public String student(final Model model) {
        StudentForm studentForm = new StudentForm("Le Hoc Minh", 10, "Cong nghe phan mem");
        model.addAttribute("student", studentForm);
        return "/student";
    }

    @PostMapping(path = "/student")
    public String student(final Model model, @ModelAttribute("student") StudentForm studentForm) {
        model.addAttribute("student", studentForm);
        return "/student";
    }

    @ModelAttribute("majors")
    public Map<String, String> getMajors() {
        Map<String, String> majors = new HashMap<String, String>();
        majors.put("WEB", "Lap trinh web");
        majors.put("Maketing", "Ban hang");
        return majors;
    }
}

