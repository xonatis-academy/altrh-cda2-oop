package src.controller;

import src.domain.Entity;
import src.service.SearchService;

import java.util.ArrayList;

public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    public Iterable<String> search(String text) {
        Iterable<Entity> results = searchService.search(text);
        ArrayList<String> dtos = new ArrayList<>();
        for (Entity entity : results) {
            dtos.add(entity.toString());
        }
        return dtos;
    }

}
