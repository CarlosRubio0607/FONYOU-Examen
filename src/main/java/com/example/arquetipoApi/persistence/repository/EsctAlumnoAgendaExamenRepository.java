package com.example.arquetipoApi.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.arquetipoApi.persistence.entity.EsctAlumnoAgendaExamen;


public interface EsctAlumnoAgendaExamenRepository extends JpaRepository<EsctAlumnoAgendaExamen, Integer> {

	@Query(value = "select \n"
			+ "eaae.CVE_ALUMNO_AGENDA,\n"
			+ "eaae.FEC_EXAMEN_APLICACION,\n"
			+ "eaae.FEC_ALTA,\n"
			+ "eaae.FEC_BAJA,\n"
			+ "eaae.FEC_MODIFICA,\n"
			+ "eaae.CVE_ALUMNO,\n"
			+ "eaae.CVE_EXAMEN,\n"
			+ "ee.NOM_EXAMEN,\n"
			+ "ee.FEC_EXAMEN_BOGOTA,\n"
			+ "ea.NOM_NOMBRE,\n"
			+ "ea.NOM_PATERNO,\n"
			+ "ea.NOM_MATERNO,\n"
			+ "ea.EDAD,\n"
			+ "ea.CVE_USUARIO_ALTA,\n"
			+ "ea.CVE_USUARIO_BAJA,\n"
			+ "ea.CVE_USUARIO_MODIFICA,\n"
			+ "ea.CVE_CIUDAD \n"
			+ "from esct_alumno_agenda_examen eaae  \n"
			+ "left join esct_examen ee on eaae.CVE_EXAMEN = ee.CVE_EXAMEN \n"
			+ "left join esct_alumno ea on eaae.CVE_ALUMNO = ea.CVE_ALUMNO", nativeQuery = true)
	List<EsctAlumnoAgendaExamen> getAllAgendas();
}
