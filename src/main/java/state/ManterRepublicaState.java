
package state;

import presenter.PresenterP0101;
import presenter.PresenterP0102;


public abstract class ManterRepublicaState {
    
    private  PresenterP0101 presenter1;
    private  PresenterP0102 presenter2;
    

    public ManterRepublicaState(PresenterP0101 presenter1) {
        this.presenter1 = presenter1;
    }
    public ManterRepublicaState(PresenterP0102 presenter2) {
        this.presenter2 = presenter2;
    }
    
    
   
        public void inclusao() {
        throw new RuntimeException("Estado não implementado");
    }
    
    public void edicao() {
        throw new RuntimeException("Estado não implementado");
    }

    public void visualizacao() {
        throw new RuntimeException("Estado não implementado");
    }
}


