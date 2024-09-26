package algostyle.asmaeaouassar.project.controller;


import algostyle.asmaeaouassar.project.entity.Note;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import algostyle.asmaeaouassar.project.service.NoteService;

import org.springframework.ui.Model;

@Controller
public class NoteController {

	private NoteService noteService;
	public NoteController(NoteService noteService) {
		super();
		this.noteService = noteService;
	}

	
	@GetMapping("/notes")
	public String showNotes(Model model) {
		model.addAttribute("notes",noteService.getAllNotes());
		return "notes";
	}

	@GetMapping("/notes/new")
	public String createStudent(Model model){
		// this is an object to hold note data
		Note note=new Note();

		model.addAttribute("note",note);
		return "create_note";
	}


	@PostMapping("/notes")
	public String saveStudent(@ModelAttribute("note") Note note){
		noteService.saveNote(note);
		return "redirect:/notes";
	}


	@GetMapping("/notes/edit/{id}")
	public String editNote(
			@PathVariable Long id,
			Model model
	){
		model.addAttribute("note",noteService.getNoteById(id));
		return "edit_note";
	}


	@PostMapping("/notes/{id}")
	public String updateNote(
			@PathVariable Long id,
			@ModelAttribute("note") Note note
	){

		// get the note from DB by id
		Note noteFromDB=noteService.getNoteById(id);

		noteFromDB.setDate(note.getDate());
		noteFromDB.setMessage(note.getMessage());

		noteService.updateNote(noteFromDB);
		return "redirect:/notes";
	}


	@GetMapping("/notes/{id}")
	public String deleteNote(@PathVariable Long id){
		noteService.deleteNoteById(id);
		return "redirect:/notes";
	}
	
}
