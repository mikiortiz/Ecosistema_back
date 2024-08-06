package com.semillero.ecosistemas.service;

import com.semillero.ecosistemas.model.Question;
import com.semillero.ecosistemas.repository.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private IQuestionRepository iQuestionRepository;

    public List<Question> getAllQuestions() {
        return iQuestionRepository.findAll();
    }

    public Question getQuestionById(Long id) {
        return iQuestionRepository.findById(id).orElse(null);
    }

    public List<Question> getQuestionsByCategory(Long categoryId) {
        return iQuestionRepository.findByCategoryId(categoryId);
    }

    public Question saveQuestion(Question question) {
        return iQuestionRepository.save(question);
    }

    public void deleteQuestion(Long id) {
        iQuestionRepository.deleteById(id);
    }
}