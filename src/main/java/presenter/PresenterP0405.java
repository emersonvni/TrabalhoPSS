
package presenter;

import view.P0405;
import view.ViewTelaInicial;


public class PresenterP0405 {
        public void inicial() {
        
        P0405 viewP0405 = new P0405();
        ViewTelaInicial.Desktop.add(viewP0405);
        viewP0405.setVisible(true);
  
        
        
        
        viewP0405.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0405 a = new P0405();
            }
        });
        viewP0405.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0405 a = new P0405();
            }
        });
    }
}
