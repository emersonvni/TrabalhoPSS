package presenter;

import view.P0802;
import view.ViewTelaInicial;


public class PresenterP0802 {
     public void inicial() {
        
        P0802 viewP0802 = new P0802();
        ViewTelaInicial.Desktop.add(viewP0802);
        viewP0802.setVisible(true);
  
             
        viewP0802.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0802 a = new P0802();
            }
        });
        
        viewP0802.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0802 a = new P0802();
            }
        });
        viewP0802.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0802 a = new P0802();
            }
        });
     }
    
}
