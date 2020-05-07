package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Operario;

public interface IOperarioService {
	public void insertar(Operario operario);

	public List<Operario> listar();

	public void eliminar(int idOperario);
}
