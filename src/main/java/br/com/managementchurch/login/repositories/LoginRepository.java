package br.com.managementchurch.login.repositories;

import br.com.managementchurch.login.model.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {

    public boolean existsByEmail(String email);
}
