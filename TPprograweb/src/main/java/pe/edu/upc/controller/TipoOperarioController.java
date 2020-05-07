package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entity.TipoOperario;
import pe.edu.upc.service.ITipoOperarioService;

@Named
@RequestScoped
public class TipoOperarioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ITipoOperarioService toService;
	private TipoOperario TipoOperario;
	List<TipoOperario> listaTipoOperarios;

	@PostConstruct
	public void init() {
		this.listaTipoOperarios = new ArrayList<TipoOperario>();
		this.TipoOperario = new TipoOperario();
		this.listar();
	}

	public String nuevoTipoOperario() {
		this.setTipoOperario(new TipoOperario());
		return "tipoOperario.xhtml";
	}

	public void insertar() {
		try {
			toService.insertar(TipoOperario);
			limpiarTipoOperario();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listar() {
		try {
			listaTipoOperarios = toService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void limpiarTipoOperario() {
		this.init();
	}
	
	public void eliminar(TipoOperario to) {
		try {
			toService.eliminar(to.getIdTipoOperario());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	

	public ITipoOperarioService gettoService() {
		return toService;
	}

	public void settoService(ITipoOperarioService toService) {
		this.toService = toService;
	}

	public TipoOperario getTipoOperario() {
		return TipoOperario;
	}

	public void setTipoOperario (TipoOperario tipooperario) {
		this.TipoOperario= tipooperario;
	}

	public List<TipoOperario> getListaTipoOperario() {
		return listaTipoOperarios;
	}

	public void setListaTipoOperarios(List<TipoOperario> listaTipoOperarios) {
		this.listaTipoOperarios = listaTipoOperarios;
	}

}
