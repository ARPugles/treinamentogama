package br.pugles.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.pugles.spring02.model.Usuario;
import br.pugles.spring02.repo.UsuarioRepo;

@RestController
@CrossOrigin("*") //aceita requisições de qq domínio
@RequestMapping("/user")
public class UsuarioController {
    
    @Autowired // injeção de dependência
    private UsuarioRepo repo;

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> getUser(@PathVariable int id) {
        Usuario usuarioEncontrado = repo.findById(id).orElse(null);

        if(usuarioEncontrado != null) { // achou
            return ResponseEntity.ok(usuarioEncontrado);
        }        
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<Usuario> getAllUser() {
        List<Usuario> lista =  (List<Usuario>) repo.findAll();

        return lista;
    } 

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario userParam) {
        Usuario usuarioEncontrado = repo.findByEmailAndSenha(userParam.getEmail(), userParam.getSenha());

        if(usuarioEncontrado != null) { // achou
            usuarioEncontrado.setSenha("********");
            return ResponseEntity.ok(usuarioEncontrado);
        }        
        return ResponseEntity.notFound().build();
    }

}
