package com.querino.springvalidator;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Valid
@RestController
public class ValidationController {

    @GetMapping("/var/{value}")
    public String getPathVar(@PathVariable @Valid @Email /*@Pattern(regexp = "USER|GUEST")*/ String value){

        return value;
    }
}
