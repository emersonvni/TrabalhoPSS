package state;

import com.pss.senha.validacao.ValidadorSenha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import presenter.PresenterLogin;
import service.ServiceLogin;

public class StateLoginCadastrarNovoUsuario extends StateLogin {

    public StateLoginCadastrarNovoUsuario(PresenterLogin presenter) {
        super(presenter);

        view = presenter.getView();

        view.getLbUsuario().setText("Nome do usuário");
        view.getTxtUsuario().setText("");

        view.getLbSenha().setText("Senha");
        view.getPswFieldSenha().setText("");

        view.getLbConfirmarSenha().setVisible(true);
        view.getLbConfirmarSenha().setText("Confirmar senha");
        view.getPswConfirmarSenha().setVisible(true);

        view.getBtnNovoUsuario().setVisible(false);

        view.getBtnAcessarCadastrar().setText("Cadastrar");
        view.getBtnAcessarCadastrar().setVisible(true);
        presenter.removeListners(view.getBtnAcessarCadastrar());
        view.getBtnAcessarCadastrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cadastrarNovoUsuario();
            }
        });

        view.getBtnCancelar().setText("Cancelar");
        view.getBtnCancelar().setVisible(true);
        presenter.removeListners(view.getBtnCancelar());
        view.getBtnCancelar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                logarNoSistema();
            }
        });

        view.setTitle("Novo usuário");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void logarNoSistema() {
        presenter.setEstado(new StateLoginLogarNoSistema(this.presenter));
    }

    @Override
    public void cadastrarNovoUsuario() {
        String username = view.getTxtUsuario().getText();
        String senha = new String(view.getPswFieldSenha().getPassword());
        String senhaConfirmada = new String(view.getPswConfirmarSenha().getPassword());
        
        List<String> mensagens = ServiceLogin.getInstance().cadastrarUsuario(username, senha, senhaConfirmada);
        if (mensagens.size()>0) {
            String mensagem = "";
            for (String s : mensagens) {
                mensagem = mensagem + s+ "\n";
            }
            JOptionPane.showMessageDialog(view, mensagem);
            return;
        }
        
        JOptionPane.showMessageDialog(view, "Usuário cadastrado com sucesso");
        logarNoSistema();
    }

}
