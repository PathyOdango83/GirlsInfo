package com.girlsinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.girlsinfo.Repository.ServicoRepository;
import com.girlsinfo.Model.ServicoModel;
@Controller
public class ServicoController {
	@Autowired
	private  ServicoRepository servicoRepository;

	@GetMapping("/servico")
	public String servico(ModelMap model) {
		model.addAttribute("servico", servicoRepository.findAll());
		return "/";
	}

	@GetMapping("/cadastro-servico")
	public String Novoproduto() {
		return "/servico/servico";
	}


	@PostMapping(value="/servico/novo")
	public ModelAndView ServicoModel(ServicoModel servico) {
		ModelAndView mv = new ModelAndView("redirect:/");
		servicoRepository.save(servico);
		
		return mv;
	}
}
