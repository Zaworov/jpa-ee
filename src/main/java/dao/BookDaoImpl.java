package dao;

import model.Book;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

@RequestScoped
public class BookDaoImpl implements BookDao {

    @PersistenceUnit(name = "myPersistenceUnit")
    private EntityManagerFactory emFactory;

    @Override
    public void save(Book book) {
        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(book);
        tx.commit();
        entityManager.close();
    }

    @Override
    public Book get(Long id) {
        EntityManager entityManager = emFactory.createEntityManager();
        Book book = entityManager.find(Book.class, id);
        entityManager.close();
        return book;
    }

    @Override
    public void update(Book book){
        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.merge(book);
        tx.commit();
        entityManager.close();
    }

    @Override
    public void delete(Long bookId) {
        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        Book bookToRemove = entityManager.find(Book.class, bookId);
        tx.begin();
        entityManager.remove(bookToRemove);
        tx.commit();
        entityManager.close();
        System.out.println(bookToRemove.getId());
    }
}