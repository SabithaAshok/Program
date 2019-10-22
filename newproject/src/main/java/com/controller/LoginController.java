package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

      @RequestMapping(value = "/", method = RequestMethod.GET)
      public ModelAndView welcomePage() {
            ModelAndView model= new ModelAndView();
            model.setViewName("welcomePage");
            return  model;
      }

      @RequestMapping(value="/success", method = RequestMethod.GET)
            public ModelAndView homePage() {
                  ModelAndView model = new ModelAndView();
                  model.setViewName("success");
                  
                  return model;
            }

@RequestMapping(value ="/loginPage", method = RequestMethod.GET)
public ModelAndView loginPage(@RequestParam(value ="error", required= false)String error ,
            @RequestParam(value="logout", required=false) String logout){
ModelAndView model = new ModelAndView();
if(error !=  null){
      model.addObject("error","Invalid Credentials Provided");
      model.setViewName("loginPage");
      return model;
}
else if(logout!= null){
      model.addObject("message","Logged out successfully");
      model.setViewName("loginPage");
      return model;
}
else if (logout == null && error==null){
      return new ModelAndView("loginPage");
}
return new ModelAndView();
}}
