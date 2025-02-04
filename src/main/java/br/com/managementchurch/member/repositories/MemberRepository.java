package br.com.managementchurch.member.repositories;

import br.com.managementchurch.member.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    public boolean existsByEmail(String email);
}
