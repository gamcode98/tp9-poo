package ar.edu.unju.fi.poo.TPN9.service.imp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.poo.TPN9.dto.CuentaDTO;
import ar.edu.unju.fi.poo.TPN9.entity.Cuenta;
import ar.edu.unju.fi.poo.TPN9.exception.ModelException;
import ar.edu.unju.fi.poo.TPN9.repository.CuentaRepository;
import ar.edu.unju.fi.poo.TPN9.service.CuentaService;

@Service("cuentaServiceImp")
public class CuentaServiceImp implements CuentaService{
	
	private ModelMapper mapper = new ModelMapper();
	
	@Autowired
	private CuentaRepository cuentaRepository;	
	
	@Autowired
	private CuentaDTO cuentaDTO;
	
	@Autowired 
	private Cuenta cuenta;

	@Override
	public void agregarCuenta(CuentaDTO cuentaDTO) {		
		mapper.map(cuentaDTO, cuenta);
		cuentaRepository.save(cuenta);		
	}

	@Override
	public void eliminarCuenta(CuentaDTO cuentaDTO) {
		cuentaDTO = buscarCuenta(cuentaDTO.getNumero());
		mapper.map(cuentaDTO, cuenta);
		cuentaRepository.delete(cuenta);		
	}

	@Override
	public CuentaDTO buscarCuenta(Integer numero) throws ModelException {
		cuenta = cuentaRepository.findByNumero(numero);
		
		if(cuenta == null) {throw new ModelException("La cuenta no existe");}
		
		mapper.map(cuenta, cuentaDTO);		
		return cuentaDTO;					
	}

}
