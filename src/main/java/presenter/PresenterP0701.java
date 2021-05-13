
package presenter;

import view.P0701;
import view.ViewTelaInicial;

/**
 *
 * @author Emerson
 */
public class PresenterP0701 {
    public void inicial() {
        
        P0701 viewP0701 = new P0701();
        ViewTelaInicial.Desktop.add(viewP0701);
        viewP0701.setVisible(true);
  
        
        
        
        viewP0701.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
             
                
                //P0701 a = new P0701();
            }
        });
        viewP0701.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                PresenterP0702 p = new PresenterP0702();
                p.inicial();
            }
        });
        viewP0701.getjButton4().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0701 a = new P0701();
            }
        });
        viewP0701.getjButton5().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0701 a = new P0701();
            }
        });
        viewP0701.getjButton6().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0701 a = new P0701();
            }
        });
        viewP0701.getjButton7().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0701 a = new P0701();
            }
        });
    }
    
}
