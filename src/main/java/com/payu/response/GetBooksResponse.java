package com.payu.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anele Chila
 */
@Getter
@Setter
@AllArgsConstructor
public class GetBooksResponse extends BookResponse {

    private List<GetBookResponse> booksList =  new ArrayList<>();

    public GetBooksResponse() {
        super(ResponseCode.RETRIEVED.getCode(),ResponseCode.RETRIEVED.getDesc());
    }

    public void addBook(GetBookResponse book) {
        booksList.add(book);
    }
}
