package com.example.demo.Service;

import com.example.demo.Entities.Departement;
import com.example.demo.Entities.Etudiant;
import com.example.demo.Repository.IDepartementRepo;
import com.example.demo.Repository.IEtudiantRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Service("EtudiantService")
@RequiredArgsConstructor
public class EtudiantService implements IEtudiantService {
    @Autowired
    IEtudiantRepo edtREpo;
    @Autowired

    IDepartementRepo idepartementRepository ;
    public Etudiant addEtudiant(Etudiant e) {
       return edtREpo.save(e);

    }

    @Override
    public void removeEtudiant(Integer idEdut) {
    edtREpo.deleteById(idEdut);
    }

    @Override
    public List<Etudiant> retrieveAllEtudiants() {

        return (List<Etudiant>) edtREpo.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return edtREpo.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return edtREpo.findById(idEtudiant).orElse(null);
    }

    /*@Override
    public void assignEtudiantToDepartment(Long etudiantId, Long departmentId) {
        Departement D1 = idepartementRepository.findByIdDepartement(departmentId);  ;
        Etudiant E1 = edtREpo.findById(etudiantId).orElse(null);
        System.out.println("dep : "+D1);
        System.out.println("etud : "+E1);
        System.out.println("dep : "+D1);
        E1.setDepartements(D1);
        edtREpo.save(E1);

    }*/
}
