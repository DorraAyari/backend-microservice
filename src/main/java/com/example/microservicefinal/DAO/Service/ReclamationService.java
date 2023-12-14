package com.example.microservicefinal.DAO.Service;

import com.example.microservicefinal.DAO.Entities.Reclamation;
import com.example.microservicefinal.DAO.Repositories.ReclamationRepository;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReclamationService implements IReclamationService {

    @Autowired
    ReclamationRepository recalamtionRepository ;

    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        return recalamtionRepository.save(reclamation);
    }

    @Override
    public Reclamation updateReclamation(long idReclamation , Reclamation newReclamation) {
        if (recalamtionRepository.findById(idReclamation).isPresent()){
            Reclamation existingReclamation = recalamtionRepository.findById(idReclamation).get();
            existingReclamation.setTitreReclamation(newReclamation.getTitreReclamation());
            existingReclamation.setDescriptionRec(newReclamation.getDescriptionRec());
            return  recalamtionRepository.save(existingReclamation);
        }else
            return null;
    }

    @Override
    public List<Reclamation> findAllReclamation() {
        return recalamtionRepository.findAll();
    }

    @Override
    public String deleteReclamationById(long id) {
        if (recalamtionRepository.findById(id).isPresent()) {
            recalamtionRepository.deleteById(id);
            return "Reclamation supprimé";
        } else
            return "Reclamation non supprimé";
    }

    @Override
    public Reclamation findAllById(long id) {
        return recalamtionRepository.findById(id).get();
    }

}
