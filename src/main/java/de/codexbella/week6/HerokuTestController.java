package de.codexbella.week6;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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
    @PostMapping("/calculate")
    public String calculate(@RequestBody int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return "Das Ergebnis ist "+result;
    }
}
