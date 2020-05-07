package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IInformeDao;
import pe.edu.upc.entity.Informe;
import pe.edu.upc.service.IInformeService;

@Named
@RequestScoped
public class InformeServiceImpl implements IInformeService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IInformeDao iDao;

	@Override
	public void insertar(Informe informe) {
		iDao.insertar(informe);
	}

	@Override
	public List<Informe> listar() {
		return iDao.listar();
	}

	@Override
	public void eliminar(int idInforme) {
		iDao.eliminar(idInforme);

	}

}
