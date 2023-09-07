package com.example.arquetipoApi.persistence.entity;

import java.time.OffsetDateTime;
import java.util.Set;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class EsccCiudad {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cveCiudad;

    @Column(nullable = false, length = 100)
    private String nomCiudad;

    @Column(nullable = false, length = 100)
    private String zonaHoraria;

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

    @OneToMany(mappedBy = "cveCiudad")
    private Set<EsctAlumno> cveCiudadEsctAlumnos;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
