package de.codexbella.week6;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class HerokuTestController {


    @GetMapping("/{searchTerm}")
    public String searching(@PathVariable String searchTerm) {
        return "Ich suche dringend "+searchTerm;
    }
    @PostMapping("/showstringlength")
    public String showStringLength(@RequestBody String input) {
        return "There are "+input.length()+" characters in the string you send.";
    }
}
