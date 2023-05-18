package hello.login.domain.login;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    public Member login(String loginId, String pw){
        /*Optional<Member> findMemberOptional = memberRepository.findByLoginId(loginId);
        Member member = findMemberOptional.get();
        if(pw.equals(member.getPassword())){
            return member;
        } else{
            return null;
        }*/
        return memberRepository.findByLoginId(loginId)
                .filter(m -> m.getPassword().equals(pw))
                .orElse(null);
    }
}
