package com.bitstudy.app.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;

    private Article article;
    /* 연관관계 매핑

    * 연관관계 없이 만들면 private Long articleId; 같은 식으로 작성하면 됨. (관계형 데이터베이스 스타일)
    * 연관관계 매핑의 목적: Article과 ArticleComment가 관계를 맺고 있음을 객체지향적으로 표현.

    */

    private String content; // 본문

    // 메타데이터
    private LocalDateTime createAt; // 생성일자
    private String createBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일자
    private String modifiedBy; // 수정자

}
