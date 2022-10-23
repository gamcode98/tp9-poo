package ar.edu.unju.fi.poo.TPN9.service.imp;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.poo.TPN9.dto.ClienteDTO;
import ar.edu.unju.fi.poo.TPN9.entity.Cliente;
import ar.edu.unju.fi.poo.TPN9.exception.ModelException;
import ar.edu.unju.fi.poo.TPN9.repository.ClienteRepository;
import ar.edu.unju.fi.poo.TPN9.service.ClienteService;

@Service("clienteServiceImp")
public class ClienteServiceImp implements ClienteService {
	
	private ModelMapper mapper = new ModelMapper();

	@Autowired 
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteDTO clienteDTO;
	
	@Autowired
	private Cliente cliente;
	
	
	@Override
	public void agregarCliente(ClienteDTO clienteDTO) {
		mapper.map(clienteDTO, cliente);
		clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public ClienteDTO buscarCliente(String dni) throws ModelException {
		cliente = clienteRepository.findByDni(dni);
		
		System.out.println("cliente -> " + cliente);
		
		if(cliente == null) {
			throw new ModelException("El cliente no existe");
		}
		
		mapper.map(cliente,clienteDTO);
		
		System.out.println("clienteDTO -> " + clienteDTO);
		
		return clienteDTO;
		
	}
	
	@Transactional
	@Override
	public void eliminarCliente(ClienteDTO clienteDTO) {
		clienteDTO = buscarCliente(clienteDTO.getDni());
		mapper.map(clienteDTO, cliente);
		clienteRepository.delete(cliente);
	}
}