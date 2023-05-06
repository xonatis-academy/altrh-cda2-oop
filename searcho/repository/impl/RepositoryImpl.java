package src.repository.impl;

import src.domain.Entity;
import src.repository.Repository;

import java.util.ArrayList;

public abstract class RepositoryImpl implements Repository {

    protected abstract Iterable<Entity> findAll();

    private Iterable<Entity> filter(Iterable<Entity> data, String text) {
        ArrayList<Entity> results = new ArrayList<>();
        for (Entity entity : data) {
            if (entity.match(text)) {
                results.add(entity);
            }
        }
        return results;
    }

    public Iterable<Entity> search(String text) {
        Iterable<Entity> data = findAll();
        Iterable<Entity> results = filter(data, text);
        return results;
    }

}
