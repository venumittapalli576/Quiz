package com.developmentapps.quiz.service;

import com.developmentapps.quiz.model.Answer;
import com.developmentapps.quiz.model.Score;


public interface ScoringService {
    /**
     * It returns true or false by checking in the answer with the ticked option
     * if both matches it returns true else flase
     * Parameters:
     * Answer:get the ticked option from Answer service.
     *
     * Return:return true or flase.
     *
     */


    public boolean evaluate(Answer answer);

    /**
     * It returns the score
     * Parameters:None
     *
     * Return:gives the Current score of user .
     */
    public Score getCurrentScore();

}
