package armazenarnumber.example.numbersSAVE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/number")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @PostMapping("/add")
    public ResponseEntity<?> processar(@RequestBody List<Integer> numero) {

        Number number = this.numberService.processar(numero);
        return ResponseEntity.ok(number);

    }
}
