package presenter;

import view.P0301;
import view.P1301;
import view.ViewTelaInicial;


public class PresenterP1301 {

    public void inicial() {

        P1301 viewP1301 = new P1301();
        ViewTelaInicial.Desktop.add(viewP1301);
        viewP1301.setVisible(true);

        viewP1301.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                

            }
        });

        viewP1301.getjButton4().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                

            }
        });

        viewP1301.getjButton5().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
                

            }
        });
    }

}
