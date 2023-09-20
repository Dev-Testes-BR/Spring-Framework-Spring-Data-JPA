package br.com.treinaweb.twprojetos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojetos.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
    // Resolve o problema de n+1 (Faz um JOIN da entidade Cliente com a Entidade
    // Endereço)
    @EntityGraph(attributePaths = "endereco")
    List<Cliente> findAll();
}
