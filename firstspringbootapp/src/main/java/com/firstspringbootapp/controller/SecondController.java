package com.firstspringbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SecondController {
	@RequestMapping(value="/url")
public String secMethod(){
	return "success";
}
}
