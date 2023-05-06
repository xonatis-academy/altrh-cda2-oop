package org.example.service.impl;

import org.example.domain.Jet;
import org.example.repository.JetRepository;
import org.example.service.JetService;

public class JetServiceImpl implements JetService {

    private final JetRepository jetRepository;

    public JetServiceImpl(JetRepository jetRepository) {
        this.jetRepository = jetRepository;
    }

    public Jet getJetByIndex(int index) {
        Iterable<Jet> jets = jetRepository.findAll();
        int i = 0;
        for (Jet jet : jets) {
            if (i == index) {
                return jet;
            }
            ++i;
        }
        return null;
    }
}
