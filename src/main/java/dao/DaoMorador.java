package dao;


import java.util.List;
import models.Morador;
import models.Usuario;


public interface DaoMorador {

    public abstract boolean cadastrarMorador(Morador morador);
    
    public abstract boolean apagarMorador(Morador morador);
    
    public abstract Morador getMoradorFromUsuario(Usuario usuario);
    
    public abstract List<Morador> getAllMoradores();
    

}
