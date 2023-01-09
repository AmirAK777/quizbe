package org.quizbe.dao

import org.quizbe.model.Question
import org.quizbe.model.Rating
import org.quizbe.model.Response
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ResponseRepository : JpaRepository<Response?, Long?> {

//    fun findResponseByQuestion_Id(id:Long): List<Rating>
//
//    fun findAllByQuestionId(id:Long): List<Response>
//    fun findByQuestionId(id:Long): List<Response>
    fun findByQuestion(question: Question?): List<Response?>
}
