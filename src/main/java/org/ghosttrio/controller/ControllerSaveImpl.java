package org.ghosttrio.controller;

import org.ghosttrio.config.ModelView;
import org.ghosttrio.config.MvcFactory;
import org.ghosttrio.config.MyView;
import org.ghosttrio.domain.Member;
import org.ghosttrio.repository.MemberRepository;

import java.util.Map;

public class ControllerSaveImpl implements Controller {

    private final MemberRepository memberRepository = MvcFactory.getMemberRepository();

    @Override
    public String process(Map<String, Object> paramMap, Map<String, Object> model) {
        Long id = (Long) paramMap.get("id");
        String name = (String) paramMap.get("name");
        Member member = new Member(id, name);
        memberRepository.save(member);
        model.put("member", member);
        return "save-result";
    }
}
