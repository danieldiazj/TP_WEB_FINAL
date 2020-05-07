package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Operario;
import pe.edu.upc.service.IOperarioService;
import pe.edu.upc.entity.TipoInforme;
import pe.edu.upc.service.ITipoInformeService;
import pe.edu.upc.entity.Informe;
import pe.edu.upc.service.IInformeService;

@Named
@RequestScoped
public class InformeController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IOperarioService oS;
	@Inject
	private ITipoInformeService tiS;
	@Inject
	private IInformeService iS;

	private Operario operario;
	private TipoInforme tipoinforme;
	private Informe informe;

	private List<Operario> listOperarios;
	private List<TipoInforme> listTipoInformes;
	private List<Informe> listInformes;

	@PostConstruct
	public void init() {
		operario = new Operario();
		tipoinforme = new TipoInforme();
		informe = new Informe();

		listOperarios = new ArrayList<>();
		listTipoInformes = new ArrayList<>();
		listInformes = new ArrayList<>();

		/* 56 */
		this.listOperario();
		this.listTipoInforme();
		this.listInforme();

	}

	public String newInforme() {
		this.setInforme(new Informe());
		return "informe.xhtml";
	}

	public void insert() {
		try {
			iS.insertar(informe);
			cleanInforme();
			this.listInforme();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void delete(Informe informe) {
		try {
			iS.eliminar(informe.getIdInforme());
			listInforme();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listInforme() {
		try {
			listInformes = iS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}


	public void listTipoInforme() {
		try {
			listTipoInformes = tiS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listOperario() {
		try {
			listOperarios = oS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	/* 115 */

	// ------------------------

	public void cleanInforme() {
		this.init();
	}

	public IOperarioService getoS() {
		return oS;
	}

	public void setoS(IOperarioService oS) {
		this.oS = oS;
	}

	public ITipoInformeService gettiS() {
		return tiS;
	}

	public void settiS(ITipoInformeService tiS) {
		this.tiS = tiS;
	}

	public IInformeService getiS() {
		return iS;
	}

	public void setiS(IInformeService iS) {
		this.iS = iS;
	}

// ------------------------

	public Operario getOperario() {
		return operario;
	}

	public void setOperario(Operario operario) {
		this.operario = operario;
	}

	public TipoInforme getTipoInforme() {
		return tipoinforme;
	}

	public void setTipoInforme(TipoInforme tipoinforme) {
		this.tipoinforme = tipoinforme;
	}

	public Informe getInforme() {
		return informe;
	}

	public void setInforme(Informe informe) {
		this.informe = informe;
	}

	// -----------------------
	public List<Operario> getListOperarios() {
		return listOperarios;
	}

	public void setOperarios(List<Operario> listOperarios) {
		this.listOperarios = listOperarios;
	}

	public List<TipoInforme> getListTipoInformes() {
		return listTipoInformes;
	}

	public void setListTipoInformes(List<TipoInforme> listTipoInformes) {
		this.listTipoInformes = listTipoInformes;
	}

	public List<Informe> getListInformes() {
		return listInformes;
	}

	public void setListInformes(List<Informe> listInformes) {
		this.listInformes = listInformes;
	}

}
