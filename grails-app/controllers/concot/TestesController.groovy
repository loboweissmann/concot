package concot

class TestesController {

    def index() { 
    	render "Olá mundo!"
    }

    def renderGSP() {
    	render view:'renderGSP', model:[nome:"Henrique"]
    }

    def retornaMap() {
    	[nome:"Henrique", sobrenome:"Lobo"]
    }

    def renderizeXML() {
    	render(contentType:"text/xml") {
    		livro(titulo:"Falando de Grails")
    	}
    }

    def renderizeJSON() {
    	render(contentType:"application/json") {
    		titulo = "Falando de Grails"
    	}
    }
}
