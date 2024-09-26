package algostyle.asmaeaouassar.project;

import algostyle.asmaeaouassar.project.entity.Note;
import algostyle.asmaeaouassar.project.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;

@SpringBootApplication
public class ManagingDateLinkedMessagesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManagingDateLinkedMessagesApplication.class, args);
	}

	@Autowired
	private NoteRepository noteRepository;

	// La méthode run est exécutée apres le démarrage de l'application.
	// Elle permet d'initialiser la base de données avec des données de test
	// Elle est utilisée pour sauvegarder des objets Note dans la BD lors de démarrage de l'app
	@Override
	public void run(String... args) throws Exception {
	/*	Note note1=new Note(LocalDateTime.of(2023,8,8,06,30,55),"message1");
		Note note2=new Note(LocalDateTime.parse("2024-09-25T13:55"),"message2");
		Note note3=new Note(LocalDateTime.now(),"message3");

		noteRepository.save(note1);
		noteRepository.save(note2);
		noteRepository.save(note3);

	 */
	}


}
