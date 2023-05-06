package org.example.repository;

import org.example.domain.Jet;

public interface JetRepository {

    Iterable<Jet> findAll();

}
