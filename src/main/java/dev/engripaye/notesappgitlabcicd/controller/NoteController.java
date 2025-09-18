package dev.engripaye.notesappgitlabcicd.controller;

import dev.engripaye.notesappgitlabcicd.entity.Note;
import dev.engripaye.notesappgitlabcicd.repository.NoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteRepository noteRepository;


    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @GetMapping
    public List<Note> getAllNote(){
        return noteRepository.findAll();
    }

    @PostMapping
    public Note createNote(@RequestBody Note note){
        return noteRepository.save(note);
    }
}

