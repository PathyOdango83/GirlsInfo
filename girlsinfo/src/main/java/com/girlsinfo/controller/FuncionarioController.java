package com.girlsinfo.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.girlsinfo.Model.FuncionarioModel;
import com.girlsinfo.Repository.FuncionarioRepository;
@Controller

public class FuncionarioController {
    
@Autowired
private  FuncionarioRepository Funcionariorepository;

@GetMapping("/Funcionario")
public String Funcionario(Model model) {
	model.addAttribute("funcionario", Funcionariorepository.findAll());
	return "/funcionario/listarfunc";
}

@GetMapping ("/Funcionario")
public String Novo(Model model) {
	return "/funcionario/funcionario";
}

@PostMapping(value="funcionario/funcionario")
public ModelAndView FuncionarioModel(FuncionarioModel funcionario) {
	ModelAndView mv = new ModelAndView("redirect:/funcionario");
	Funcionariorepository.save(funcionario);
	
	return mv;
}

@SuppressWarnings("deprecation")
@GetMapping("/deletar-funcionario/{idFun}")
public String Deletar (FuncionarioModel funcionario,@PathVariable("idFun") long idFun ) {
funcionario = (FuncionarioModel)this.Funcionariorepository.getOne(idFun);
this.Funcionariorepository.delete(funcionario);
return"redirect:/funcionario";
}



@GetMapping("funcionario-{idFun}")
public String buscafuncionario(@PathVariable long idFun, Model model) {
	Optional<FuncionarioModel> funcionario = Funcionariorepository.findById(idFun);
	try {
		model.addAttribute("Funcionario", funcionario.get());
	}
	catch(Exception err) {return "redirect:/";}
	return("funcionario/alterafunc");
}

@PostMapping("/{idFun}/alterafunc")
public String alterafunc(@PathVariable long idFun, FuncionarioModel funcionario) {
	if(!Funcionariorepository.existsById(idFun)) {
		return "redirect:/";
	}
	Funcionariorepository.save(funcionario);
	return "redirect:/pacientes";
}



}

    


