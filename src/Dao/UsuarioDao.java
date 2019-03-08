package Dao;

import java.awt.List;
import java.util.ArrayList;

import entity.Usuario;

public interface UsuarioDao {
	void create(Usuario u);
	void read(Usuario u);
	void update(int pos, Usuario u);
	void delete(int pos);
	ArrayList<Usuario> readAll();
}
