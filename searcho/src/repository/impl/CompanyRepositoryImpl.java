package src.repository.impl;

import src.domain.Company;
import src.domain.Entity;

import java.util.ArrayList;

public class CompanyRepositoryImpl extends RepositoryImpl {
    @Override
    protected Iterable<Entity> findAll() {
        ArrayList<Entity> data = new ArrayList<>();
        data.add(new Company(1, "Google"));
        data.add(new Company(2, "Microsoft"));
        data.add(new Company(3, "Apple"));
        return data;
    }
}
