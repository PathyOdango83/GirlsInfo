package com.girlsinfo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
 @GetMapping("/login")
 public String showLogin() {
  return "login";
 }
 //Check for Credentials
 @PostMapping("/login")
 public String login(@ModelAttribute(name="loginForm") Login login, Model m) {
  String uname = login.getUser();
  String pass = login.getSenha();
  if(uname.equals("Admin") && pass.equals("Admin@123")) {
   m.addAttribute("uname", uname);
   m.addAttribute("pass", pass);
   return "Bem vindo";
  }
  m.addAttribute("error", "senha e usuários incorretos");
  return "login";
  
 }
}