package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Departamento;
import pe.edu.upc.service.IDepartamentoService;

@Named
@RequestScoped
public class DepartamentoController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IDepartamentoService dService;
	private Departamento departamento;
	List<Departamento> listaDepartamentos;

	@PostConstruct
	public void init() {
		this.listaDepartamentos = new ArrayList<Departamento>();
		this.departamento = new Departamento();
		this.listar();
	}

	public String nuevoDepartamento() {
		this.setDepartamento(new Departamento());
		return "departamento.xhtml";
	}

	public void insertar() {
		try {
			dService.insertar(departamento);
			limpiarDepartamento();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listar() {
		try {
			listaDepartamentos = dService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarDepartamento() {
		this.init();
	}

	public void eliminar(Departamento de) {
		try {
			dService.eliminar(de.getIdDepartamento());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento (Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Departamento> getListaDepartamento() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}

}
