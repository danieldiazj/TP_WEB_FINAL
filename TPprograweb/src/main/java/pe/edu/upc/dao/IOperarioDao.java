package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Operario;

public interface IOperarioDao {
	public void insertar(Operario operario);
	public List<Operario> listar();
	public void eliminar(int idOperario);
}
