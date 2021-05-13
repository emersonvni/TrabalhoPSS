
package presenter;

import view.P0502;
import view.ViewTelaInicial;


public class PresenterP0502 {
    
    public void inicial() {
        
        P0502 viewP0502 = new P0502();
        ViewTelaInicial.Desktop.add(viewP0502);
        viewP0502.setVisible(true);
  
        
        
        
        viewP0502.getjButton4().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
         
                
                //P0502 a = new P0502();
            }
        });
 
        
        viewP0502.getjButton5().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
              
                
                //P0502 a = new P0502();
            }
        });
 
        
  
        /*
        telaInicial.getjMenuItem10().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                new PresenterP0502().iniciar();
                //P0502 a = new P0502();
            }
        });
*/
    }
    
}
