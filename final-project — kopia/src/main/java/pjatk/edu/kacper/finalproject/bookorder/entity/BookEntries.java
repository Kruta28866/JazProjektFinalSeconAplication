package pjatk.edu.kacper.finalproject.bookorder.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Entity
@Data
@Table(name = "book_entries")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BookEntries {

    @Id
    private long bookId;
    private int entries;

}
