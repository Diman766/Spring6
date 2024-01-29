package com.example.spring6.service;

import com.example.spring6.domain.Note;

import java.util.List;
import java.util.Optional;

/**
 * Интерфейс для сервиса работы с задачами.
 */
public interface NoteService {

    /**
     * Метод записывает задачу в репозиторий.
     * @param note Задача.
     * @return Задачу.
     */
    Note createNote(Note note);

    /**
     * Метод возвращает все задачи из репозитория.
     * @return Список задач.
     */
    List<Note> getAllNotes();

    /**
     * Метод возвращает задачу с заданным id.
     * @param id
     * @return Задачу или null,если задача не найдена.
     */
    Optional<Note> getNoteById(Long id);

    /**
     * Метод обновляет задачу в репозитории.
     * @param note Задача.
     * @return Задачу или null,если задача не найдена.
     */
    Optional<Note> updateNote(Note note);

    /**
     * Метод удаляет задачу из репозитория.
     * @param id
     * @return Задачу или null,если задача не найдена.
     */
    Optional<Note> deleteNote(Long id);
}
