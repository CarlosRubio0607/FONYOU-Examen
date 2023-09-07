package com.example.arquetipoApi.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.OffsetDateTime;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class EsctExamen {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cveExamen;

    @Column(nullable = false, length = 100)
    private String nomExamen;

    @Column(nullable = false)
    private OffsetDateTime fecExamenBogota;

    @Column(nullable = false)
    private OffsetDateTime fecAlta;

    @Column
    private OffsetDateTime fecBaja;

    @Column
    private OffsetDateTime fecModifica;

    @Column(nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Column(length = 60)
    private String cveUsuarioBaja;

    @Column(length = 60)
    private String cveUsuarioModifica;

    @OneToMany(mappedBy = "cveExamen")
    private Set<EsctExamenPregunta> cveExamenEsctExamenPreguntas;

    @OneToMany(mappedBy = "cveExamen")
    private Set<EsctAlumnoAgendaExamen> cveExamenEsctAlumnoAgendaExamens;

    @OneToMany(mappedBy = "cveExamen")
    private Set<EsctAlumnoExamen> cveExamenEsctAlumnoExamens;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
