package br.com.crinnnger.codeanywhere.SpringJWT.service;

import br.com.crinnnger.codeanywhere.SpringJWT.data.UserData;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserData user = findUser(userName).orElseThrow(()->new UsernameNotFoundException(userName));
        return new User(user.getUserName(),user.getPassword(), Collections.emptyList());
    }

    private Optional<UserData> findUser(String userName){
        Optional<UserData> user = Optional.of(new UserData("admin", bCryptPasswordEncoder.encode("teste")));
        return user;
    }

    public List<UserData> listUsers(){
        ArrayList<UserData> lst = new ArrayList<>();
        lst.add(findUser("admin").orElseThrow());
        return lst;
    }
}
