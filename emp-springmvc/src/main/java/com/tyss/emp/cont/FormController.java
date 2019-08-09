package com.tyss.emp.cont;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.emp.dto.UserBean;

@Controller
@RequestMapping("/forms")
public class FormController {

	@GetMapping("/getForm")
	public String getForm() {
		return "myForm";
	}

	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {
		int userid = Integer.parseInt((req.getParameter("userid")));
		String pwd = req.getParameter("password");
		req.setAttribute("userid", userid);
		req.setAttribute("password", pwd);
		return "formData";
	}

	@PostMapping("/submitForm")
	public String submit(int userid, String password, ModelMap modelMap) {
		modelMap.addAttribute("userid", userid);
		modelMap.addAttribute("password", password);
		return "formData";
	}

	@PostMapping("/submitForm3")
	public String submit3(UserBean bean, ModelMap mmap) {
		mmap.addAttribute("ubean", bean);
		return "formData2";
	}

	@PostMapping("/submitForm4")
	public String submit4(@RequestParam(name = "userid") int uid, @RequestParam(name = "password") String pwd,
			ModelMap modelMap) {
		modelMap.addAttribute("userid", uid);
		modelMap.addAttribute("password", pwd);
		return "formData";
	}

	@PostMapping("/submitForm5")
	public String submit5(UserBean bean, ModelMap mmap) {
		mmap.addAttribute("ubean", bean);
		return "formData2";
	}

}
