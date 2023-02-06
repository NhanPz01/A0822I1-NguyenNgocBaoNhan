package service;

import java.util.List;

public interface IService<E> {
    List<E> findAll();
    void add(E e);
}
