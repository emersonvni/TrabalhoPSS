package dao;

import java.util.List;
import models.Usuario;

public interface DaoUsuario {

    public boolean cadastrarUsuario(Usuario usuario);
    
    public List<Usuario> getUsuarios();
    
    public boolean existeUsuario(Usuario usuario);
    
    public boolean isSenhaOk(Usuario usuario);
    
    public Usuario getUsuarioByNome(String nomeUsuario);
    
}
