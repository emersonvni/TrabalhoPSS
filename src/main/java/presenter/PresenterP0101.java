package presenter;

import dao.SQLiteRepublica;
import models.Republica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import view.P0101;
import view.ViewTelaInicial;
import dao.DatabaseRepublica;

public class PresenterP0101 {

    public void inicial() {

        P0101 viewP0101 = new P0101();
        ViewTelaInicial.Desktop.add(viewP0101);
        viewP0101.setVisible(true);
        DatabaseRepublica databaseRepublica = SQLiteRepublica.getInstance();

        viewP0101.getjButton3().addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //telaInicial.setVisible(false);
                //telaInicial.dispose();

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                try {

                    String nome = viewP0101.getjTextField4();
                    Date dataFundacao = formato.parse(viewP0101.getjTextField15());
                    Double despesaMedia = Double.parseDouble(viewP0101.getjTextField11());
                    Integer totalVagas = Integer.parseInt(viewP0101.getjTextField12());
                    Integer vagasDisponiveis = Integer.parseInt(viewP0101.getjTextField14());
                    Integer vagasOcupadas = Integer.parseInt(viewP0101.getjTextField13());
                    String vantagens = viewP0101.getjTextArea1();
                    String codEtica = viewP0101.getjTextArea2();
                    String logradouro = viewP0101.getjTextField6();
                    String bairro = viewP0101.getjTextField9();
                    String referencia = viewP0101.getjTextField8();
                    String localizacaoGeografica = viewP0101.getjTextField10();
                    String CEP = viewP0101.getjTextField7();
                    databaseRepublica.adicionarRepublica(new Republica(nome, dataFundacao, null, codEtica, CEP, bairro, referencia, localizacaoGeografica, despesaMedia, totalVagas, vagasOcupadas, vagasDisponiveis, vantagens, logradouro));
                    databaseRepublica.imprimeTudo();
                } catch (ParseException ex) {
                    System.out.print("PROBLEMA AO CAPTURAR DADOS DA TELA");
                }

            }
        });

    }

}
