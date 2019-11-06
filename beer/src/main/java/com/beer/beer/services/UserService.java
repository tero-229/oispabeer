package com.beer.beer.services;

        import com.beer.beer.Entities.BeerUser;
        import com.beer.beer.repositories.BeerUserRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.ArrayList;
        import java.util.List;

@Service
public class UserService {

    @Autowired
    BeerUserRepository beerUserRepository;

    public List<String> getUsersEmail() {

        List<BeerUser> beerUserList = (List<BeerUser>) beerUserRepository.findAll();

        List<String> emails = new ArrayList<>();
        for (int i= 0; i < beerUserList.size(); i++ ) {
            emails.add(beerUserList.get(i).getEmailAddress());
        }
        return emails;
    }
}
