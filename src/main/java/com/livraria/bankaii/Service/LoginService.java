package com.livraria.bankaii.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.livraria.bankaii.Entity.Usuarios;
import com.livraria.bankaii.Repository.LoginRepository;

@Service
public class LoginService {
	
@Autowired(required = true)
private LoginRepository repo;
  

public Usuarios login(int login, String senha) {
	Usuarios user = repo.findByUsernameAndPassword(login, senha);
	   return user;
	   }
  
}
 