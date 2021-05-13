package presenter;

import view.P0801;
import view.ViewTelaInicial;


public class PresenterP0801 {
    public void inicial() {
        
        P0801 viewP0801 = new P0801();
        ViewTelaInicial.Desktop.add(viewP0801);
        viewP0801.setVisible(true);
  
             
        viewP0801.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                PresenterP0802 p = new PresenterP0802();
                p.inicial();
            }
        });
        
        viewP0801.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0801 a = new P0801();
            }
        });
        viewP0801.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0801 a = new P0801();
            }
        });
        viewP0801.getjButton4().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();                
                PresenterP0802 p = new PresenterP0802();
                p.inicial();
                
            }
        });
        viewP0801.getjButton5().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                
                //P0801 a = new P0801();
            }
        });
        viewP0801.getjButton6().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                PresenterP0803 p = new PresenterP0803();
                p.inicial();
            }
        });        
    }
    
}
