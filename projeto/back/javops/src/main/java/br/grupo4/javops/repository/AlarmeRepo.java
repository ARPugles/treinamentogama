package br.grupo4.javops.repository;

import org.springframework.data.repository.CrudRepository;

import br.grupo4.javops.model.Alarme;

public interface AlarmeRepo extends CrudRepository<Alarme, Integer>{
    public Alarme findByIdAlarme(int idAlarme);
}
