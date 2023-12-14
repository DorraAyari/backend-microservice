package com.example.microservicefinal.DAO.RestController;



import com.example.microservicefinal.DAO.Entities.Reclamation;
import com.example.microservicefinal.DAO.Service.IReclamationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Reclamation")
@CrossOrigin("http://localhost:4200")
public class ReclamationController {


    IReclamationService iReclamationService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation) {
        return new ResponseEntity<>(iReclamationService.addReclamation(reclamation), HttpStatus.OK);
    }


    @PutMapping(value = "update/{id}", consumes = "application/json", produces = "application/json")
    Reclamation updateReclamation(@PathVariable("id") Long idReclamation, @RequestBody  Reclamation reclamation){
        return iReclamationService.updateReclamation(idReclamation, reclamation);
    }

    @DeleteMapping("delete/{id}")
    void  deleteReclamation(@PathVariable("id") long id)
        {iReclamationService.deleteReclamationById(id);}

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public  ResponseEntity<List<Reclamation>> getAllReclamations(){
        return new ResponseEntity<>(iReclamationService.findAllReclamation(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    Reclamation findById(@PathVariable("id") Long id){
        return iReclamationService.findAllById(id);
    }

}
