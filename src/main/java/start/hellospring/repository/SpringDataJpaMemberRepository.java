package start.hellospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import start.hellospring.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long >, MemberRepository {
    @Override
    Optional<Member> findByName(String name);

}
