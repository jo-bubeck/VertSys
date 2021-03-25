package de.dhbw.wwi19b4.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryService implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    @NotNull(message = "Der Name muss gesetzt sein!")
    @Size(min = 1, max = 100)
    private String name = "";

    @OneToMany(mappedBy = "libraryService", cascade = {CascadeType.REMOVE})
    List<Book> books = new ArrayList<>();
}
