package presenter;

import view.P0702;
import view.ViewTelaInicial;


public class PresenterP0702 {

    public void inicial() {

        P0702 viewP0702 = new P0702();
        ViewTelaInicial.Desktop.add(viewP0702);
        viewP0702.setVisible(true);
        //DatabaseMorador databaseMorador = SQLiteMorador.getInstance();

        viewP0702.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();

                String nome = viewP0702.getjTextField1();
                String apelido = viewP0702.getjTextField2();
                String telefone = viewP0702.getjFormattedTextField3();
                String redeSociais = viewP0702.getjTextField9();
                String telefoneResponsável1 = viewP0702.getjFormattedTextField4();
                String telefoneResponsável2 = viewP0702.getjFormattedTextField5();
                boolean perfilPrivado = false;
                if (viewP0702.getjRadioButton2()) {
                    perfilPrivado = true;
                }
                //databaseMorador.adicionarMorador(new Morador(nome, apelido, telefone, redeSociais, telefoneResponsável1, telefoneResponsável2, null, perfilPrivado));
                //databaseMorador.imprimeTudo();

            }
        });

    }

}
