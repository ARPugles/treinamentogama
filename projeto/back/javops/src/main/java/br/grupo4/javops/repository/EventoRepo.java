package br.grupo4.javops.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.grupo4.javops.model.Evento;

public interface EventoRepo extends CrudRepository<Evento, Integer>{
    public List<Evento> findByDataevtBetweenOrderByDataevt(LocalDate iniDate, LocalDate finalDate);
}