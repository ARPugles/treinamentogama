package br.grupo4.javops.repository;

import org.springframework.data.repository.CrudRepository;

import br.grupo4.javops.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Integer>{
    public Usuario findByEmailOrRacf(String email, String racf);
}
