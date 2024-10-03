package com.flyubro.aircraft_leasing_service.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pilot")
@Data
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private Long recordId;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "license_number")
    private long licenseNumber;
}
