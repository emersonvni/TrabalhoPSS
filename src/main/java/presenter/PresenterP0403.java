
package presenter;

import view.P0403;
import view.ViewTelaInicial;


public class PresenterP0403 {
    public void inicial() {
        
        P0403 viewP0403 = new P0403();
        ViewTelaInicial.Desktop.add(viewP0403);
        viewP0403.setVisible(true);
  
        
        
        
        viewP0403.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0403  a = new P0403 ();
            }
        });
        viewP0403.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0403  a = new P0403 ();
            }
        });
    }    
}
