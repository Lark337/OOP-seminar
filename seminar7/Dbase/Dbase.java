package seminar7.Dbase;


import java.util.List;

public interface Dbase<E> {   
    void saveAll(List<E> list);
    List <E> readAll();      
}
