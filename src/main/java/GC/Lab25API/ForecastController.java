package GC.Lab25API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import GC.Lab25API.model.Data;


@Controller
public class ForecastController {

	
	@Autowired
	ApiService apiServ;
	
	
	@RequestMapping("/")
	public String home() {
		
		return ("form");
	}
	
	@RequestMapping("/home")
	public String showhome(Model model, @RequestParam ("lat") Double latitude,
			@RequestParam ("lon") Double longitude) {
		
		Data data = apiServ.readText(latitude, longitude);
		System.out.println(data);
		
		model.addAttribute("data", data);
		return ("forecast");
    }
}