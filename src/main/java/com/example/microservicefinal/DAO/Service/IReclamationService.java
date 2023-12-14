package com.example.microservicefinal.DAO.Service;

import com.example.microservicefinal.DAO.Entities.Currency;
import com.example.microservicefinal.DAO.Entities.Reclamation;

import java.util.List;

public interface IReclamationService {

    Reclamation addReclamation(Reclamation reclamation);
    Reclamation updateReclamation(long id , Reclamation newReclamation);
    List<Reclamation> findAllReclamation();
    String deleteReclamationById(long id);
    Reclamation findAllById(long id);

}
