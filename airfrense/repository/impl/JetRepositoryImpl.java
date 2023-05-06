package org.example.repository.impl;

import org.example.domain.Jet;
import org.example.repository.JetRepository;

import java.util.ArrayList;

public class JetRepositoryImpl implements JetRepository {

    public Iterable<Jet> findAll() {
        ArrayList<Jet> jets = new ArrayList<>();
        jets.add(new Jet("Hypersonic"));
        jets.add(new Jet("Confort"));
        jets.add(new Jet("Eco"));
        return jets;
    }

}
