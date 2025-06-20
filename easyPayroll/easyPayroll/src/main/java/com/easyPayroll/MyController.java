package com.easyPayroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.easyPayroll.entity.Users;
import com.easyPayroll.repo.UsersRepo;


import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private UsersRepo repo;
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/registerPage")
	public String registerPage() {
		return "registerPage.jsp";
	}
	@RequestMapping("/loginPage")
	public String loginPage(@ModelAttribute("users") Users users,@ModelAttribute("msg")String msg, Model model) {
		model.addAttribute("users",users);
		model.addAttribute("msg",msg);
		return "loginPage.jsp";
	}
	@RequestMapping("register")
	public String register(Users users,RedirectAttributes redirectAttributes) {
		users.setActive(true);
		repo.save(users);
		redirectAttributes.addFlashAttribute("users",users);
		return "redirect:loginPage";
	}
	@RequestMapping("logincheck")
	public String register(@RequestParam int userId, @RequestParam String username,@RequestParam String passwordHash,RedirectAttributes attributes,HttpSession session) {
		try {
		Users users=repo.getReferenceById(userId); 
		if (users.getUsername().equals(username) && users.getPasswordHash().equals(passwordHash)) {
		    session.setAttribute("loggedInUser", users);

		    if (users.getRole().equals("employee")) {
		        return "redirect:employeehome";
		    } else if (users.getRole().equals("admin")) {
		        return "redirect:adminhome";
		    } else {
		        attributes.addFlashAttribute("msg", "Invalid role");
		        return "redirect:loginPage";
		    }

		} else {
		    attributes.addFlashAttribute("msg", "Invalid username or password.");
		    return "redirect:loginPage";
		}

		
		}catch (EntityNotFoundException e) {
			System.err.println(e);
			attributes.addFlashAttribute("msg","User ID not found");
			return "redirect:loginPage";
		}
	}
	@RequestMapping("employeehome")
	public String employeehome() {
		return "employeehome.jsp";
	}
	
	@RequestMapping("adminhome")
	public String adminhome() {
		return "adminhome.jsp";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session,RedirectAttributes attributes) {
		session.invalidate();
		attributes.addFlashAttribute("msg","You Have Been Successfully Logged Out");
		return "redirect:loginPage";
	}

}
