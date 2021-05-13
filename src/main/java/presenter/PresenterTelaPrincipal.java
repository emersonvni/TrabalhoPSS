package presenter;

import collections.Moradores;
import collections.Usuarios;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import models.Morador;
import models.Usuario;
import state.StateLogin;
import state.StateTelaPrincipal;
import state.StateTelaPrincipalMorador;
import state.StateTelaPrincipalRepresentanteDaRepublica;
import state.StateTelaPrincipalSemTeto;
import view.ViewTelaInicial;

public class PresenterTelaPrincipal {

    private ViewTelaInicial view;
    private StateTelaPrincipal state;
    

    public PresenterTelaPrincipal() {
        view = new ViewTelaInicial();
        
        Usuario usuarioLogado = Usuarios.getInstance().getUsuarioLogado();
        Morador morador = Moradores.getInstance().getMoradorFromUsuario(usuarioLogado);
        
        if(morador == null){
            this.state = new StateTelaPrincipalSemTeto(this);
        }else if(!morador.isRepresentante()){
            this.state = new StateTelaPrincipalMorador(this);
        }else{
            this.state = new StateTelaPrincipalRepresentanteDaRepublica(this);
        }        
    }

    public void removeListners(JButton btn) {
        for (ActionListener al : btn.getActionListeners()) {
            btn.removeActionListener(al);
        }
    }

    public void setEstado(StateTelaPrincipal estado) {
        this.state = estado;
    }

    public ViewTelaInicial getView() {
        return view;
    }

}
