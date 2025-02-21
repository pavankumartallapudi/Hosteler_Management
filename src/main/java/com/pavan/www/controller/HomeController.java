package com.pavan.www.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pavan.www.model.Hostelers;
import com.pavan.www.service.HomeServices;


@Controller
public class HomeController {
	
	@Autowired
	HomeServices homeservice;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/register")
	public String User_registration() {
		return "registration";
	}
	@PostMapping("/register_user")
	public String addHosteler(@ModelAttribute Hostelers hosteler) {
		homeservice.addHosteler(hosteler);
		return "redirect:/";
	}
	@GetMapping("/get_details")
	public String Pirticular_hosteler_details() {
		return "hosteler_details";
	}
	@GetMapping("/getHostelerDetails")
	public  String getPirticularHosteler(@RequestParam("mobileNumber") String mobileNumber,Model m){
		
		Hostelers hosteler = homeservice.findByMobileNumber(mobileNumber);
        m.addAttribute("hosteler", hosteler);
        return "hosteler_details";
	}
	@PostMapping("/delete_hosteler")
	public  String delPirticularHosteler(@RequestParam("mobileNumber") String mobileNumber){
		
		boolean is_deleted=homeservice.delPirticularHosteler(mobileNumber);
        if(is_deleted) {
        	return "Hst_Details";
        }
        return "index";
	}
	
	@GetMapping("/Home_page")
	public String home() {
		
		return "redirect:/";
	}
	@GetMapping("/owner_login_SS")
    public String showAllHostelers(Model m) {
        List<Hostelers> hst=homeservice.showHostelers();
        m.addAttribute("details",hst);
        return "Hst_Details";
    }
	
	@GetMapping("/owner_login")
	public String owner_login() {
		return "login";
	}
}
