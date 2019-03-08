package Daoimp;

import java.awt.List;
import java.util.ArrayList;

import Dao.UsuarioDao;
import entity.Usuario;

public class UsuarioDaoimp implements UsuarioDao {
	private ArrayList<Usuario> lista;
	@Override
	public void create(Usuario u) {
		lista = new ArrayList<>();		
	}

	@Override
	public void read(Usuario u) {
		lista.add(u);
		
	}

	@Override
	public void update(int pos, Usuario p) {
		lista.set(pos , p);
		
	}

	@Override
	public void delete(int pos) {
		
		
	}

	@Override
	public ArrayList<Usuario> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
