
package presenter;

import view.P0803;
import view.ViewTelaInicial;


public class PresenterP0803 {
    public void inicial() {
        
        P0803 viewP0803 = new P0803();
        ViewTelaInicial.Desktop.add(viewP0803);
        viewP0803.setVisible(true);
  
             
        viewP0803.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0803 a = new P0803();
            }
        });
        
        viewP0803.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0803 a = new P0803();
            }
        });
    }
}
