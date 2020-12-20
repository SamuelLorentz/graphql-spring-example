package com.example.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BookResolver implements GraphQLQueryResolver {

    public List<Book> getBooks() {
        var book1 = new Book("1", "Clean Code");
        var book2 = new Book("2", "Domain Driven Design");

        return Arrays.asList(book1, book2);
    }
}
