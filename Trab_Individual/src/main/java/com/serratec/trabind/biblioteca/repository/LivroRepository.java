package com.serratec.trabind.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serratec.trabind.biblioteca.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
