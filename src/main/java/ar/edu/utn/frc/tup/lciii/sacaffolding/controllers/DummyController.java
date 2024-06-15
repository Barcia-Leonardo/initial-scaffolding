package ar.edu.utn.frc.tup.lciii.sacaffolding.controllers;

import ar.edu.utn.frc.tup.lciii.sacaffolding.entities.DummyEntity;
import ar.edu.utn.frc.tup.lciii.sacaffolding.models.Dummy;
import ar.edu.utn.frc.tup.lciii.sacaffolding.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Dummy")
public class DummyController {
    @Autowired
    private DummyService dummyService;

    @GetMapping("")
    public ResponseEntity<DummyEntity> getDummyList() {
        List<Dummy> dummyList = dummyService.getDummyList();
        return null;
    }
    @GetMapping("{id}")
    public ResponseEntity<DummyEntity> getDummyList(@PathVariable Long id) {
        Dummy dummy = dummyService.getDummy(id);
        return null;
    }

    @PostMapping("")
    public ResponseEntity<DummyEntity> postDummy( DummyEntity dummyEntity) {
        Dummy dummy = dummyService.createDummy(null);
        return null;
    }

    @PutMapping("")
    public ResponseEntity<DummyEntity> putDummy( DummyEntity dummyEntity) {
        Dummy dummy = dummyService.createDummy(null);
        return null;
    }

    @DeleteMapping("")
    public ResponseEntity<Void> deleteDummy( DummyEntity dummyEntity) {
        dummyService.deleteDummy(null);
        return null;
    }

}
