package org.example;

import com.google.protobuf.ServiceException;

public class UserService {
    private final UtilisateurApi utilisateurApi;
    public UserService(UtilisateurApi utilisateurApi) {
        this.utilisateurApi = utilisateurApi;
    }
    public boolean creerUtilisateur(Utilisateur utilisateur) throws
             ServiceException {

        return  utilisateurApi.creerUtilisateur(utilisateur);
    }
    public int returnID(Utilisateur utilisateur)throws ServiceException{
        return utilisateurApi.returnID(utilisateur);
    }
}


