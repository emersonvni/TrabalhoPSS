package presenter;

import view.P0301;
import view.ViewTelaInicial;


public class PresenterP0301 {
    public void inicial() {
        
        P0301 viewP0301 = new P0301();
        ViewTelaInicial.Desktop.add(viewP0301);
        viewP0301.setVisible(true);
  
             
        viewP0301.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                PresenterP0302 p = new PresenterP0302();
                p.inicial();
            }
        });
        
        viewP0301.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0301 a = new P0301();
            }
        });
        viewP0301.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0301 a = new P0301();
            }
        });
        viewP0301.getjButton4().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                PresenterP0302 p = new PresenterP0302();
                p.inicial();
            }
        });
    }
    
}
