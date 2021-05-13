package presenter;

import view.P0102;
import view.ViewTelaInicial;

public class PresenterP0102 {

    public void inicial() {

        P0102 viewP0102 = new P0102();
        ViewTelaInicial.Desktop.add(viewP0102);
        viewP0102.setVisible(true);

        

        viewP0102.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                

            }
        });

        viewP0102.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                PresenterP0201 p = new PresenterP0201();
                p.inicial();               

            }
        });

        viewP0102.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                

            }
        });

    }

}
