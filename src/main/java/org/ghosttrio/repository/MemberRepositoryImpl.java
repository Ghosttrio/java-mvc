package org.ghosttrio.repository;

import org.ghosttrio.domain.Member;

import java.util.List;

public class MemberRepositoryImpl implements MemberRepository {
    @Override
    public void save(Member member) {
        System.out.println("저장 완료");
    }

    @Override
    public List<Member> findAll() {
        return List.of(new Member(1L, "TEST"));
    }
}
