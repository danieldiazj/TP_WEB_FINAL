package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.TipoOperario;

public interface ITipoOperarioDao {
	public void insertar(TipoOperario tipooperario);
	public List<TipoOperario> listar();
	public void eliminar(int idTipoOperario);
}
