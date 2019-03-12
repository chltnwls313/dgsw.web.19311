package kr.hs.dgsw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping
    public String getString() {
        return "Hello world";
    }
}
//158bf08d16e9f625598f15dddd69619f8f53ca0e
