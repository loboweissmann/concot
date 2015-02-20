package concot

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(TestesController)
class TestesControllerSpec extends Specification {

    void "action index simples: testando o método render"() {
    	when:
    	controller.index()
    	then:
    	response.text == "Olá mundo!"
    }

    void "testando o model de uma action"() {
    	when:
    	controller.renderGSP()
    	then:"o model deve ter a chave nome"
    	model.nome != null
    	then: "o model deve ter o valor Henrique"
    	model.nome == "Henrique"
    }

    void "testando a renderização de um GSP"() {
    	when:
    	controller.renderGSP()
    	then: "renderizei a view certa?"
    	view == '/testes/renderGSP'
    }

    void "testando uma action que retorna um map"() {
    	when:
    	def model = controller.retornaMap()
    	then: "Checando o map"
    	model.nome == "Henrique"
    	model.sobrenome == "Lobo"
    }

    void "testando o retorno em XML"() {
    	when:
    	controller.renderizeXML()
    	then:
    	response.text == "<livro titulo='Falando de Grails'/>"
    	response.xml.@titulo.text() == "Falando de Grails"
    }

    void "testando o retorno em JSON"() {
    	when:
    	controller.renderizeJSON()
    	then:
    	response.text == '{"titulo":"Falando de Grails"}'
    	response.json.titulo == "Falando de Grails"
    }
}
