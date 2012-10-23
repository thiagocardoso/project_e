package com.tcc.elearning.home;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@ResponseBody
	@RequestMapping(value = "/")
	public ModelAndView home(Device device){
		if(device.isNormal()){
			return new ModelAndView("redirect:/spring/web/curso");
		}
		
		if(device.isMobile()){
			return new ModelAndView("redirect:/spring/mobile/curso");
		}
		
		return new ModelAndView("");	
	}
}
