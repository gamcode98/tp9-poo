package ar.edu.unju.fi.poo.TPN9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
	ClienteDTO clienteDTO1, clienteDTO2, adherenteDTO1, adherenteDTO2;
	
	@Autowired
	CuentaDTO cuentaDTO1;
		
	@BeforeEach
	void setUp() throws Exception {
		clienteDTO1 = new ClienteDTO("11.123.123", "aaa@gmail.com", "Av siempre viva 123", Boolean.TRUE, null);
		adherenteDTO1 = new ClienteDTO("11.123.123", "aaa@gmail.com", "Av siempre viva 123", Boolean.TRUE, null);
		List<ClienteDTO> adherentes = new ArrayList<ClienteDTO>(Arrays.asList(adherenteDTO1, adherenteDTO1));
		clienteDTO2 = new ClienteDTO("22.123.123", "bbb@gmail.com","Av poo 123",Boolean.TRUE, adherentes);
		cuentaDTO1 = new CuentaDTO(11111, LocalDate.now(), 123231.22, Boolean.TRUE, 15000.0, clienteDTO1);
	}

	@AfterEach
	void tearDown() throws Exception {
		clienteDTO1 = null;
		clienteDTO2 = null;
	}

	@Test
	@DisplayName("Crear cliente sin adherentes")
	void crearClienteSinAdherentes() {
		clienteService.agregarCliente(clienteDTO1);
		ClienteDTO clienteDTOBuscado = new ClienteDTO();
		clienteDTOBuscado = clienteService.buscarCliente(clienteDTO1.getDni());
		clienteService.eliminarCliente(clienteDTOBuscado);
	}
	
	@Test
	@Disabled
	@DisplayName("Crear cliente con adherentes")
	void crearClientesConAdherentes() {
		clienteService.agregarCliente(clienteDTO2);
		ClienteDTO clienteDTOBuscado = new ClienteDTO();
		clienteDTOBuscado = clienteService.buscarCliente(clienteDTO2.getDni());
		//clienteService.eliminarCliente(clienteDTOBuscado);
	}
	
	@Test
	@DisplayName("Crear cuenta")
	void crearCuenta() {
		cuentaService.agregarCuenta(cuentaDTO1);
	}

}
