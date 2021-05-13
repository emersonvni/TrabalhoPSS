package presenter;

import view.P0303;
import view.ViewTelaInicial;


public class PresenterP0303 {
    public void inicial() {
        
        P0303 viewP0303 = new P0303();
        ViewTelaInicial.Desktop.add(viewP0303);
        viewP0303.setVisible(true);
  
             
        viewP0303.getjButton4().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0303 a = new P0303();
            }
        });
    }
}
