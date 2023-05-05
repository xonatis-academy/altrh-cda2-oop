package src.repository.impl;

import src.domain.Entity;
import src.domain.House;

import java.util.ArrayList;

public class HouseRepositoryImpl extends RepositoryImpl {

    @Override
    protected Iterable<Entity> findAll() {
        ArrayList<Entity> data = new ArrayList<>();
        data.add(new House("49 rue de Pointheu, 75008 Paris"));
        data.add(new House("33 avenue du Maine, 75015 Paris"));
        data.add(new House("68200 Mulhouse"));
        return data;
    }
}

