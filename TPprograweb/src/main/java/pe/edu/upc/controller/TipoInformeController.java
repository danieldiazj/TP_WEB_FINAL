package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.TipoInforme;
import pe.edu.upc.service.ITipoInformeService;

@Named
@RequestScoped
public class TipoInformeController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ITipoInformeService tiService;
	private TipoInforme tipoinforme;
	List<TipoInforme> listaTipoInformes;

	@PostConstruct
	public void init() {
		this.listaTipoInformes = new ArrayList<TipoInforme>();
		this.tipoinforme = new TipoInforme();
		this.listar();
	}

	public String nuevoTipoInforme() {
		this.setTipoInforme(new TipoInforme());
		return "tipoInforme.xhtml";
	}

	public void insertar() {
		try {
			tiService.insertar(tipoinforme);
			limpiarTipoInforme();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listar() {
		try {
			listaTipoInformes = tiService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarTipoInforme() {
		this.init();
	}

	public void eliminar(TipoInforme ti) {
		try {
			tiService.eliminar(ti.getIdTipoInforme());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	
	public ITipoInformeService gettiService() {
		return tiService;
	}

	public void settiService(ITipoInformeService tiService) {
		this.tiService = tiService;
	}

	public TipoInforme getTipoInforme() {
		return tipoinforme;
	}

	public void setTipoInforme(TipoInforme tipoinforme) {
		this.tipoinforme = tipoinforme;
	}

	public List<TipoInforme> getListaTipoInforme() {
		return listaTipoInformes;
	}

	public void setListaTipoInformes(List<TipoInforme> listaTipoInformes) {
		this.listaTipoInformes = listaTipoInformes;
	}

}
