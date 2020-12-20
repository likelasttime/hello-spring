package start.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import start.hellospring.aop.TimeTraceAop;
import start.hellospring.repository.JpaMemberRepository;
import start.hellospring.repository.MemberRepository;
import start.hellospring.repository.MemoryMemberRepository;
import start.hellospring.service.MemberService;

import javax.persistence.EntityManager;

@Configuration

public class SpringConfig {
    //@Bean
    //public MemberService memberService(){
    //    return new MemberService(memberRepository());
    //}

    //private EntityManager em;

    //@Autowired
    //public SpringConfig(EntityManager em){
        //this.em=em;
    //}

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

    //@Bean
    //public TimeTraceAop timeTraceAop(){
    //    return new TimeTraceAop();
    //}

    //@Bean
    //public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        //return new JpaMemberRepository(em);
    //}
}
