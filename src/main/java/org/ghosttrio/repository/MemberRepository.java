package org.ghosttrio.repository;

import org.ghosttrio.domain.Member;

import java.util.List;

// DB 접근 구현체가 연결됐다고 가정
public interface MemberRepository {
    void save(Member member);
    List<Member> findAll();
}
