package com.learnshpere.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.learnshpere.Entity.Comments;
import com.learnshpere.Entity.Users;
import com.learnshpere.Service.Commentservice;
import com.learnshpere.Service.UserService;

@Controller
public class MainControl {

	@Autowired
	Commentservice cservice;

	@Autowired
	UserService Uservice;

	@PostMapping("/adduser")
	public String adduser(@RequestParam("name") String name, @RequestParam("number") String number,
			@RequestParam("Gender") String Gender, @RequestParam("role") String role,
			@RequestParam("email") String email, @RequestParam("password") String password) {

		boolean emailExists = Uservice.checkEmail(email);
		if (emailExists == false) {
			Users u = new Users();
			u.setName(name);
			u.setNumber(number);
			u.setGender(Gender);
			u.setRole(role);
			u.setEmail(email);
			u.setPassword(password);
			Uservice.adduser(u);
			System.out.println(name + number + Gender + role + email + password);
			System.out.println("User added successfully");
			return "login";

		} else {
			System.out.println("user already exist please try with different email");
			return "register";
		}

	}

	@PostMapping("/validate")
	public String validate(@RequestParam("email") String email, @RequestParam("password") String password) {
		if (Uservice.checkEmail(email)) {

			boolean validate = Uservice.validate(email, password);
			// if users is valid
			if (validate == true) {
				if (Uservice.getUserRole(email).equals("Trainer")) {
					return "trainerHome";
				} else {
					return "studentHome";
				}
			} else {
				System.out.println("incurrect credentialls Please try again");
				return "login";
			}

		} else {
			return "login";
		}
	}

	@PostMapping("/comment")
	public String addcomment(@RequestParam("comment") String comment, Model model) {
		Comments cm = new Comments();
		cm.setComment(comment);
		cservice.addcomment(cm);
		List<Comments> commentlist = cservice.commentlist();
		model.addAttribute("comment", commentlist);

		return "redirect:/";

	}
}
