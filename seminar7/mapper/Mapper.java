package seminar7.mapper;

public interface Mapper<E,T> {
    E toOutput();
    T toInput();
}
