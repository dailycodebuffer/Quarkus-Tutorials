package com.dailycodebuffer

import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/book")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class BookController {

    private val books: ArrayList<Book> = ArrayList();

    @POST
    fun addBooks(book: Book) : Book {
        books.add(book)
        return book
    }

    @GET
    fun getAllBooks() = books

    @GET
    @Path("/{title}")
    fun getBooksByTitle(@PathParam("title") title: String) : Book?
    {
        val book:Book? = books.find { it.title == title }
        return book
    }

}