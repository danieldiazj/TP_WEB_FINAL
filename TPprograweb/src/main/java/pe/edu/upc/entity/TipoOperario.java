package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoOperario")
public class TipoOperario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoOperario;

	@Column(name = "nombre_TipoOperario", length = 30, nullable = false)
	private String nombreTipoOperario;

	@Column(name = "descripcion_TipoOperario", length = 60, nullable = false)
	private String descripcionTipoOperario;

	public TipoOperario(int idTipoOperario, String nombreTipoOperario, String descripcionTipoOperario) {
		super();
		this.idTipoOperario = idTipoOperario;
		this.nombreTipoOperario = nombreTipoOperario;
		this.descripcionTipoOperario = descripcionTipoOperario;
	}

	public TipoOperario() {
		super();
	}

	public int getIdTipoOperario() {
		return idTipoOperario;
	}

	public void setIdTipoOperario(int idTipoOperario) {
		this.idTipoOperario = idTipoOperario;
	}

	public String getNombreTipoOperario() {
		return nombreTipoOperario;
	}

	public void setNombreTipoOperario(String nombreTipoOperario) {
		this.nombreTipoOperario = nombreTipoOperario;
	}

	public String getDescripcionTipoOperario() {
		return descripcionTipoOperario;
	}

	public void setDescripcionTipoOperario(String descripcionTipoOperario) {
		this.descripcionTipoOperario = descripcionTipoOperario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTipoOperario;
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
		TipoOperario other = (TipoOperario) obj;
		if (idTipoOperario != other.idTipoOperario)
			return false;
		return true;
	}
//chadman de mrd sss pierina lame pios
}
