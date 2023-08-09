package armazenarnumber.example.numbersSAVE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @PostMapping("/add")
    public ResponseEntity<?> processar (@RequestBody dados numero) {


        return ResponseEntity.ok(numberService.processar(numero.getDados()));

    }
}
