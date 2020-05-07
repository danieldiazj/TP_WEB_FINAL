package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoOperarioDao;
import pe.edu.upc.entity.TipoOperario;
import pe.edu.upc.service.ITipoOperarioService;

@Named
@RequestScoped
public class TipoOperarioServiceImpl implements ITipoOperarioService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ITipoOperarioDao toDao;

	@Override
	public void insertar(TipoOperario tipooperario) {
		toDao.insertar(tipooperario);
	}

	@Override
	public List<TipoOperario> listar() {
		return toDao.listar();
	}

	@Override
	public void eliminar(int idTipoOperario) {
		toDao.eliminar(idTipoOperario);

	}

}
