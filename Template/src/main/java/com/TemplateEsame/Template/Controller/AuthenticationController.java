package com.TemplateEsame.Template.Controller;
import com.TemplateEsame.Template.Model.User;
import com.TemplateEsame.Template.Model.UserDto;
import com.TemplateEsame.Template.Service.AuthenticationService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDto request) {
        if (authenticationService.userExists(request.getUsername())) {
            return ResponseEntity.badRequest().body("L'utente esiste già");
        }

        String passwordHash = BCrypt.hashpw(request.getPassword(), BCrypt.gensalt());

        User user = new User(request.getUsername(), passwordHash);

        authenticationService.Register(user);

        String token = authenticationService.createToken(user);

        return ResponseEntity.ok(token);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDto request) {
        User user = authenticationService.getUserByUsername(request.getUsername());
        if (user == null || !BCrypt.checkpw(request.getPassword(), user.getPassword())) {
            return ResponseEntity.badRequest().body("Credenziali Errate");
        }

        String token = authenticationService.createToken(user);
        return ResponseEntity.ok(token);
    }
}
