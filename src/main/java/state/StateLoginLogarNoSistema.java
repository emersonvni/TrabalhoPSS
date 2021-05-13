package state;

import models.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import presenter.PresenterLogin;
import presenter.PresenterTelaPrincipal;
import service.ServiceLogin;

public class StateLoginLogarNoSistema extends StateLogin {

    public StateLoginLogarNoSistema(PresenterLogin presenter) {
        super(presenter);

        view = presenter.getView();

        view.getLbUsuario().setText("Usuário");
        view.getTxtUsuario().setText("");

        view.getLbSenha().setText("Senha");
        view.getPswFieldSenha().setText("");

        view.getLbConfirmarSenha().setVisible(false);
        view.getPswConfirmarSenha().setVisible(false);

        view.getBtnNovoUsuario().setText("Novo usuário");
        view.getBtnNovoUsuario().setVisible(true);
        presenter.removeListners(view.getBtnNovoUsuario());
        view.getBtnNovoUsuario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cadastrarNovoUsuario();
            }
        });

        view.getBtnAcessarCadastrar().setText("Acessar");
        view.getBtnAcessarCadastrar().setVisible(true);
        presenter.removeListners(view.getBtnAcessarCadastrar());
        view.getBtnAcessarCadastrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                logarNoSistema();
            }
        });

        view.getBtnCancelar().setText("Cancelar");
        view.getBtnCancelar().setVisible(true);
        presenter.removeListners(view.getBtnCancelar());
        view.getBtnCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                sairDoSistema();
            }
        });

        view.setTitle("Acessar ao Sistema - Login");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    
    public void sairDoSistema(){
        view.dispose();
        System.exit(0);
    }

    @Override
    public void logarNoSistema() {
        String username = view.getTxtUsuario().getText();
        String senha = new String(view.getPswFieldSenha().getPassword());
        Usuario usuario = new Usuario(username, senha);
        
        boolean logou = ServiceLogin.getInstance().logar(usuario);
        
        if(logou){
            view.setVisible(false);
            PresenterTelaPrincipal presenterPrincipal = new PresenterTelaPrincipal();            
        }else{
            JOptionPane.showMessageDialog(view, "Nome de usuário ou senha inválidos");
        }
    }

    @Override
    public void cadastrarNovoUsuario() {
        presenter.setEstado(new StateLoginCadastrarNovoUsuario(this.presenter));
    }

}






