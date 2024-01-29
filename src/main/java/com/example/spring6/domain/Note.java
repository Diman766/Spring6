package com.example.spring6.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * Класс для сериализации в репозиторий.
 */
@Data
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String heading;

    @Column(nullable = false)
    private String content;

    @Column(name = "date")
    @CreationTimestamp
    private LocalDateTime localDateTime;

}
