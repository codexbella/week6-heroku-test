package de.codexbella.week6;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class HerokuTestController {

    @GetMapping("/{searchTerm}")
    public String getMatchingToDoItems(@PathVariable String searchTerm) {
        return "Ich suche dringend "+searchTerm;
    }
    @PostMapping("/calculate")
    public int calculate(@RequestBody int number) {
        return number*5;
    }
}
