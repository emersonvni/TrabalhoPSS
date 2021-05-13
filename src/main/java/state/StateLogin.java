
package state;

import presenter.PresenterLogin;
import view.ViewLogin;


public abstract class StateLogin {
    
    protected PresenterLogin presenter;
    protected ViewLogin view;

    public StateLogin(PresenterLogin presenter) {
        this.presenter = presenter;
    }
        
    public abstract void logarNoSistema();
    
    public abstract void cadastrarNovoUsuario();
    
}
