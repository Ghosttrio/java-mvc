package org.ghosttrio.controller;

import org.ghosttrio.config.ModelView;
import org.ghosttrio.config.MvcFactory;
import org.ghosttrio.config.MyView;
import org.ghosttrio.domain.Member;
import org.ghosttrio.repository.MemberRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ControllerLoadImpl implements Controller {

    private final MemberRepository memberRepository = MvcFactory.getMemberRepository();

    @Override
    public String process(Map<String, Object> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members", members);
        return "members";
    }
}
