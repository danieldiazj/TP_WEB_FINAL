package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IOperarioDao;
import pe.edu.upc.entity.Operario;
import pe.edu.upc.service.IOperarioService;

@Named
@RequestScoped
public class OperarioServiceImpl implements IOperarioService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IOperarioDao oDao;

	@Override
	public void insertar(Operario operario) {
		oDao.insertar(operario);
	}

	@Override
	public List<Operario> listar() {
		return oDao.listar();
	}

	@Override
	public void eliminar(int idOperario) {
		oDao.eliminar(idOperario);

	}

}
