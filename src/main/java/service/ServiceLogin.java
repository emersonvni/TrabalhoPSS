package service;

import models.Usuario;
import collections.Usuarios;
import com.pss.senha.validacao.ValidadorSenha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceLogin {

    private static ServiceLogin instance;

    private ServiceLogin() {

    }

    public static ServiceLogin getInstance() {
        if (instance == null) {
            instance = new ServiceLogin();
        }
        return instance;
    }

    public boolean logar(Usuario usuario) {
        Usuarios usuarios = Usuarios.getInstance();

        if (!usuarios.existeUsuario(usuario)) {
            return false;
        }

        if (!usuarios.isSenhaOK(usuario)) {
            return false;
        }
        
        usuario = usuarios.getUsuarioByNome(usuario.getNomeUsuario());
        System.out.println("Id do usuario: "+usuario.getIdUsuario());
        usuarios.setUsuarioLogado(usuario);
        return true;
    }

    public List<String> cadastrarUsuario(String username, String senha, String senhaConfirmada) {

        if (username.isEmpty()) {
            return new ArrayList<>(Arrays.asList("Informe um nome de usuário"));
        }
        
        if(Usuarios.getInstance().existeUsuario(new Usuario(username, null))){
            return new ArrayList<>(Arrays.asList("Usuário não disponível"));
        }

        List<String> resultado =  new ValidadorSenha().validar(senha);
        if(resultado.size()>0){
            return resultado;
        }

        if (!senha.equals(senhaConfirmada)) {
            return new ArrayList<>(Arrays.asList("Senhas não correspondem"));
        }
        
        Usuario usuario = new Usuario(username, senha);
        boolean cadastrou = Usuarios.getInstance().cadastrarUsuario(usuario);
        if(!cadastrou){
            return new ArrayList<>(Arrays.asList("Erro ao inserir no banco de dados"));
        }

        return new ArrayList<>();
    }
    
    public List<Usuario> getUsuarios(){
        return Usuarios.getInstance().getUsuarios();
    }

}
