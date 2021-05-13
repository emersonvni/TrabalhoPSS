
package presenter;

import view.P0302;
import view.ViewTelaInicial;


public class PresenterP0302 {
    public void inicial() {
        
        P0302 viewP0302 = new P0302();
        ViewTelaInicial.Desktop.add(viewP0302);
        viewP0302.setVisible(true);
  
             
        viewP0302.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0302 a = new P0302();
            }
        });
        
        viewP0302.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0302 a = new P0302();
            }
        });
        viewP0302.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0302 a = new P0302();
            }
        });
    }
}
