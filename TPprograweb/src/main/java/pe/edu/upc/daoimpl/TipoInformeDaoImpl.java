package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoInformeDao;
import pe.edu.upc.entity.TipoInforme;

public class TipoInformeDaoImpl implements ITipoInformeDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "PostgresDS")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(TipoInforme tipoinforme) {
		try {
			em.persist(tipoinforme);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoInforme> listar() {
		List<TipoInforme> lista = new ArrayList<TipoInforme>();
		try {
			Query q = em.createQuery("from TipoInforme ti");
			lista = (List<TipoInforme>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idTipoInforme) {
		TipoInforme ti = new TipoInforme();
		try {
			ti = em.getReference(TipoInforme.class, idTipoInforme);
			em.remove(ti);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
