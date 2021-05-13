package presenter;

import view.P0501;
import view.ViewTelaInicial;

public class PresenterP0501 {

    public void inicial() {

        P0501 viewP0501 = new P0501();
        ViewTelaInicial.Desktop.add(viewP0501);
        viewP0501.setVisible(true);

        viewP0501.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
           

            }
        });

        viewP0501.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
               

            }
        });

        viewP0501.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                

            }
        });

    }

}
