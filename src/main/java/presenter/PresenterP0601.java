
package presenter;

import view.P0601;
import view.ViewTelaInicial;


public class PresenterP0601 {
    public void inicial() {
        
        P0601 viewP0601 = new P0601();
        ViewTelaInicial.Desktop.add(viewP0601);
        viewP0601.setVisible(true);
  
        
        
        
        viewP0601.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
         
                
                //P0601 a = new P0601();
            }
        });
        
        viewP0601.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
             
                
                //P0601 a = new P0601();
            }
        });
    }   
}
