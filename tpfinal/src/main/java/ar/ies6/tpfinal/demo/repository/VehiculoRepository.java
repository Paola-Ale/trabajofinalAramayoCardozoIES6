package ar.ies6.tpfinal.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import ar.ies6.tpfinal.demo.model.Vehiculo;

@repository

public interface VehiculoRepository extends CrudRepository<Vehiculo,String>{

    public List<Vehiculo> findByEstado (Boolean estado);    
}
