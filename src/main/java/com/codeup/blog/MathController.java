package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path="add/{numOne}/{operator}/{numTwo}")
    @ResponseBody
    public String add(@PathVariable int numOne, @PathVariable int numTwo, @PathVariable String operator) {
        return null;
    }
}
