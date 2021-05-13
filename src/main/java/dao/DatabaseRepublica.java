package dao;

import models.Republica;

public interface DatabaseRepublica {

    public boolean adicionarRepublica(Republica republica);

    public boolean removerRepublica(Republica republica);

    public Republica getRepublica(String nomeRepublica);
    
    public void imprimeTudo();

}
