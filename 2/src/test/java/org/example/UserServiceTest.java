package org.example;

import com.google.protobuf.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;
    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont",
                "jeandupont@email.com",123);
        // TODO : Configuration du comportement du mock, utiliser la
//directive « when » avec sa méthode « thenReturn »
        when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenReturn(true);

// ...
        // TODO : Création du service avec le mock
       UserService userService = new UserService(utilisateurApiMock);
        // TODO : Appel de la méthode à tester
        userService.creerUtilisateur(utilisateur);

// ...
        // TODO : Vérification de l'appel à l'API
        // ...
        verify(utilisateurApiMock).creerUtilisateur(utilisateur);


// Définition d'un ID fictif
        int idUtilisateur = 123;

// TODO: Configuration du mock pour renvoyer l'ID
        when(utilisateurApiMock.returnID(utilisateur)).thenReturn(idUtilisateur);


//...

// Appel de la méthode à tester
        int id=userService.returnID(utilisateur);
// TODO: Vérification de l'ID de l'utilisateur
        assertEquals(123,id);
//...

    }

    @Test
    public void testCreerUtilisateurWithException() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont",
                "jeandupont@email.com", 123);

        // Configuration du mock pour lever une exception lors de la création de l'utilisateur
        when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenThrow(new ServiceException("Echec de la création de l'utilisateur"));

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        try {
            userService.creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            // Vérification que l'exception a bien été levée avec le bon message
            assertEquals("Echec de la création de l'utilisateur", e.getMessage());
        }

        // Vérification qu'aucune autre méthode n'a été appelée (par exemple returnID)
        verify(utilisateurApiMock, never()).returnID(utilisateur);
    }

    @Test
    public void testCreerUtilisateurWithValidationError() throws ServiceException {
        // Création d'un nouvel utilisateur avec des informations incorrectes (par exemple email vide)
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "", 123);

        // Configuration du mock pour lever une exception de validation (ou toute autre logique spécifique de validation)
        when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenThrow(new ServiceException("Erreur de validation"));

        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);

        // Appel de la méthode à tester
        try {
            userService.creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            // Vérification que l'exception de validation a bien été levée
            assertEquals("Erreur de validation", e.getMessage());
        }

        // Vérification que la méthode returnID n'a pas été appelée en cas d'erreur de validation
        verify(utilisateurApiMock, never()).returnID(utilisateur);
    }
}