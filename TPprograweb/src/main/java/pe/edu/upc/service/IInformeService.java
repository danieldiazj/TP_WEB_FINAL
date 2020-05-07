package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Informe;

public interface IInformeService {
	public void insertar(Informe informe);

	public List<Informe> listar();

	public void eliminar(int idInforme);
}
