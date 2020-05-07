package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Gerente;
import pe.edu.upc.entity.Sede;
import pe.edu.upc.entity.TipoOperario;
import pe.edu.upc.entity.Operario;
import pe.edu.upc.service.IGerenteService;
import pe.edu.upc.service.ISedeService;
import pe.edu.upc.service.ITipoOperarioService;
import pe.edu.upc.service.IOperarioService;


@Named
@RequestScoped
public class OperarioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IGerenteService gS;
	@Inject
	private ISedeService sS;
	@Inject
	private ITipoOperarioService tS;
	@Inject
	private IOperarioService oS;
	

	private Gerente gerente;
	private Sede sede;
	private TipoOperario tipooperario;
	private Operario operario;
	
	private List<Gerente> listGerentes;
	private List<Sede> listSedes;
	private List<TipoOperario> listTipoOperarios;
	private List<Operario> listOperarios;

	@PostConstruct
	public void init() {
		gerente = new Gerente();
		sede = new Sede();
		tipooperario = new TipoOperario();
		operario = new Operario();
		
		listGerentes = new ArrayList<>();
		listSedes = new ArrayList<>();
		listTipoOperarios = new ArrayList<>();
		listOperarios = new ArrayList<>();
		
		this.listGerente();
		this.listSede();
		this.listTipoOperario();
		this.listOperario();
	}

	public String newOperario() {
		this.setOperario(new Operario());
		return "operario.xhtml";
	}

	public void insert() {
		try {
			oS.insertar(operario);
			cleanOperario();
			this.listOperario();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void delete(Operario operario) {
		try {
			oS.eliminar(operario.getIdOperario());
			listOperario();
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

	public void listGerente() {
		try {
			listGerentes = gS.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listTipoOperario() {
		try {
			listTipoOperarios = tS.listar();
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

	//------------------------
	
	public void cleanOperario() {
		this.init();
	}

	public IGerenteService getgS() {
		return gS;
	}

	public void setgS(IGerenteService gS) {
		this.gS = gS;
	}
	
	public ITipoOperarioService gettS() {
		return tS;
	}

	public void settS(ITipoOperarioService tS) {
		this.tS = tS;
	}


	public ISedeService getsS() {
		return sS;
	}

	public void setsS(ISedeService sS) {
		this.sS = sS;
	}
	
	public IOperarioService getoS() {
		return oS;
	}

	public void setoS(IOperarioService oS) {
		this.oS = oS;
	}
	
// ------------------------
	
	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public TipoOperario getTipoOperario() {
		return tipooperario;
	}

	public void setTipoOperario(TipoOperario tipooperario) {
		this.tipooperario = tipooperario;
	}
	
	
	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	public Operario getOperario() {
		return operario;
	}

	public void setOperario(Operario operario) {
		this.operario = operario;
	}
	
	
	//-----------------------

	public List<Gerente> getListGerentes() {
		return listGerentes;
	}

	public void setGerentes(List<Gerente> listGerentes) {
		this.listGerentes = listGerentes;
	}
	
	public List<TipoOperario> getListTipoOperarios() {
		return listTipoOperarios;
	}

	public void setTipoOperarios(List<TipoOperario> listTipoOperarios) {
		this.listTipoOperarios = listTipoOperarios;
	}

	public List<Sede> getListSedes() {
		return listSedes;
	}

	public void setListSedes(List<Sede> listSedes) {
		this.listSedes = listSedes;
	}
	
	public List<Operario> getListOperarios() {
		return listOperarios;
	}

	public void setListOperarios(List<Operario> listOperarios) {
		this.listOperarios = listOperarios;
	}
	
}
