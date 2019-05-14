package kr.mycom.ojo.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.mycom.ojo.service.RoomService;

@Controller
@RequestMapping("/room/*")
public class StudyRoomController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudyRoomController.class);
	
	@Inject
	private RoomService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listPage(Model model) throws Exception {// @ModelAttribute
		model.addAttribute("RoomList",service.listAll());
	}
}
