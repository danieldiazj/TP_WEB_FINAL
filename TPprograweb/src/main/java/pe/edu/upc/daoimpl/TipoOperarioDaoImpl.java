package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoOperarioDao;
import pe.edu.upc.entity.TipoOperario;

public class TipoOperarioDaoImpl implements ITipoOperarioDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "PostgresDS")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(TipoOperario tipooperario) {
		try {
			em.persist(tipooperario);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoOperario> listar() {
		List<TipoOperario> lista = new ArrayList<TipoOperario>();
		try {
			Query q = em.createQuery("from TipoOperario to");
			lista = (List<TipoOperario>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idTipoOperario) {
		TipoOperario to = new TipoOperario();
		try {
			to = em.getReference(TipoOperario.class, idTipoOperario);
			em.remove(to);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
