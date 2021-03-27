package br.pugles.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.pugles.spring02.model.Usuario;

// CRUD = Create, Read, Update, Delete
public interface UsuarioRepo extends CrudRepository <Usuario, Integer> {
    public Usuario findByEmailAndSenha(String email, String senha);
}