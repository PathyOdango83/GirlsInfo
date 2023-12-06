package com.girlsinfo.controller;

import com.girlsinfo.Repository.ClienteRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.girlsinfo.Model.ClienteModel;
@Controller
public class ClienteController {
    
@Autowired
private  ClienteRepository clienteRepository;

@GetMapping("/cliente")
public String Funcionario(Model model) {
	model.addAttribute("cliente", clienteRepository.findAll());
	return "/";
}

@GetMapping("/cadastro-de-cliente")
public String Novocliente() {
	
	return "/clientes/cliente";
}


@PostMapping(value="/cliente/novo")
public ModelAndView ClienteModel(ClienteModel cliente) {
	ModelAndView mv = new ModelAndView("redirect:/");
	clienteRepository.save(cliente);
	
	return mv;
}

@GetMapping("/deletarcliente/{idFun}")
public String Deletar (ClienteModel cliente,@PathVariable("idcliente") long idcliente ) {
cliente = (ClienteModel)this.clienteRepository.getOne(idcliente);
this.clienteRepository.delete(cliente);
return"redirect:/funcionario";
}



@GetMapping("cliente-{idcliente}")
public String buscafuncionario(@PathVariable long idcliente, Model model) {
	Optional<ClienteModel> cliente = clienteRepository.findById(idcliente);
	try {
		model.addAttribute("Funcionario", cliente.get());
	}
	catch(Exception err) {return "redirect:/";}
	return("/");
}

@PostMapping("/{idcliente}/alteracliente")
public String alterafunc(@PathVariable long idFun, ClienteModel cliente) {
	if(!clienteRepository.existsById(idFun)) {
		return "redirect:/";
	}
	clienteRepository.save(cliente);
	return "redirect:/";
}}