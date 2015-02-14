package concot

class ItemController {

	def imagem(long id) {
		def item = Item.get(id)
		if (item) {
			out << item.imagem
		}
	}

    static scaffold = Item
}
