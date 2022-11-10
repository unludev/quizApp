package com.unludev.quizforteachers.data.model

data class QuestionModel(
    val question: String?,
    val questionHead: String?,
    val answerA: String?,
    val answerB: String?,
    val answerC: String?,
    val answerD: String?,
    val answerE: String?,
    val correctAnswer: String?
)