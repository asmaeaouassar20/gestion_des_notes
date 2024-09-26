package algostyle.asmaeaouassar.project.service;

import java.util.List;

import algostyle.asmaeaouassar.project.entity.Note;

public interface NoteService {
	List<Note> getAllNotes();
	Note saveNote(Note note);
	Note getNoteById(Long id);
	Note updateNote(Note note);
	void deleteNoteById(Long id);
}
