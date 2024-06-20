package pjatk.edu.kacper.finalproject.bookorder.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
//Pomocniczna klasa prywatna do zbudowania przyjmowanego przez nas Obiektu z innego modułu

@Getter
@Setter
@Builder
public class PostBookEntryRequest {

    private long bookId;
    private String title;
    private int entries;
}

