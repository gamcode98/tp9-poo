package ar.edu.unju.fi.poo.TPN9.service;

import ar.edu.unju.fi.poo.TPN9.dto.CuentaDTO;
import ar.edu.unju.fi.poo.TPN9.exception.ModelException;

public interface CuentaService {
	
	public void agregarCuenta(CuentaDTO cuentaDTO);
	
	public void eliminarCuenta(CuentaDTO cuentaDTO);
	
	public CuentaDTO buscarCuenta(Integer numero) throws ModelException;
	
}
