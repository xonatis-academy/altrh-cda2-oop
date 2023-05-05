import src.controller.SearchController;
import src.repository.Repository;
import src.repository.impl.CompanyRepositoryImpl;
import src.repository.impl.HouseRepositoryImpl;
import src.repository.impl.PersonRepositoryImpl;
import src.service.SearchService;
import src.service.impl.SearchServiceImpl;

import java.util.ArrayList;

public class SearchoApplication {

    public static void main(String[] args) {
        Repository kevin = new CompanyRepositoryImpl();
        Repository julie = new PersonRepositoryImpl();
        Repository hugues = new HouseRepositoryImpl();
        ArrayList<Repository> repositories = new ArrayList<>();
        repositories.add(kevin);
        repositories.add(julie);
        repositories.add(hugues);

        SearchService jane = new SearchServiceImpl(repositories);
        SearchController jean = new SearchController(jane);

        Iterable<String> results = jean.search("o");
        System.out.println(results);

    }

}

