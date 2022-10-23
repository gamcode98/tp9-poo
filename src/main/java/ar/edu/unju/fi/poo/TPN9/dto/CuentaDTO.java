package ar.edu.unju.fi.poo.TPN9.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class CuentaDTO {
	
	private Integer numero;
	
	private LocalDate fechaIngreso;
	
	private Double saldo;
	
	private Boolean estado;
	
	private Double limiteExtraccion;
	
	private ClienteDTO cliente;	

	public CuentaDTO(Integer numero, LocalDate fechaIngreso, Double saldo, Boolean estado, Double limiteExtraccion,
			ClienteDTO cliente) {
		super();
		this.numero = numero;
		this.fechaIngreso = fechaIngreso;
		this.saldo = saldo;
		this.estado = estado;
		this.limiteExtraccion = limiteExtraccion;
		this.cliente = cliente;
	}
	
	public CuentaDTO() {
		// TODO Auto-generated constructor stub
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Double getLimiteExtraccion() {
		return limiteExtraccion;
	}

	public void setLimiteExtraccion(Double limiteExtraccion) {
		this.limiteExtraccion = limiteExtraccion;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "CuentaDTO [numero=" + numero + ", fechaIngreso=" + fechaIngreso + ", saldo=" + saldo + ", estado="
				+ estado + ", limiteExtraccion=" + limiteExtraccion + "]";
	}	

}
