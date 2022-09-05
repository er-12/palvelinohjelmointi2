package s22.viikko2osa3.web;

import java.util.ArrayList;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import s22.viikko2osa3.domain.Friend;

@Controller
public class FriendController {
	
	ArrayList<Friend> friends = new ArrayList<>();
	
	@GetMapping("index")
	public String listFriends(@RequestParam(name="friend", required=false) String name, Model model) {
		
		model.addAttribute("friend", new Friend(name));
		
		return "friend";
	}
	
	@PostMapping("index")
	public String friendSubmit(@Valid Friend friend, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
        	return "error";
        }
		
		friends.add(friend);

		model.addAttribute("friendList", friends);
		
		model.addAttribute("friend", new Friend());
		
		return "friend"; 
	}

}
