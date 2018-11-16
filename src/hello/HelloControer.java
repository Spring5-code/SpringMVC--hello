package hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloControer implements Controller {

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.out.println("hello...controller");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/WEB-INF/view/welcome.jsp");
		mv.addObject("helloMsg", "ÄãºÃSpringMvc");
		return mv;
	}
}
