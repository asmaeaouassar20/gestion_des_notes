package algostyle.asmaeaouassar.project.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="notes")
public class Note {
	@Id
	private Long id;
	
	@Column(name="date_note",nullable=false,columnDefinition = "DATETIME")
	private LocalDateTime date;
	
	@Column(nullable=false)
	private String message;



	
	public Note(Long id,LocalDateTime date, String message) {
		this.id=id;
		this.date = date;
		this.message = message;
	}
	
	
	
	
}
