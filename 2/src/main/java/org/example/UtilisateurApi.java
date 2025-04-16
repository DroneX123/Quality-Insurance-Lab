package org.example;

import com.google.protobuf.ServiceException;

public interface UtilisateurApi {
    boolean creerUtilisateur(Utilisateur utilisateur) throws ServiceException;
    int returnID(Utilisateur utilisateur) throws ServiceException;
}
