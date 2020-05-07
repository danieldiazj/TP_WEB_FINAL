package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Departamento;
import pe.edu.upc.entity.Sede;
import pe.edu.upc.service.IDepartamentoService;
import pe.edu.upc.service.ISedeService;

@Named
@RequestScoped
public class SedeController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IDepartamentoService dS;
	@Inject
	private ISedeService sS;

	private Departamento departamento;
	private Sede sede;
	private List<Departamento> listDepartamentos;
	private List<Sede> listSedes;

	@PostConstruct
	public void init() {
		departamento = new Departamento();
		sede = new Sede();
		listDepartamentos = new ArrayList<>();
		listSedes = new ArrayList<>();
		this.listDepartamento();
		this.listSede();
	}

	public String newSede() {
		this.setSede(new Sede());
		return "sede.xhtml";
	}

	public void insert() {
		try {
			sS.insertar(sede);
			cleanPart();
			this.listSede();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void delete(Sede sede) {
		try {
			sS.eliminar(sede.getIdSede());
			listSede();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listSede() {
		try {
			listSedes = sS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listDepartamento() {
		try {
			listDepartamentos = dS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	
	
	public void cleanPart() {
		this.init();
	}

	public IDepartamentoService getdS() {
		return dS;
	}

	public void setdS(IDepartamentoService dS) {
		this.dS = dS;
	}

	public ISedeService getsS() {
		return sS;
	}

	public void setsS(ISedeService sS) {
		this.sS = sS;
	}

	//----------------------------
	
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	//--------------------------

	public List<Departamento> getListDepartamentos() {
		return listDepartamentos;
	}

	public void setDepartamentos(List<Departamento> listDepartamentos) {
		this.listDepartamentos = listDepartamentos;
	}

	public List<Sede> getListSedes() {
		return listSedes;
	}

	public void setListSedes(List<Sede> listSedes) {
		this.listSedes = listSedes;
	}
}
