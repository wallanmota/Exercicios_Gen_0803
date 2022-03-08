class Cavalo(nome: String, idade: Int):Animal(nome, idade) {
    override fun movimeto() {
        println("$nome está correndo no campo")
    }
    override fun som() {
        println("$nome está relinchando")
    }
}