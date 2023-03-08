package com.ucad.kital.raph.gestionProduit.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @NotBlank
    @Size(min = 0, max = 32)
    private String id;

    @CreatedDate
    @PastOrPresent
    @Column(name = "dateCreate", nullable = false, updatable = false)
    private Instant dateCreate=Instant.now();

    @LastModifiedDate
    @PastOrPresent
    @Column(name = "dateUpdate", nullable = false)
    private Instant dateUpdate = Instant.now();
}
