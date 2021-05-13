package presenter;

import view.ViewTelaInicial;
import view.P1801;


public class PresenterP1801 {
    public void inicial() {
        
        P1801 viewP1801 = new P1801();
        ViewTelaInicial.Desktop.add(viewP1801);
        viewP1801.setVisible(true);  
        
        
        
        
    }
}
