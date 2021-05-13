
package presenter;

import view.P0404;
import view.ViewTelaInicial;


public class PresenterP0404 {
    public void inicial() {
        
        P0404 viewP0404 = new P0404();
        ViewTelaInicial.Desktop.add(viewP0404);
        viewP0404.setVisible(true);
  
        
        
        
        viewP0404.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0404 a = new P0404();
            }
        });
        viewP0404.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0404 a = new P0404();
            }
        });
        viewP0404.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0404 a = new P0404();
            }
        });
    }    
    
}
