class Preguica (nome: String, idade: Int):Animal(nome, idade) {
    override fun movimeto() {
        println("$nome está subindo uma arvore")
    }
    override fun som() {
        println("$nome disse: ......ihhhiiiiaaa")
    }
}