package org.ghosttrio.controller;

import org.ghosttrio.domain.Member;
import org.ghosttrio.repository.MemberRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ControllerLoadImpl implements Controller {

    private final MemberRepository memberRepository;

    public ControllerLoadImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        List<Member> members = memberRepository.findAll();
        request.setAttribute("members", members);
        String viewPath = "/WEB-INF/views/members.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
}
