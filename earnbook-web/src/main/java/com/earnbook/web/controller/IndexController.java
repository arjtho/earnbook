package com.earnbook.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    /**
     * This method will return index tiles page with appropriate contents
     * which need to be displayed on welcome page.
     * @param model
     * @return
     */
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("message", "Welcome to Earnbook the Business Hub");
		return "index";

	}
}