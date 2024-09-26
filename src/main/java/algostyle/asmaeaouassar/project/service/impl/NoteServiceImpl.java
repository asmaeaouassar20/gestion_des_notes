package algostyle.asmaeaouassar.project.service.impl;

import java.util.List;

import algostyle.asmaeaouassar.project.entity.Note;
import algostyle.asmaeaouassar.project.repository.NoteRepository;
import algostyle.asmaeaouassar.project.service.NoteService;

import org.springframework.stereotype.Service;


@Service
public class NoteServiceImpl implements NoteService{
	
	
	private NoteRepository noteRepository;
	public NoteServiceImpl(NoteRepository noteRepository) {
		super();
		this.noteRepository = noteRepository;
	}



	@Override
	public List<Note> getAllNotes(){
		return noteRepository.findAll();
	}

	@Override
	public Note saveNote(Note note){
		return noteRepository.save(note);
	}

	@Override
	public Note getNoteById(Long id) {
		return noteRepository.findById(id).get();
	}

	@Override
	public Note updateNote(Note note) {
		return noteRepository.save(note);
	}

	@Override
	public void deleteNoteById(Long id) {
		noteRepository.deleteById(id);
	}
}
