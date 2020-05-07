package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDepartamentoDao;
import pe.edu.upc.entity.Departamento;

public class DepartamentoDaoImpl implements IDepartamentoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "PostgresDS")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Departamento departamento) {
		try {
			em.persist(departamento);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Departamento> listar() {
		List<Departamento> lista = new ArrayList<Departamento>();
		try {
			Query q = em.createQuery("from Departamento d");
			lista = (List<Departamento>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idDepartamento) {
		Departamento d = new Departamento();
		try {
			d = em.getReference(Departamento.class, idDepartamento);
			em.remove(d);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
