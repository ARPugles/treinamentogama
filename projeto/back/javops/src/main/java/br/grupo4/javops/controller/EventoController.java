package br.grupo4.javops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.grupo4.javops.model.Evento;
import br.grupo4.javops.repository.EventoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/eventos")
public class EventoController {
    
    @Autowired
    private EventoRepo repo;

    @PostMapping("/relatorio")
    public ResponseEntity<Evento> periodo(@RequestBody Evento periodoEnviado) {
        
    }
}