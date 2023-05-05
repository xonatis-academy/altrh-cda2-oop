package src.service.impl;

import src.domain.Entity;
import src.repository.Repository;
import src.service.SearchService;

import java.util.ArrayList;

public class SearchServiceImpl implements SearchService {

    private final Iterable<Repository> repositories;

    public SearchServiceImpl(Iterable<Repository> repositories) {
        this.repositories = repositories;
    }

    public Iterable<Entity> search(String text) {
        ArrayList<Entity> results = new ArrayList<>();
        for (Repository repository : repositories) {
            Iterable<Entity> subResults = repository.search(text);
            for (Entity entity : subResults) {
                results.add(entity);
            }
        }
        return results;
    }
}
