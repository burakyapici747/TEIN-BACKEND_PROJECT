package com.example.TeinProject.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnnualPermission {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate startDate;

    private LocalDate endDate;

    private int day;

    private Long employeeId;

    private int state = 0; // 0 -> onay bekliyor, 1 -> onaylandı, -> 2 reddedildi









}
