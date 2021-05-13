
package state;

import presenter.PresenterTelaPrincipal;
import view.ViewTelaInicial;

public abstract class StateTelaPrincipal {
    
    protected PresenterTelaPrincipal presenter;
    protected ViewTelaInicial view;

    public StateTelaPrincipal(PresenterTelaPrincipal presenter) {
        this.presenter = presenter;
    }
    
    public void estadoSemTeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void estadoMorador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void estadoRepresentanteDaReública() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
