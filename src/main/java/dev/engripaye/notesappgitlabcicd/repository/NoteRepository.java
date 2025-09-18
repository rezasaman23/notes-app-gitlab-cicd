package dev.engripaye.notesappgitlabcicd.repository;

import dev.engripaye.notesappgitlabcicd.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
