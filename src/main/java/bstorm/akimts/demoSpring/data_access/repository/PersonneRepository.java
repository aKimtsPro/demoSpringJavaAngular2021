package bstorm.akimts.demoSpring.data_access.repository;

import bstorm.akimts.demoSpring.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

// @NoRepositoryBean - pour que le repository ne soit pas instancié par le container
public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
