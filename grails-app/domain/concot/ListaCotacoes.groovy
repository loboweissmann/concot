package concot

class ListaCotacoes {

	String nome

    static constraints = {
    	nome nullable:false, blank:false, maxSize:128, unique:true
    }
}
