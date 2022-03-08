package de.codexbella.week6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class HerokuTestController {

    @GetMapping("/{searchTerm}")
    public String getMatchingToDoItems(@PathVariable String searchTerm) {
        return "Ich suche dringend "+searchTerm;
    }
}
