package ra.service;

public interface IGeneric<T, E> {
    T[] findAll();
    T findById(E id);
    void save(T t);
    void delete(E id);
}
