package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Informe;

public interface IInformeDao {
	public void insertar(Informe informe);
	public List<Informe> listar();
	public void eliminar(int idInforme);
}
