package src.repository.impl;

import src.domain.Entity;
import src.domain.Person;

import java.util.ArrayList;

public class PersonRepositoryImpl extends RepositoryImpl {

    @Override
    protected Iterable<Entity> findAll() {
        ArrayList<Entity> data = new ArrayList<>();
        data.add(new Person(1, "Annie", "Versaire"));
        data.add(new Person(2, "Jean", "Aimarre"));
        data.add(new Person(3, "Vincent", "Time"));
        return data;
    }
}
