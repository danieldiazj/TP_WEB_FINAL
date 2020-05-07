package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entity.Gerente;
import pe.edu.upc.service.IGerenteService;

@Named
@RequestScoped
public class GerenteController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IGerenteService gService;
	private Gerente gerente;
	List<Gerente> listaGerentes;

	@PostConstruct
	public void init() {
		this.listaGerentes = new ArrayList<Gerente>();
		this.gerente = new Gerente();
		this.listar();
	}

	public String nuevoGerente() {
		this.setGerente(new Gerente());
		return "gerente.xhtml";
	}

	public void insertar() {
		try {
			gService.insertar(gerente);
			limpiarGerente();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listar() {
		try {
			listaGerentes = gService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarGerente() {
		this.init();
	}
	
	
	public void eliminar(Gerente ge) {
		try {
			gService.eliminar(ge.getIdGerente());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public IGerenteService getgService() {
		return gService;
	}

	public void setgService(IGerenteService gService) {
		this.gService = gService;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente (Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Gerente> getListaGerente() {
		return listaGerentes;
	}

	public void setListaGerentes(List<Gerente> listaGerentes) {
		this.listaGerentes = listaGerentes;
	}

}
