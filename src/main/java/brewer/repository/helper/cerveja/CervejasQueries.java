package brewer.repository.helper.cerveja;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import brewer.dto.CervejaDTO;
import brewer.dto.ValorItensEstoque;
import brewer.model.Cerveja;
import brewer.repository.filter.CervejaFilter;

public interface CervejasQueries {
	
	public Page<Cerveja> filtrar(CervejaFilter filtro, Pageable pageable);

	public List<CervejaDTO> porSkuOuNome(String skuOuNome); 
	public ValorItensEstoque valorItensEstoque();
}
