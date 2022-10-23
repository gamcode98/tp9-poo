package ar.edu.unju.fi.poo.TPN9.service;

import ar.edu.unju.fi.poo.TPN9.dto.ClienteDTO;
import ar.edu.unju.fi.poo.TPN9.entity.Cliente;
import ar.edu.unju.fi.poo.TPN9.exception.ModelException;

public interface ClienteService {
		
	public void agregarCliente(ClienteDTO clienteDTO);
	
	public ClienteDTO buscarCliente(String dni) throws ModelException;
	
	public void eliminarCliente(ClienteDTO clienteDTO);
}