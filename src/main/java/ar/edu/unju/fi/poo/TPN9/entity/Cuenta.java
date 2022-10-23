package ar.edu.unju.fi.poo.TPN9.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "cuentas")
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "numero")
	private Integer numero;
	
	@Column(name = "fecha_ingreso")
	private LocalDate fechaIngreso;
	
	@Column(name = "saldo")
	private Double saldo;
	
	@Column(name = "estado")
	private Boolean estado;
	
	@Column(name = "limite_extraccion")
	private Double limiteExtraccion;	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = false)
	private Cliente cliente;
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}	

	public Cuenta(Long id, Integer numero, LocalDate fechaIngreso, Double saldo, Boolean estado,
			Double limiteExtraccion, Cliente cliente) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaIngreso = fechaIngreso;
		this.saldo = saldo;
		this.estado = estado;
		this.limiteExtraccion = limiteExtraccion;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", numero=" + numero + ", fechaIngreso=" + fechaIngreso + ", saldo=" + saldo
				+ ", estado=" + estado + ", limiteExtraccion=" + limiteExtraccion + "]";
	}	

}
