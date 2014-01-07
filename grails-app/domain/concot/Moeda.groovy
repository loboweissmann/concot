package concot

class Moeda {
	
	String nome
	String simbolo

    static constraints = {
    	nome nullable:false, blank:false, maxSize:64
    	simbolo nullable:false, blank:false, maxSize:4, unique:true
    }
}
