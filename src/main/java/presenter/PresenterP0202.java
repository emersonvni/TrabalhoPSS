package presenter;

import view.P0202;
import view.ViewTelaInicial;

public class PresenterP0202 {

    public void inicial() {

        P0202 viewP0202 = new P0202();
        ViewTelaInicial.Desktop.add(viewP0202);
        viewP0202.setVisible(true);

        

        viewP0202.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();
               

            }
        });

    }

}
