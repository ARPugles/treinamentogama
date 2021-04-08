package br.grupo4.javops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.grupo4.javops.model.Alarme;
import br.grupo4.javops.repository.AlarmeRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/alarmes")
public class AlarmeController {

    @Autowired
    private AlarmeRepo repo;

    @GetMapping("/all")
    public List<Alarme> getAllAlarmes() {
        List<Alarme> lista = (List<Alarme>) repo.findAll();
        return lista;
    }

}
