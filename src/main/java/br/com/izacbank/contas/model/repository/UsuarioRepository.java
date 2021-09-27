package br.com.izacbank.contas.model.repository;

import br.com.izacbank.contas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
