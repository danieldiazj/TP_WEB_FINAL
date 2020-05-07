package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISedeDao;
import pe.edu.upc.entity.Sede;
import pe.edu.upc.service.ISedeService;

@Named
@RequestScoped
public class SedeServiceImpl implements ISedeService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ISedeDao sDao;

	@Override
	public void insertar(Sede sede) {
		sDao.insertar(sede);
	}

	@Override
	public List<Sede> listar() {
		return sDao.listar();
	}

	@Override
	public void eliminar(int idSede) {
		sDao.eliminar(idSede);

	}

}
