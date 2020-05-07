package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Gerente")
public class Gerente implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGerente;

	@Column(name = "nombre_Gerente", length = 30, nullable = false)
	private String nombreGerente;
	
	@Column(name = "apellidos_Gerente", length = 30, nullable = false)
	private String apellidosGerente;
	
	@Column(name = "telefono_Gerente", length = 20, nullable = false)
	private String telefonoGerente;
	
	@Column(name = "dni_Gerente", length = 8, nullable = false)
	private String dniGerente;

	public Gerente(int idGerente, String nombreGerente, String apellidosGerente, String telefonoGerente,
			String dniGerente) {
		super();
		this.idGerente = idGerente;
		this.nombreGerente = nombreGerente;
		this.apellidosGerente = apellidosGerente;
		this.telefonoGerente = telefonoGerente;
		this.dniGerente = dniGerente;
	}

	public Gerente() {
		super();
	}

	public int getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(int idGerente) {
		this.idGerente = idGerente;
	}

	public String getNombreGerente() {
		return nombreGerente;
	}

	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}

	public String getApellidosGerente() {
		return apellidosGerente;
	}

	public void setApellidosGerente(String apellidosGerente) {
		this.apellidosGerente = apellidosGerente;
	}

	public String getTelefonoGerente() {
		return telefonoGerente;
	}

	public void setTelefonoGerente(String telefonoGerente) {
		this.telefonoGerente = telefonoGerente;
	}

	public String getDniGerente() {
		return dniGerente;
	}

	public void setDniGerente(String dniGerente) {
		this.dniGerente = dniGerente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idGerente;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gerente other = (Gerente) obj;
		if (idGerente != other.idGerente)
			return false;
		return true;
	}	
	
	
}
