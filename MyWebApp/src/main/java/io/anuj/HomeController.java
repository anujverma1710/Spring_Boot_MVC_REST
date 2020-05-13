package io.anuj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		
//		HttpSession session = req.getSession();
//		String name  =  req.getParameter("name");
		
//		session.setAttribute("name", Myname);
//		System.out.println(Myname);
		
//		return "home";
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("alien")
	public ModelAndView alien(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("alien");
		return mv;
		
	}
}
