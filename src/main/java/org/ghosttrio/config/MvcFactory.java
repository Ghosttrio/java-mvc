package org.ghosttrio.config;

import org.ghosttrio.repository.MemberRepository;
import org.ghosttrio.repository.MemberRepositoryImpl;

public class MvcFactory {

    public static MemberRepository getMemberRepository() {
        return new MemberRepositoryImpl();
    }
}
