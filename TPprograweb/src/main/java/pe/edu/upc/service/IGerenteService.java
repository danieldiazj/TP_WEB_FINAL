package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Gerente;

public interface IGerenteService {
	public void insertar(Gerente gerente);

	public List<Gerente> listar();

	public void eliminar(int idGerente);
}
