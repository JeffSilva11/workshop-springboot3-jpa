package curso.java.curso_298_projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.java.curso_298_projeto.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}