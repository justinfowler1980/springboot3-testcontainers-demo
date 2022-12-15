package com.example.demoboot3.repository;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "user_account")
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder(toBuilder = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public final class DBUser {

    @Id
    @Column(name = "id", nullable = false, columnDefinition = "uuid", unique = true)
    @EqualsAndHashCode.Include
    private UUID id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "cognito_id", nullable = false, columnDefinition = "uuid")
    private UUID cognitoId;

    @Column(name = "basiq_id", nullable = true)
    private String basiqId;

    @Column(name = "postcode", nullable = false)
    private String postcode;
}
