package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.TipoInforme;

public interface ITipoInformeDao {
	public void insertar(TipoInforme tipoinforme);
	public List<TipoInforme> listar();
	public void eliminar(int idTipoInforme);
}
