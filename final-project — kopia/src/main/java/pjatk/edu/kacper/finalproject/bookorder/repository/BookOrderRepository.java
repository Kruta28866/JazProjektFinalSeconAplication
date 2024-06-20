package pjatk.edu.kacper.finalproject.bookorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.edu.kacper.finalproject.bookorder.entity.BookEntries;

@Repository
public interface BookOrderRepository extends JpaRepository<BookEntries, Long> {
}
