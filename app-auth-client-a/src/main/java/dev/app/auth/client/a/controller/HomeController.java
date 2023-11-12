package dev.app.auth.client.a.controller;

import java.security.Principal;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Anish Panthi
 */
@RestController
@ResponseBody
public class HomeController {

  @GetMapping("/")
  Map<String, String> welcomeHome(Principal principal) {
    return Map.of("message", "Hello, " + principal.getName());
  }

}
