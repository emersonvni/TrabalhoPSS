package state;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import presenter.PresenterTelaPrincipal;
import view.ViewTelaInicial;

public class StateTelaPrincipalSemTeto extends StateTelaPrincipal {

    public StateTelaPrincipalSemTeto(PresenterTelaPrincipal presenter) {
        super(presenter);

        ViewTelaInicial view = presenter.getView();
        
        //República
        view.getMiManterRepublica().setEnabled(false);
        view.getMiManterMoradores().setEnabled(false);
        view.getMiConfirmarReclamacaoSugestao().setEnabled(false);
        view.getMiConvidarMoradoresAceitarConvite().setEnabled(false);
        view.getMiCriarRepublica().setEnabled(true);
        view.getMiBuscarVagas().setEnabled(true);
        view.getMiConsultarResultadoMensal().setEnabled(false);
        view.getMiManterReclamacoesSugestoes().setEnabled(false);
        
        //Morador
        view.getMiManterPerfil().setEnabled(false);
        view.getMiAceitarConvite().setEnabled(false);
        
        //Tarefas
        view.getMiManterTarefas().setEnabled(false);
        view.getMiRegistrarConclusaoDaTarefa().setEnabled(false);
        
        //Lançamentos
        view.getMiManterReceitasEDespesas().setEnabled(false);
        view.getMiFazerEstornoDeLancamentos().setEnabled(false);
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
