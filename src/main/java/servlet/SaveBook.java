package servlet;

import dao.BookDao;
import model.Book;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveBook extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Inject
    private BookDao bookDao;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String isbn = request.getParameter("isbn");
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        Book book = new Book(isbn, name, author);
        bookDao.save(book);
        response.sendRedirect(request.getContextPath());
    }
}