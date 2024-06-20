package pjatk.edu.kacper.finalproject.bookorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.edu.kacper.finalproject.bookorder.dto.PostBookEntryRequest;
import pjatk.edu.kacper.finalproject.bookorder.entity.BookEntries;
import pjatk.edu.kacper.finalproject.bookorder.service.BookOrderService;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class BookInfoController {

    private final BookOrderService orderService;

    @Autowired
    public BookInfoController(BookOrderService bookOrderService) {
        this.orderService = bookOrderService;
    }

    @GetMapping("/print")
    public void printPdf() {
        //TODO tutaj bedzie print do pdf
    }

    @PostMapping("/report")
    public ResponseEntity<Void> orderBooks(@RequestBody List<PostBookEntryRequest> bookEntries) {
        var books = bookEntries.stream()
                .map(book -> BookEntries
                        .builder()
                        .bookId(book.getBookId())
                        .entries(book.getEntries())
                        .build())
                .toList();
        orderService.saveOrder(books);

        return ResponseEntity.ok().build();

    }


}
