package com.tcc.elearning.home;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mobile")
public class HomeController {
	
	@ResponseBody
	@RequestMapping(value = "/teste", method = RequestMethod.GET, produces = "text/plain")
	public String home(Device device){
		if(device.isNormal()){
			System.out.println("Acessando por um browser comum!");
		}
		
		if(device.isMobile()){
			System.out.println("Acessando por um browser de celular!");
		}
		
		if(device.isTablet()){
			System.out.println("Acessando por um browser de tablet!");
		}
		
		
		return "teste";
	}
}
