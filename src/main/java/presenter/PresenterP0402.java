
package presenter;

import view.P0402;
import view.ViewTelaInicial;


public class PresenterP0402 {
    public void inicial() {
        
        P0402 viewP0402 = new P0402();
        ViewTelaInicial.Desktop.add(viewP0402);
        viewP0402.setVisible(true);
  
        
        
        
        viewP0402.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0402 a = new P0402();
            }
        });
        viewP0402.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0402 a = new P0402();
            }
        });
        viewP0402.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0402 a = new P0402();
            }
        });
    }
    
}
