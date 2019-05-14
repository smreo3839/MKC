package kr.mycom.ojo.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.mycom.ojo.domain.SearchCriteria;
import kr.mycom.ojo.service.RoomService;

@Controller
@RequestMapping("/room/*")
public class StudyRoomController {
	private static final Logger logger = LoggerFactory.getLogger(StudyRoomController.class);
	@Inject
	private RoomService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {// @ModelAttribute
																									// ������̼��� �޼��忡 �����ϸ�

		System.out.println("listPage : " + cri);
		logger.info(cri.toString());

		// model.addAttribute("list", service.listCriteria(cri));
		model.addAttribute("list", service.listSearchCriteria(cri));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);

		// pageMaker.setTotalCount(service.listCountCriteria(cri));
		pageMaker.setTotalCount(service.listSearchCount(cri));
		System.out.println("pageMaker ***** : " + pageMaker.getTotalCount());
		model.addAttribute("pageMaker", pageMaker);
	}

	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception {

		model.addAttribute(service.read(bno));
	}
}
