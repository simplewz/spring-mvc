package org.simple.book.controller;

import org.simple.book.pojo.Book;
import org.simple.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public String getAll(Model model){
        List<Book> allBook = bookService.selectAll();
        model.addAttribute("booklist",allBook);
        return "list";
    }

    @GetMapping("/addPage")
    public String addPage(){
        return "addPage";
    }
}
