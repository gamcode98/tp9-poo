package ar.edu.unju.fi.poo.TPN9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ar.edu.unju.fi.poo.TPN9.dto.ClienteDTO;
import ar.edu.unju.fi.poo.TPN9.dto.CuentaDTO;
import ar.edu.unju.fi.poo.TPN9.service.ClienteService;
import ar.edu.unju.fi.poo.TPN9.service.CuentaService;

@SpringBootTest
class Tpn9ApplicationTests {
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	CuentaService cuentaService;
	
	@Autowired
	ClienteDTO clienteDTO1, clienteDTO2;
	
	@Autowired
	CuentaDTO cuentaDTO1;
		
	@BeforeEach
	void setUp() throws Exception {
		clienteDTO1 = new ClienteDTO("12.123.123", "aaa@gmail.com", "Av siempre viva 123", Boolean.TRUE, null);		
		
	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	@DisplayName("Crear cliente sin adherente")
	void contextLoads() {
		clienteService.agregarCliente(clienteDTO1);
		ClienteDTO clienteDTOBuscado = new ClienteDTO();
		clienteDTOBuscado = clienteService.buscarCliente(clienteDTO1.getDni());
		
	}

}
