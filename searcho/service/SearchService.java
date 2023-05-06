package src.service;

import src.domain.Entity;

public interface SearchService {

    Iterable<Entity> search(String text);

}
