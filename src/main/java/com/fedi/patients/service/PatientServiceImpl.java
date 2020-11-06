package com.fedi.patients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.fedi.patients.entities.*;
import com.fedi.patients.repos.*;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRepository patientRepository;
	@Override
	public Patient savePatient(Patient p) {
	return patientRepository.save(p);
	}
	@Override
	public Patient updatePatient(Patient p) {
		return patientRepository.save(p);
	}
	@Override
	public void deletePatient(Patient p) {
		patientRepository.delete(p);
	}
	@Override
	public void deletePatientById(Long id) {
		patientRepository.deleteById(id);
	}
	@Override
	public Patient getPatient(Long id) {
	return patientRepository.findById(id).get();
	}
	@Override
	public List<Patient> getAllPatients() {
	return patientRepository.findAll();
	}
	@Override
	public Page<Patient> getAllPatientsParPage(int page, int size) {
	return patientRepository.findAll(PageRequest.of(page, size));
	}
	@Override
	public List<Patient> findByNom(String nom) {
	return patientRepository.findByNom(nom);
	}
	
	@Override
	public List<Patient> findByNomContains(String nom) {
	return patientRepository.findByNomContains(nom);
	}

	@Override
	public List<Patient> findByNomPrenomPatient(String nom, String prenom) {
		return patientRepository.findByNomPrenomPatient(nom, prenom);
	}
	
	@Override
	public List<Patient> findByMedecin(Medecin medecin) {
	return patientRepository.findByMedecin(medecin);
	}
	@Override
	public List<Patient> findByMedecinIdMed(Long id) {
	return patientRepository.findByMedecinIdMed(id);
	}
	@Override
	public List<Patient> findByOrderByNomAsc() {
	return patientRepository.findByOrderByNomAsc();
	}
	@Override
	public List<Patient> trierPatientsNomPrenom() {
	return patientRepository.trierPatientsNomPrenom();
	}

}
