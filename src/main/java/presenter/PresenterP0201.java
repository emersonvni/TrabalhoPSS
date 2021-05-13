package presenter;

import view.P0201;
import view.ViewTelaInicial;

public class PresenterP0201 {

    public void inicial() {

        P0201 viewP0201 = new P0201();
        ViewTelaInicial.Desktop.add(viewP0201);
        viewP0201.setVisible(true);

        viewP0201.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                PresenterP0102 p = new PresenterP0102();
                p.inicial();
                

            }
        });

        viewP0201.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                
                PresenterP0202 p = new PresenterP0202();
                p.inicial();

            }
        });

        viewP0201.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                

            }
        });

        viewP0201.getjButton4().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                

            }
        });

    }

}
