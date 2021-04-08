package br.grupo4.javops.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;

import br.grupo4.javops.model.Evento;

public interface EventoRepo extends CrudRepository<Evento, LocalDate>{
    public Evento findByDataEvt(LocalDate dataEvt);
}