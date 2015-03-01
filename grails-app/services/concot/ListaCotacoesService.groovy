package concot

import grails.transaction.Transactional

@Transactional
class ListaCotacoesService {

	/**
		Verifica os limites
	*/
	private boolean testeLimites(ListaCotacoes lista, Cotacao cotacao) {
		def limite = LimiteCotacao.findByItemAndListaAndMoeda(cotacao.item, lista, cotacao.moeda)
			if ( limite &&
				 ((limite.valorMaximo && cotacao.valor > limite.valorMaximo) ||
				  (limite.valorMinimo && cotacao.valor < limite.valorMinimo) ))
			 {
				return false
			 } 
		
		true
	}

    def incluirCotacao(ListaCotacoes lista, Cotacao cotacao, Date data) {
    	if (lista && cotacao && data && testeLimites(lista, cotacao)) {
    		return new CotacaoLista(cotacao:cotacao, lista:lista, dataInclusao:data).save()
    	}
    	null
    }
}
