package org.ghosttrio.controller;

import org.ghosttrio.domain.Member;
import org.ghosttrio.repository.MemberRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControllerSaveImpl implements Controller {

    private final MemberRepository memberRepository;

    public ControllerSaveImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
        Long id = Long.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");

        Member member = new Member(id, name);
        memberRepository.save(member);
        request.setAttribute("member", member);
        String viewPath = "/WEB-INF/views/save.jsp";

        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
}
