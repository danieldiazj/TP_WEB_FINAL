package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IInformeDao;
import pe.edu.upc.entity.Informe;

public class InformeDaoImpl implements IInformeDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "PostgresDS")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Informe informe) {
		try {
			em.persist(informe);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Informe> listar() {
		List<Informe> lista = new ArrayList<Informe>();
		try {
			Query q = em.createQuery("from Informe i");
			lista = (List<Informe>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idInforme) {
		Informe i = new Informe();
		try {
			i = em.getReference(Informe.class, idInforme);
			em.remove(i);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
