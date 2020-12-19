package br.com.fiap.dockermoney.api.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.fiap.dockermoney.api.dto.LancamentoEstatisticaCategoria;
import br.com.fiap.dockermoney.api.dto.LancamentoEstatisticaDia;
import br.com.fiap.dockermoney.api.dto.LancamentoEstatisticaPessoa;
import br.com.fiap.dockermoney.api.model.Lancamento;
import br.com.fiap.dockermoney.api.repository.filter.LancamentoFilter;
import br.com.fiap.dockermoney.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public List<LancamentoEstatisticaPessoa> porPessoa(LocalDate inicio, LocalDate fim);
	public List<LancamentoEstatisticaCategoria> porCategoria(LocalDate mesReferencia);
	public List<LancamentoEstatisticaDia> porDia(LocalDate mesReferencia);

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
