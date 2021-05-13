package collections;

import dao.DaoUsuario;
import dao.DaoUsuarioSqlLite;
import java.util.List;
import models.Usuario;

public class Usuarios {

    private static Usuarios instance;
    private Usuario usuarioLogado;
    private DaoUsuario dao;

    private Usuarios() {
        dao = DaoUsuarioSqlLite.getInstance();
    }

    public static Usuarios getInstance() {
        if (instance == null) {
            instance = new Usuarios();
        }
        return instance;
    }

    public boolean existeUsuario(Usuario usuario) {
        return dao.existeUsuario(usuario);
    }

    public boolean isSenhaOK(Usuario usuario) {
        return dao.isSenhaOk(usuario);
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        System.out.println("O usuario "+usuarioLogado.getNomeUsuario()+" foi logado no sistema");
        this.usuarioLogado = usuarioLogado;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null) {
            return false;
        }

        return dao.cadastrarUsuario(usuario);
    }

    public List<Usuario> getUsuarios() {
        return dao.getUsuarios();
    }
    
    public Usuario getUsuarioByNome(String nomeUsuario){
        return dao.getUsuarioByNome(nomeUsuario);
    }
}
