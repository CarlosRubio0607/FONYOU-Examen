package com.example.arquetipoApi.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class EsctExamenPregunta {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cvePregunta;

    @Column(nullable = false, length = 100)
    private String pregunta;

    @Column(nullable = false, length = 100)
    private String opsUno;

    @Column(nullable = false, length = 100)
    private String opsDos;

    @Column(nullable = false, length = 100)
    private String opsTres;

    @Column(nullable = false, length = 100)
    private String opsCuatro;

    @Column(nullable = false, length = 100)
    private String opsCorrecta;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cve_examen_id", nullable = false)
    private EsctExamen cveExamen;

    @OneToMany(mappedBy = "cvePregunta")
    private Set<EsctAlumnoExamenResp> cvePreguntaEsctAlumnoExamenResps;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;

}
