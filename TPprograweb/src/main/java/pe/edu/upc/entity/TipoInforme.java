package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoInforme")
public class TipoInforme implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoInforme;

	@Column(name = "nombre_TipoInforme", length = 30, nullable = false)
	private String nombreTipoInforme;

	@Column(name = "descripcion_TipoInforme", length = 60, nullable = false)
	private String descripcionTipoInforme;

	public TipoInforme(int idTipoInforme, String nombreTipoInforme, String descripcionTipoInforme) {
		super();
		this.idTipoInforme = idTipoInforme;
		this.nombreTipoInforme = nombreTipoInforme;
		this.descripcionTipoInforme = descripcionTipoInforme;
	}

	public TipoInforme() {
		super();
	}

	public int getIdTipoInforme() {
		return idTipoInforme;
	}

	public void setIdTipoInforme(int idTipoInforme) {
		this.idTipoInforme = idTipoInforme;
	}

	public String getNombreTipoInforme() {
		return nombreTipoInforme;
	}

	public void setNombreTipoInforme(String nombreTipoInforme) {
		this.nombreTipoInforme = nombreTipoInforme;
	}

	public String getDescripcionTipoInforme() {
		return descripcionTipoInforme;
	}

	public void setDescripcionTipoInforme(String descripcionTipoInforme) {
		this.descripcionTipoInforme = descripcionTipoInforme;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTipoInforme;
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
		TipoInforme other = (TipoInforme) obj;
		if (idTipoInforme != other.idTipoInforme)
			return false;
		return true;
	}

	
	
}
