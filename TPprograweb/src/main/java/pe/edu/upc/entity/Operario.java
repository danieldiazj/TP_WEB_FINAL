package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Operario")
public class Operario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOperario;

	@Column(name = "nombre_Operario", length = 30, nullable = false)
	private String nombreOperario;

	@Column(name = "apellidos_Operario", length = 30, nullable = false)
	private String apellidosOperario;

	@Column(name = "telefono_Operario", length = 20, nullable = false)
	private String telefonoOperario;

	@Column(name = "dni_Operario", length = 8, nullable = false)
	private String dniOperario;

	@Column(name = "placa_Operario", length = 6, nullable = true)
	private String placaOperario;

	@ManyToOne
	@JoinColumn(name = "idGerente", nullable = false)
	private Gerente gerente;

	@ManyToOne
	@JoinColumn(name = "idTipoOperario", nullable = false)
	private TipoOperario tipooperario;

	@ManyToOne
	@JoinColumn(name = "idSede", nullable = false)
	private Sede sede;

	public Operario(int idOperario, String nombreOperario, String apellidosOperario, String telefonoOperario,
			String dniOperario, String placaOperario, Gerente gerente, TipoOperario tipooperario, Sede sede) {
		super();
		this.idOperario = idOperario;
		this.nombreOperario = nombreOperario;
		this.apellidosOperario = apellidosOperario;
		this.telefonoOperario = telefonoOperario;
		this.dniOperario = dniOperario;
		this.placaOperario = placaOperario;
		this.gerente = gerente; //FK
		this.tipooperario = tipooperario; //FK
		this.sede = sede; //FK
	}

	public Operario() {
		super();
	}

	public int getIdOperario() {
		return idOperario;
	}

	public void setIdOperario(int idOperario) {
		this.idOperario = idOperario;
	}

	public String getNombreOperario() {
		return nombreOperario;
	}

	public void setNombreOperario(String nombreOperario) {
		this.nombreOperario = nombreOperario;
	}

	public String getApellidosOperario() {
		return apellidosOperario;
	}

	public void setApellidosOperario(String apellidosOperario) {
		this.apellidosOperario = apellidosOperario;
	}

	public String getTelefonoOperario() {
		return telefonoOperario;
	}

	public void setTelefonoOperario(String telefonoOperario) {
		this.telefonoOperario = telefonoOperario;
	}

	public String getDniOperario() {
		return dniOperario;
	}

	public void setDniOperario(String dniOperario) {
		this.dniOperario = dniOperario;
	}

	public String getPlacaOperario() {
		return placaOperario;
	}

	public void setPlacaOperario(String placaOperario) {
		this.placaOperario = placaOperario;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public TipoOperario getTipooperario() {
		return tipooperario;
	}

	public void setTipooperario(TipoOperario tipooperario) {
		this.tipooperario = tipooperario;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idOperario;
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
		Operario other = (Operario) obj;
		if (idOperario != other.idOperario)
			return false;
		return true;
	}
	
	

	
}
