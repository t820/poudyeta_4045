package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.services.ISpecimenService;

@Controller
public class PlantPlacesController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;
	
	@RequestMapping(value = "/index", method=RequestMethod.GET)
	public String start(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		model.addAttribute("specimenDTO", specimenDTO);
//		specimenDTO.setSpecimenId(83);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("start");
//		modelAndView.addObject("specimenDTO", specimenDTO);
		return "start";
	}

}
