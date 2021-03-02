package com.rummykhan.conference.controller;

import com.rummykhan.conference.model.Registration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Slf4j
@Controller
public class RegistrationController {

    @GetMapping("/registration")
    public String registration(@ModelAttribute("registration") Registration registration) {

        return "registration";
    }

    @PostMapping("/registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration,
                                  BindingResult result) {

        log.info("Registration: {}", registration);

        if (result.hasErrors()) {

            log.info("Validation errors: {}", result.getAllErrors());
            return "registration";
        }

        return "redirect:/registration";
    }
}
