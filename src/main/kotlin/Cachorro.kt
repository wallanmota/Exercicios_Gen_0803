class Cachorro(nome: String, idade: Int): Animal(nome,idade) {
    override fun movimeto() {
        println("$nome está correndo na praça")
    }
    override fun som() {
        println("$nome está latindo")
    }
}