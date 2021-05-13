package collections;

import dao.DaoMorador;
import dao.DaoMoradorSqlLite;
import models.Morador;
import models.Usuario;

public class Moradores {

    private static Moradores instance;
    private DaoMorador dao;

    private Moradores() {
        dao = DaoMoradorSqlLite.getInstance();
    }

    public static Moradores getInstance() {
        if (instance == null) {
            instance = new Moradores();
        }
        return instance;
    }
    
    public Morador getMoradorFromUsuario(Usuario usuario){
        return dao.getMoradorFromUsuario(usuario);
    }

}
