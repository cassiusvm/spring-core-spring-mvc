package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jt on 11/6/15.
 */
@Controller
public class IndexController {

	@GetMapping({ "/", "" })
	public String index() {
		return "index";
	}
}
