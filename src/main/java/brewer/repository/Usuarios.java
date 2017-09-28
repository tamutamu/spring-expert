package brewer.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import brewer.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByEmailIgnoreCase(String email);
}