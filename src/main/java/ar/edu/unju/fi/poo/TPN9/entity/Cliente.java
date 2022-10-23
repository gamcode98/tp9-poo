package ar.edu.unju.fi.poo.TPN9.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "domicilio")
	private String domicilio;
	
	@Column(name = "estado")
	private Boolean estado;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "adherentes")
	@ElementCollection(fetch = FetchType.LAZY)
	private List<Cliente> adherentes;

	/**
	 * Constructor por defecto
	 * 
	 */
	public Cliente() {
		
	}
	
	/**
	 * Constructor parametrizado
	 * 
	 * @param dni
	 * @param email
	 * @param domicilio
	 * @param estado
	 * @param adherentes
	 */
	public Cliente(String dni, String email, String domicilio, Boolean estado, List<Cliente> adherentes) {
		super();
		this.dni = dni;
		this.email = email;
		this.domicilio = domicilio;
		this.estado = estado;
		this.adherentes = adherentes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public List<Cliente> getAdherentes() {
		return adherentes;
	}

	public void setAdherentes(List<Cliente> adherentes) {
		this.adherentes = adherentes;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", email=" + email + ", domicilio=" + domicilio + ", estado=" + estado + "]";
	}	
}