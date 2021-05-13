package presenter;

import com.pss.senha.validacao.ValidadorSenha;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import state.StateLogin;
import state.StateLoginLogarNoSistema;
import view.ViewLogin;

public class PresenterLogin {

    private ViewLogin view;
    private ValidadorSenha validador;
    private StateLogin state;

    public PresenterLogin() {
        view = new ViewLogin();

        setEstado(new StateLoginLogarNoSistema(this));
    }   

    public void removeListners(JButton btn) {
        for (ActionListener al : btn.getActionListeners()) {
            btn.removeActionListener(al);
        }
    }

    public void setEstado(StateLogin estado) {
        this.state = estado;
    }

    public ViewLogin getView() {
        return view;
    }
}
