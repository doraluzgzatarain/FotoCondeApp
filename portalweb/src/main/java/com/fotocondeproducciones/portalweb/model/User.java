package com.fotocondeproducciones.portalweb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "USER", schema = "FOTOCONDEDB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @Id
    @Column(name = "CONTRACT_NO", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contract_number")
    @SequenceGenerator(name = "contract_number", sequenceName = "contract_number_seq", allocationSize = 1, initialValue = 10000)
    private int contractNo;

    @Column(name = "STUDENT_NAME", nullable = false, length = 30)
    private String studentName;

    @Column(name = "STUDENT_SURNAME", nullable = false, length = 30)
    private String studentSurname;

    @Column(name = "SCHOOL_GROUP", nullable = false, length = 10)
    private String schoolGroup;

    @Column(name = "SCHOOL_NAME", nullable = false, length = 30)
    private String schoolName;

    @Column(name = "GENERATION", nullable = false, length = 10)
    private String generation;

    @Column(name = "SHIRT_SIZE", length = 15)
    private String shirtSize;

    @Column(name = "TOGA_SIZE", length = 15)
    private String togaSize;

    @Column(name = "RING_SIZE", length = 5)
    private String ringSize;

    @Column(name = "CELLPHONE", nullable = false, length = 15)
    private String cellPhone;

    @Column(name = "HOME_PHONE", length = 15)
    private String homePhone;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "TUTOR_NAME", length = 60)
    private String tutorName;

    @Column(name = "KIT_TYPE", nullable = false, length = 12)
    private String kitType;

    @Column(name = "USER_PASSWORD", nullable = false, length = 16)
    private String userPassword;


} //class Usuario
