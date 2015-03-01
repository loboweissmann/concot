package concot

class CotacaoLista {

	Date dataInclusao

	static belongsTo = [
		lista: ListaCotacoes,
		cotacao: Cotacao
	]

    static constraints = {
    }
}
