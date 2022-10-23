package ar.edu.unju.fi.poo.TPN9.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.poo.TPN9.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

	/**
	 * Retorno el objeto como un flujo de datos
	 * 
	 */
	public Optional<Cliente> findById(Long id);
	
	public Cliente findByDni(String dni);
}