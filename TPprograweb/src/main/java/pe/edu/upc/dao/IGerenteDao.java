package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Gerente;

public interface IGerenteDao {
	public void insertar(Gerente gerente);
	public List<Gerente> listar();
	public void eliminar(int idGerente);
}
