package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.demo.Entities.Departement;
import com.example.demo.Entities.Etudiant;
import com.example.demo.repositories.IDepartementRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class DepartementImpl implements IDepartementService {
    @Autowired
    IDepartementRepository departementRepository ;

    @Autowired
    @Qualifier("etudiantImpl")
    IEtudiantService etudiantService ;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return (List<Departement>) departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement departement) {

        return departementRepository.save(departement) ;
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).orElse(null);
    }

    @Override
    public Departement affecterEtudiant(Integer idDep, Integer idEtudiant) {
        Etudiant e = etudiantService.retrieveEtudiant(idEtudiant) ;
        Departement dep =  retrieveDepartement(idDep) ;
        e.setDepartement(dep);
        etudiantService.updateEtudiant(e) ;
        return dep ;
    }


}