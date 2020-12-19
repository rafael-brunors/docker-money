package br.com.fiap.dockermoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.dockermoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
