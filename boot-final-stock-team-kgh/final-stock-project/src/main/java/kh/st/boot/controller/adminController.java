package kh.st.boot.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kh.st.boot.model.vo.AdminVO;
import kh.st.boot.service.AdminService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class adminController {
	
	private AdminService adminService;
	
    @GetMapping("/")
    public String admin(Model model){
    	List<AdminVO> adminList = adminService.getAdminList();
		model.addAttribute("adminList", adminList);
        return "home";
    }
}
