
package state;

import presenter.PresenterP0102;
import view.P0102;


public class EditarRepublicaState extends ManterRepublicaState {
      
    private P0102 view;
    //private ContatoCollection republicas;

    public EditarRepublicaState(PresenterP0102 presenter2) {
        super(presenter2);
        //this.republicas = RepublicaCollection.instance();
    }

    @Override
    public void edicao() {
        //Republica republica = this.editarRepulica(republica).getRepublicaSelecionado();
        
        this.view.setTitle("Editar Contato");
       // this.view.getcamponome().setText(republica.getNome());
       // this.view.getCampocodigoetica().setText(republica.getCodigoEtica());
       //this.view.getCampofundacao().setText(republica.getDataFundacao());
       
    }
    
    public void editarRepublica (){
        
    }
} 
     
    
  

