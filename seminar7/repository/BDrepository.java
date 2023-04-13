package seminar7.repository;

import java.util.List;

public interface BDrepository<E,I> {
    List<E> findAll();
    E create(E e);
    E findById(I id);
    E update(I id, E e);
    boolean delete(I id);
}
