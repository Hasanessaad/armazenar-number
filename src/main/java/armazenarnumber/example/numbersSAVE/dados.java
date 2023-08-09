package armazenarnumber.example.numbersSAVE;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dados", schema = "public")
public class dados {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private List<Integer> dados;

    public dados(Long id, List<Integer> dados) {
        this.id = id;
        this.dados = dados;
    }

    public dados() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Integer> getDados() {
        return dados;
    }

    public void setDados(List<Integer> dados) {
        this.dados = dados;
    }
}
