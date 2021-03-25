package br.pugles.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pugles.spring02.model.Usuario;
import br.pugles.spring02.repo.UsuarioRepo;

@RestController
@CrossOrigin("*") // aceita requisições de qualquer domínio
@RequestMapping("/user")
public class UsuarioController {

    @Autowired // injeção de dependência
    private UsuarioRepo repo;

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> getUser(@PathVariable int id) {
        Usuario usuarioencontrado = repo.findById(id).orElse(null);

        if(usuarioencontrado != null) {
            return ResponseEntity.ok(usuarioencontrado);
        }
        return ResponseEntity.notFound().build();
    }
    
}
