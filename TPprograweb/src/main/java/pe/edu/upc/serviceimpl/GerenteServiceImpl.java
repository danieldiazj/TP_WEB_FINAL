package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IGerenteDao;
import pe.edu.upc.entity.Gerente;
import pe.edu.upc.service.IGerenteService;

@Named
@RequestScoped
public class GerenteServiceImpl implements IGerenteService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IGerenteDao gDao;

	@Override
	public void insertar(Gerente gerente) {
		gDao.insertar(gerente);
	}

	@Override
	public List<Gerente> listar() {
		return gDao.listar();
	}

	@Override
	public void eliminar(int idGerente) {
		gDao.eliminar(idGerente);

	}

}
