package com.example.spring6.repository;

import com.example.spring6.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Интерфейс для работы с репозиторием.
 */
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
