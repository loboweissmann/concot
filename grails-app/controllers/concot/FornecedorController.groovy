package concot

class FornecedorController {

	static scaffold = Fornecedor

	def comunicacao() {
		[fornecedores:Fornecedor.list(), mensagem:new EnvioEmail()]
	}

	def enviarMensagem(EnvioEmail envio) {
		envio.validate()
		if (envio.hasErrors()) {
			flash.message = "Erro de validação"
			for (erro in envio.errors.allErrors) {
				println erro
			}
			render(view:"comunicacao", 
					model:[mensagem:envio, 
						   fornecedores:Fornecedor.list()])
		} else {
			flash.message = "Mensagem enviada com sucesso"
			render(view:'comunicacao')
		}
	}

    
}
