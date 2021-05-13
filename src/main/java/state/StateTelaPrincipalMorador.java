package state;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import presenter.PresenterTelaPrincipal;
import view.ViewTelaInicial;

public class StateTelaPrincipalMorador extends StateTelaPrincipal {

    public StateTelaPrincipalMorador(PresenterTelaPrincipal presenter) {
        super(presenter);

        ViewTelaInicial view = presenter.getView();

        //República
        view.getMiManterRepublica().setEnabled(false);
        view.getMiManterMoradores().setEnabled(false);
        view.getMiConfirmarReclamacaoSugestao().setEnabled(false);
        view.getMiConvidarMoradoresAceitarConvite().setEnabled(false);
        view.getMiCriarRepublica().setEnabled(false);
        view.getMiBuscarVagas().setEnabled(false);
        view.getMiConsultarResultadoMensal().setEnabled(true);
        view.getMiManterReclamacoesSugestoes().setEnabled(true);

        //Morador
        view.getMiManterPerfil().setEnabled(true);
        view.getMiAceitarConvite().setEnabled(true);

        //Tarefas
        view.getMiManterTarefas().setEnabled(false);
        view.getMiRegistrarConclusaoDaTarefa().setEnabled(true);

        //Lançamentos
        view.getMiManterReceitasEDespesas().setEnabled(false);
        view.getMiFazerEstornoDeLancamentos().setEnabled(false);
        view.getMiConsultarMinhasReceitasEDespesas().setEnabled(true);
        view.getMiRegistrarPagamentoDeReceitaOuDespesas().setEnabled(true);

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
