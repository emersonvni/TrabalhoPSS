package service;

import models.Usuario;

public class ServiceMorador {

    private static ServiceMorador instance;

    private ServiceMorador() {

    }

    public static ServiceMorador getInstance() {
        if (instance == null) {
            instance = new ServiceMorador();
        }
        return instance;
    }

    public void getMorador(Usuario usuario){
        //TODO - Retornar o Morador do usuário
    }
}
