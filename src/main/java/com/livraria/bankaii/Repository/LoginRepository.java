package com.livraria.bankaii.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.bankaii.Entity.Usuarios;

@Repository
public interface LoginRepository extends JpaRepository<Usuarios, String>{
Usuarios findByUsernameAndPassword(int login, String senha);

 
}