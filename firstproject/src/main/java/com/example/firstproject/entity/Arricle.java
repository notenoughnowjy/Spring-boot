package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능!
public class Arricle {
    @Id // 대표값으로 id 선언(like a 주민등록번호)
    @GeneratedValue // 1,2,3, .... 자동 생성 어노테이션
    private Long id;

    @Column // DB에서 관리하는 테이블 단위에 연결
    private String title;
    @Column
    private String content;


}
