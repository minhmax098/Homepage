package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {
    @GetMapping(path = "/editStudent")
    public String editStudent(final Model model) {
        StudentForm student = new StudentForm("Lê Học Minh", 9, "Công nghệ phần mềm");
        model.addAttribute("student", student);
        return "/editStudent";
    }

    @PostMapping(path = "/editStudent")
    public String editStudent(final Model model, @ModelAttribute("student") final StudentForm student) {
        model.addAttribute("username", student.getName());
        return "welcome";
    }

    @ModelAttribute("majors")
    public Map<String, String> getMajors() {
        Map<String, String> majors = new HashMap<String, String>();
        majors.put("WEB", "Lap trinh web");
        majors.put("Maketing", "Ban hang");
        return majors;
    }
}
