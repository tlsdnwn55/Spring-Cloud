package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor // 모든 아규먼트를 가지는 생성자
@NoArgsConstructor // 기본 생성자
public class Greeting {
    @Value("${greeting.message}")
    private String message;
}
