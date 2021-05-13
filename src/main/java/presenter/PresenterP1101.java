package presenter;

import view.P1101;
import view.ViewTelaInicial;


public class PresenterP1101 {
    public void inicial() {
        
        P1101 viewP1101 = new P1101();
        ViewTelaInicial.Desktop.add(viewP1101);
        viewP1101.setVisible(true);
  
        
        
        
        viewP1101.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                System.out.println("CHUPA GRANDE");
                
                //P1101 a = new P1101();
            }
        });
        viewP1101.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                PresenterP1801 p = new PresenterP1801();
                p.inicial();
            }
        });
    } 
}
