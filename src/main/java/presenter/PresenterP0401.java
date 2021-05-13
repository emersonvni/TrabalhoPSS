package presenter;

import view.P0401;
import view.ViewTelaInicial;


public class PresenterP0401 {

    public void inicial() {

        P0401 viewP0401 = new P0401();
        ViewTelaInicial.Desktop.add(viewP0401);
        viewP0401.setVisible(true);

        viewP0401.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();

                PresenterP0402 p = new PresenterP0402();
                p.inicial();
            }
        });
        viewP0401.getjButton2().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();

                //P0401 a = new P0401();
            }
        });
        viewP0401.getjButton4().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();

                PresenterP0402 p = new PresenterP0402();
                p.inicial();
            }
        });
        viewP0401.getjButton5().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();

                PresenterP0403 p = new PresenterP0403();
                p.inicial();
            }
        });
        viewP0401.getjButton6().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();

                PresenterP0404 p = new PresenterP0404();
                p.inicial();
            }
        });
    }
}
