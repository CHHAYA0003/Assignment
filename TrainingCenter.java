package com.traini8.registry;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.Instant;
import java.util.List;

@Entity
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Size(min = 12, max = 12)
    private String centerCode;

    @Embedded
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Instant createdOn;

    @Email
    private String contactEmail;

    @Pattern(regexp = "^\d{10}$")
    private String contactPhone;

    public TrainingCenter() {
        this.createdOn = Instant.now();
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }
}
