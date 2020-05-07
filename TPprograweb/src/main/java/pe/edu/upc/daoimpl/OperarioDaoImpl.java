package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IOperarioDao;
import pe.edu.upc.entity.Operario;

public class OperarioDaoImpl implements IOperarioDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "PostgresDS")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Operario operario) {
		try {
			em.persist(operario);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Operario> listar() {
		List<Operario> lista = new ArrayList<Operario>();
		try {
			Query q = em.createQuery("from Operario o");
			lista = (List<Operario>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idOperario) {
		Operario o = new Operario();
		try {
			o = em.getReference(Operario.class, idOperario);
			em.remove(o);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
