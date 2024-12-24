package com.abdulmajid.quizapp.service;

import com.abdulmajid.quizapp.dao.QuestionDao;
import com.abdulmajid.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        List<Question> questions = questionDao.findAll();
      //  System.out.println("Fetched Questions: " + questions); // Add this debug log
        return questions;
    }

    public List<Question> getQuestionByCategory(String category)
    {
        return questionDao.findByCategory(category);
    }
}
