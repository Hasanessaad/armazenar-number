package armazenarnumber.example.numbersSAVE;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Number {


    @Getter @Setter
    private double media;

    @Getter @Setter
    private double desvioPadrao;

    @Getter @Setter
    private double mediana;

    @Getter @Setter
    private int numDadosRecebidos;

    }


