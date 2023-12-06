package com.girlsinfo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.girlsinfo.Repository.ProdutoRepository;
import com.girlsinfo.Model.ProdutoModel;

@Controller
public class ProdutoController {
	@Autowired
	private  ProdutoRepository produtoRepository;

	@GetMapping("/produto")
	public String Funcionario(ModelMap model) {
		model.addAttribute("funcionario", produtoRepository.findAll());
		return "/";
	}

	@GetMapping("/cadastro-produto")
	public String Novoproduto() {
		return "/produto/produtos";
	}


	@PostMapping(value="/produto/novo")
	public ModelAndView ProdutoModel(ProdutoModel produto) {
		ModelAndView mv = new ModelAndView("redirect:/");
		produtoRepository.save(produto);
		
		return mv;
	}

	@GetMapping("/deletarproduto/{idproduto}")
	public String Deletar (ProdutoModel produto,@PathVariable("idproduto") long idFun ) {
	produto = (ProdutoModel)this.produtoRepository.getOne(idFun);
	this.produtoRepository.delete(produto);
	return"redirect:/funcionario";
	}



	@GetMapping("produto-{idproduto}")
	public String buscaproduto(@PathVariable long idFun, Model model) {
		Optional<ProdutoModel> produto = produtoRepository.findById(idFun);
		try {
			model.addAttribute("produto", produto.get());
		}
		catch(Exception err) {return "redirect:/";}
		return("produto/alteraproduto");
	}
		}
