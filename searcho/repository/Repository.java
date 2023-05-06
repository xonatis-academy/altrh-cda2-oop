package src.repository;

import src.domain.Entity;

public interface Repository {

    Iterable<Entity> search(String text);

}
