package org.PracDocker.Beom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MainEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String sex;


}
