package com.example.microservicefinal.DAO.RestController;

import com.example.microservicefinal.DAO.Entities.Feedback;

import com.example.microservicefinal.DAO.Service.FeedBackService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NoArgsConstructor
@RestController
@RequestMapping("/feedback")
@CrossOrigin("http://localhost:4200")
public class FeedbackController {

    @Autowired
    private FeedBackService feedBackService;

    @GetMapping("/findAll")
    List<Feedback> findAll(){
        return  feedBackService.findAll();
    }

    @PostMapping("/add")
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return feedBackService.addFeedBack(feedback);
    }

    @GetMapping("/{id}")
    public Feedback getFeedbackById(@PathVariable long id) {
        return feedBackService.findById(id);
    }

    @PutMapping("/{id}")
    public Feedback updateFeedback(@PathVariable long id, @RequestBody Feedback feedback) {
        return feedBackService.editFeedBack(id, feedback);
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable long id) {
        feedBackService.deleteFeedBack(id);
    }

   /* @GetMapping("/produit/get-produit-feign")
    public String getProductFeign(@RequestParam String name){
        return this.feedBackService.getProductByFeignClient(name);
    } */


}

