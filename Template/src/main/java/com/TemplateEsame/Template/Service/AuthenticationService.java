package com.TemplateEsame.Template.Service;
import com.TemplateEsame.Template.Model.User;
import com.TemplateEsame.Template.Repository.UserRepository;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;

import java.util.Date;
import java.util.List;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    private String jwtSecret = "chiave segreta del token";

    public boolean userExists(String username) {
        List<User> users = userRepository.findByName(username);
        return !users.isEmpty(); // Verifica se la lista non è vuota
    }

    public void Register(User user){
        userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        return userRepository.findByName(username).getFirst();
    }

    public String createToken(User user) {
        return Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000)) // 1 giorno di validità
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }
}
