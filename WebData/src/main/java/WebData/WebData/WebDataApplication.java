package WebData.WebData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class WebDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDataApplication.class, args);
	}
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}

}
