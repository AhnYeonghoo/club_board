package com.example.bytecode;

import com.example.bytecode.entity.Question;
import com.example.bytecode.repository.QuestionRepository;
import com.example.bytecode.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class BytecodeApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "냉무";
            this.questionService.create(subject, content);
        }
    }

}
