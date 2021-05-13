package state;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import presenter.PresenterTelaPrincipal;
import view.ViewTelaInicial;

public class StateTelaPrincipalRepresentanteDaRepublica extends StateTelaPrincipal {

    public StateTelaPrincipalRepresentanteDaRepublica(PresenterTelaPrincipal presenter) {
        super(presenter);

        ViewTelaInicial view = presenter.getView();

        //República
        view.getMiManterRepublica().setEnabled(true);
        view.getMiManterMoradores().setEnabled(true);
        view.getMiConfirmarReclamacaoSugestao().setEnabled(true);
        view.getMiConvidarMoradoresAceitarConvite().setEnabled(true);
        view.getMiCriarRepublica().setEnabled(false);
        view.getMiBuscarVagas().setEnabled(false);
        view.getMiConsultarResultadoMensal().setEnabled(false);
        view.getMiManterReclamacoesSugestoes().setEnabled(false);

        //Morador
        view.getMiManterPerfil().setEnabled(false);
        view.getMiAceitarConvite().setEnabled(false);

        //Tarefas
        view.getMiManterTarefas().setEnabled(true);
        view.getMiRegistrarConclusaoDaTarefa().setEnabled(false);

        //Lançamentos
        view.getMiManterReceitasEDespesas().setEnabled(true);
        view.getMiFazerEstornoDeLancamentos().setEnabled(true);
        view.getMiConsultarMinhasReceitasEDespesas().setEnabled(false);
        view.getMiRegistrarPagamentoDeReceitaOuDespesas().setEnabled(false);

        //Sair
        view.getMiSair().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                view.dispose();
                System.exit(0);
            }
        });

        view.setVisible(true);
        view.setLocationRelativeTo(null);
    }

}
