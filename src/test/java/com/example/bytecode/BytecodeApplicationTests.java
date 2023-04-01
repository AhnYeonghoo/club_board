package com.example.bytecode;

import com.example.bytecode.entity.Question;
import com.example.bytecode.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class BytecodeApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        Question q1 = new Question();
        q1.setSubject("bytecode 가입은 어떻게 하나요?");
        q1.setContent("방법이 궁금합니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);
    }

}
