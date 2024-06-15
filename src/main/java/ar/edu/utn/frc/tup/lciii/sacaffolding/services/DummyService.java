package ar.edu.utn.frc.tup.lciii.sacaffolding.services;

import ar.edu.utn.frc.tup.lciii.sacaffolding.models.Dummy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {
    Dummy getDummy(Long id);

    List<Dummy> getDummyList();

    Dummy createDummy(Dummy dummy);

    Dummy updateDummy(Dummy dummy);

    void deleteDummy(Long id);

}
