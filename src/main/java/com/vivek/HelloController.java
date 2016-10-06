package com.vivek;

import com.vivek.dto.M2000;
import com.vivek.service.M2000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HelloController {


    @Autowired
    M2000Service m2000Service;


	@RequestMapping(method = RequestMethod.GET)
	public List<M2000> printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return m2000Service.list();
	}
}