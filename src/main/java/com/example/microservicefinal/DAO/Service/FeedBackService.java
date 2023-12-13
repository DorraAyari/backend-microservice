package com.example.microservicefinal.DAO.Service;


import com.example.microservicefinal.DAO.Entities.Feedback;
import com.example.microservicefinal.DAO.Repositories.FeedbackRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class FeedBackService implements IFeedbackService {

    private FeedbackRepository feedbackRepository;

    //@Autowired
    //private ProduitProxy produitProxy;
    @Override
    public List<Feedback> findAll() {
        return feedbackRepository.findAll();
    }

    @Override
    public Feedback addFeedBack(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public Feedback findById(long id) {
        return feedbackRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Feedback not found"));
    }

    @Override
    public Feedback editFeedBack(Long id, Feedback feedback) {
        Feedback existingFeedback = findById(id);
        existingFeedback.setName(feedback.getName());
        existingFeedback.setDescription(feedback.getDescription());
        return feedbackRepository.save(existingFeedback);
    }

    @Override
    public void deleteFeedBack(long id) {
        feedbackRepository.deleteById(id);
    }


   // @Override
    //public String getProductByFeignClient(String name){
    //    return produitProxy.getName(name);
    //}

}
