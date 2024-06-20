package pjatk.edu.kacper.finalproject.bookorder.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pjatk.edu.kacper.finalproject.bookorder.entity.BookEntries;
import pjatk.edu.kacper.finalproject.bookorder.repository.BookOrderRepository;

import java.util.List;

@Service
public class BookOrderService {

    final private BookOrderRepository bookOrderRepository;

    @Autowired
    public BookOrderService(BookOrderRepository bookOrderRepository) {
        this.bookOrderRepository = bookOrderRepository;
    }

    @Transactional
    public void saveOrder(List<BookEntries> bookEntries){

        bookOrderRepository.saveAll(bookEntries);

        //TODO Osobna metoda w serwisie prywatna który przeleci przez książki.

    }



}
