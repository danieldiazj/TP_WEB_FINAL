package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.TipoInforme;

public interface ITipoInformeService {
	public void insertar(TipoInforme tipoinforme);

	public List<TipoInforme> listar();

	public void eliminar(int idTipoInforme);
}
