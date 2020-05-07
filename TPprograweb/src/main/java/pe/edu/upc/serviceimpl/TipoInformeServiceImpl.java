package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoInformeDao;
import pe.edu.upc.entity.TipoInforme;
import pe.edu.upc.service.ITipoInformeService;

@Named
@RequestScoped
public class TipoInformeServiceImpl implements ITipoInformeService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ITipoInformeDao tiDao;

	@Override
	public void insertar(TipoInforme tipoinforme) {
		tiDao.insertar(tipoinforme);
	}

	@Override
	public List<TipoInforme> listar() {
		return tiDao.listar();
	}

	@Override
	public void eliminar(int idTipoInforme) {
		tiDao.eliminar(idTipoInforme);

	}

}
