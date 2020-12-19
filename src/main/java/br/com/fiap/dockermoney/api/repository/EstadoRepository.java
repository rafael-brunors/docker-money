package br.com.fiap.dockermoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.dockermoney.api.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
