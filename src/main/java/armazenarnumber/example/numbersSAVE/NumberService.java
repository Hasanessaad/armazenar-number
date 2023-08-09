package armazenarnumber.example.numbersSAVE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class NumberService {

    @Autowired
    private NumberRepository numberRepository;


        public Number processar(List<Integer> number){
            if(number.size() < 20){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }else{
                Number numberes = new Number();
                numberes.setNumDadosRecebidos(number.size());
                int soma = 0;
                double media = 0;
                for(int i=0;i<number.size();i++){
                    soma = soma + number.get(i);
                }
                numberes.setMedia(soma / number.size());
                return numberes;
            }

    }

}
