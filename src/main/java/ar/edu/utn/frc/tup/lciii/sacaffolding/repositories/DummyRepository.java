package ar.edu.utn.frc.tup.lciii.sacaffolding.repositories;

import ar.edu.utn.frc.tup.lciii.sacaffolding.models.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {

}
