package ar.edu.unju.fi.poo.TPN9.dto;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;

import org.springframework.stereotype.Component;

@Component
public class ClienteDTO {
	
	private String dni;
	
	private String email;
	
	private String domicilio;
	
	private Boolean estado;
	
	@ElementCollection(fetch = FetchType.LAZY)
	private List<ClienteDTO> adherentes;
	
	public ClienteDTO() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDTO(String dni, String email, String domicilio, Boolean estado, List<ClienteDTO> adherentes) {
		super();
		this.dni = dni;
		this.email = email;
		this.domicilio = domicilio;
		this.estado = estado;
		this.adherentes = adherentes;
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

	public List<ClienteDTO> getAdherentes() {
		return adherentes;
	}

	public void setAdherentes(List<ClienteDTO> adherentes) {
		this.adherentes = adherentes;
	}

	@Override
	public String toString() {
		return "ClienteDTO [dni=" + dni + ", email=" + email + ", domicilio=" + domicilio + ", estado=" + estado
				+ ", adherentes=" + adherentes + "]";
	}
	

}
