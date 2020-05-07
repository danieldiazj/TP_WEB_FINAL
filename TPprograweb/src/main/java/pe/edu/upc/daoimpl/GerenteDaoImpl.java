package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IGerenteDao;
import pe.edu.upc.entity.Gerente;

public class GerenteDaoImpl implements IGerenteDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "PostgresDS")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Gerente gerente) {
		try {
			em.persist(gerente);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Gerente> listar() {
		List<Gerente> lista = new ArrayList<Gerente>();
		try {
			Query q = em.createQuery("from Gerente g");
			lista = (List<Gerente>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idGerente) {
		Gerente g = new Gerente();
		try {
			g = em.getReference(Gerente.class, idGerente);
			em.remove(g);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
