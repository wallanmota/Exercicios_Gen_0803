fun main() {

    val dog = Cachorro("Lalinha", 11)

    println("\nAções Cachorro:")
    dog.som()
    dog.movimeto()

    val horse = Cavalo("Tornado", 15)

    println("\nAções Cavalo:")
    horse.som()
    horse.movimeto()

    val sloth = Preguica("Soneca", 7)

    println("\nAções Preguiça:")
    sloth.som()
    sloth.movimeto()
}