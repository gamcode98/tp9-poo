package ar.edu.unju.fi.poo.TPN9.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.poo.TPN9.entity.Cuenta;

@Repository
public interface CuentaRepository extends CrudRepository<Cuenta, Long>{
	
	public Cuenta findByNumero(Integer numero);

}
