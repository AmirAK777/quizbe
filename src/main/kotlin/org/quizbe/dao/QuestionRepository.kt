package org.quizbe.dao
import org.quizbe.model.Scope
import org.quizbe.model.Question
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface QuestionRepository : JpaRepository<Question?, Long?> {
    @Query("select min(id) from Question where id > :id ")
    fun findNextById(id: Long): Int?
    @Query("select max(id) from Question where id < :id ")
    fun findPreviousById(id: Long): Int?


    fun findByScopeIdAndTopicId(scopeId: Long, topicId: Long): List<Question>
    }