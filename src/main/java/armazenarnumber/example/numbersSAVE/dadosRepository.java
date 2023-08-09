package armazenarnumber.example.numbersSAVE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dadosRepository extends JpaRepository<dados, Long> {

}
