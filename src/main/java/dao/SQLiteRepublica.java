package dao;

import models.Republica;

import java.util.ArrayList;

public class SQLiteRepublica implements DatabaseRepublica {

    private static SQLiteRepublica _unicaInstancia;
    private ArrayList<Republica> republicas = new ArrayList<Republica>();

    public static SQLiteRepublica getInstance() {
        if (_unicaInstancia == null) {
            _unicaInstancia = new SQLiteRepublica();
        }
        return _unicaInstancia;
    }

    public SQLiteRepublica() {
    }

    @Override
    public boolean adicionarRepublica(Republica republica) {
        if (this.republicas.add(republica)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean removerRepublica(Republica republica) {
        if (this.republicas.remove(republica)) {
            return true;
        }
        return false;
    }

    @Override
    public Republica getRepublica(String nomeRepublica) {
        Republica a = null;
        for (Republica republica : republicas) {
            if (republica.getNome().compareTo(nomeRepublica) == 0) {
                a = republica;
                break;
            }
        }
        return a;
    }

    public void imprimeTudo() {
        Republica a = null;
        for (Republica republica : republicas) {
            System.out.println(republica.getNome());
        }

    }

}
