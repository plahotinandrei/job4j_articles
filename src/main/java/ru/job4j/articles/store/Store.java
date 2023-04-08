package ru.job4j.articles.store;

import java.util.List;

public interface Store<T> {
    List<T> save(List<T> models);
    List<T> findAll();
}
