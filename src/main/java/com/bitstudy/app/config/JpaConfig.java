package com.bitstudy.app.config;

import lombok.val;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

/** @Configuration 이라고 하면 설정파일을 만들기 위한 어노테이션 or Bean을 등록하기 위한 어노테이션
* 이걸 쓰면 JpaConfig 클래스는 Configuration bean 이 된다.
* 간단히 말해서 @Configuration 달아놓으면 시스템이 "야 이거 설정파일이야~, Bean으로 등록해줘~" 라는 뜻
*  */
@Configuration

/** JPA에서 auditing을 가능하게 하는 어노테이션
 * jpa auditing이란: Spring Data jpa에서 자동으로 값을 넣어주는 기능.
 *              jpa에서 자동으로 세팅하게 해줄 때 사용하는 기능인데, 특정 데이터를 보고 있다가 생성, 수정되면 자동으로 값을 넣어주는 기능
*  */
@EnableJpaAuditing
public class JpaConfig {

    // 사람 이름 정보 넣어 주려고 만드는 config 설정.
    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("bitstudy");
        // 이렇게 하면 앞으로 JPA Auditing 할 떄마다 사람 이름은 이걸로 넣게 된다.
        // TODO: 나중에 스프링 시큐리티로 인증 기능 붙일 때 수정 필요.
    }
}
