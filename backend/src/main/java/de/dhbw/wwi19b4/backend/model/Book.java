package de.dhbw.wwi19b4.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

// Entity-Klasse für ein Buch
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //n zu 1 Beziehung zwischen Buch und Library
    @ManyToOne
    private LibraryService libraryService;

    //Konfigurieren der Spaltennamen und Attributen eines Buches
    @Column(length = 100)
    @NotNull(message = "Der Name muss gesetzt sein!")
    @Size(min = 1, max = 100)
    private String title = "";

    private int yearOfPublication;

    private int pages = 0;
}
