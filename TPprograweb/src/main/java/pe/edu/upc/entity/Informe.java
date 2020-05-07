package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Informe")
public class Informe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInforme;

	private Date fecha_Informe;

	@Column(name = "provincia_Proceso", length = 20, nullable = false)
	private String provinciaProceso;

	private int pesototal_Mezcla;
	
	@ManyToOne
	@JoinColumn(name = "idOperario", nullable = false)
	private Operario operario;
	
	@Column(name = "notas_Informe", length = 60, nullable = false)
	private String notasInforme;

	private int proporcion_HierroEsponja;
	
	private int proporcion_AceroReciclado;
	
	private int temperatura_Mezcla;
	
	private int cantidad_BarrasMetalicas;
	
	private int dimension_Barras;
	
	
	@ManyToOne
	@JoinColumn(name = "idTipoInforme", nullable = false)
	private TipoInforme tipoinforme;


	public Informe(int idInforme, Date fecha_Informe, String provinciaProceso, int pesototal_Mezcla, Operario operario,
			String notasInforme, int proporcion_HierroEsponja, int proporcion_AceroReciclado, int temperatura_Mezcla,
			int cantidad_BarrasMetalicas, int dimension_Barras, TipoInforme tipoinforme) {
		super();
		this.idInforme = idInforme;
		this.fecha_Informe = fecha_Informe;
		this.provinciaProceso = provinciaProceso;
		this.pesototal_Mezcla = pesototal_Mezcla;
		this.operario = operario;
		this.notasInforme = notasInforme;
		this.proporcion_HierroEsponja = proporcion_HierroEsponja;
		this.proporcion_AceroReciclado = proporcion_AceroReciclado;
		this.temperatura_Mezcla = temperatura_Mezcla;
		this.cantidad_BarrasMetalicas = cantidad_BarrasMetalicas;
		this.dimension_Barras = dimension_Barras;
		this.tipoinforme = tipoinforme;
	}


	public Informe() {
		super();
	}


	public int getIdInforme() {
		return idInforme;
	}


	public void setIdInforme(int idInforme) {
		this.idInforme = idInforme;
	}


	public Date getFecha_Informe() {
		return fecha_Informe;
	}


	public void setFecha_Informe(Date fecha_Informe) {
		this.fecha_Informe = fecha_Informe;
	}


	public String getProvinciaProceso() {
		return provinciaProceso;
	}


	public void setProvinciaProceso(String provinciaProceso) {
		this.provinciaProceso = provinciaProceso;
	}


	public int getPesototal_Mezcla() {
		return pesototal_Mezcla;
	}


	public void setPesototal_Mezcla(int pesototal_Mezcla) {
		this.pesototal_Mezcla = pesototal_Mezcla;
	}


	public Operario getOperario() {
		return operario;
	}


	public void setOperario(Operario operario) {
		this.operario = operario;
	}


	public String getNotasInforme() {
		return notasInforme;
	}


	public void setNotasInforme(String notasInforme) {
		this.notasInforme = notasInforme;
	}


	public int getProporcion_HierroEsponja() {
		return proporcion_HierroEsponja;
	}


	public void setProporcion_HierroEsponja(int proporcion_HierroEsponja) {
		this.proporcion_HierroEsponja = proporcion_HierroEsponja;
	}


	public int getProporcion_AceroReciclado() {
		return proporcion_AceroReciclado;
	}


	public void setProporcion_AceroReciclado(int proporcion_AceroReciclado) {
		this.proporcion_AceroReciclado = proporcion_AceroReciclado;
	}


	public int getTemperatura_Mezcla() {
		return temperatura_Mezcla;
	}


	public void setTemperatura_Mezcla(int temperatura_Mezcla) {
		this.temperatura_Mezcla = temperatura_Mezcla;
	}


	public int getCantidad_BarrasMetalicas() {
		return cantidad_BarrasMetalicas;
	}


	public void setCantidad_BarrasMetalicas(int cantidad_BarrasMetalicas) {
		this.cantidad_BarrasMetalicas = cantidad_BarrasMetalicas;
	}


	public int getDimension_Barras() {
		return dimension_Barras;
	}


	public void setDimension_Barras(int dimension_Barras) {
		this.dimension_Barras = dimension_Barras;
	}


	public TipoInforme getTipoinforme() {
		return tipoinforme;
	}


	public void setTipoinforme(TipoInforme tipoinforme) {
		this.tipoinforme = tipoinforme;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idInforme;
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
		Informe other = (Informe) obj;
		if (idInforme != other.idInforme)
			return false;
		return true;
	}

	
	
	
}
