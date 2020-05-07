package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.TipoOperario;

public interface ITipoOperarioService {
	public void insertar(TipoOperario tipooperario);

	public List<TipoOperario> listar();

	public void eliminar(int idTipoOperario);
}
