package herancaPedagio

open class Veiculo(
    open var placa: String,
    open var cor: String,
    open var marca: String,
    open var modelo: String,
    open var numeroEixos: Int,
    open var taxaPedagio: Double)
    {

    open fun emitirTicketPedagio() {
        println("Placa: $placa")
        println("Cor: $cor")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Número de Eixos: $numeroEixos")
        println("Valor de Taxa: R$ %.2f".format(taxaPedagio))
        println("")
    }

}

class Moto(override var placa: String,
           override var cor: String,
           override var marca: String,
           override var modelo: String,
           override var numeroEixos: Int = 0,
           override var taxaPedagio: Double = 5.00) : Veiculo(placa, cor, marca, modelo, numeroEixos, taxaPedagio) {

    override fun emitirTicketPedagio() {
        println("Veículo: Moto")
        super.emitirTicketPedagio()
           }

}

class Carro(override var placa: String,
            override var cor: String,
            override var marca: String,
            override var modelo: String,
            override var numeroEixos: Int = 2,
            override var taxaPedagio: Double = 8.50) : Veiculo(placa, cor, marca, modelo, numeroEixos, taxaPedagio) {

    override fun emitirTicketPedagio() {
        println("Veículo: Carro")
        super.emitirTicketPedagio()
    }


    class Caminhao(
        override var placa: String,
        override var cor: String,
        override var marca: String,
        override var modelo: String,
        override var numeroEixos: Int,
        override var taxaPedagio: Double = 8.50 * numeroEixos.toDouble()
    ) : Veiculo(placa, cor, marca, modelo, numeroEixos, taxaPedagio) {

        override fun emitirTicketPedagio() {
            println("Veículo: Caminhão")
            super.emitirTicketPedagio()
            }
    }
}

fun main(args: Array<String>) {
    val carro1 = Carro(placa = "ABD-4558", cor = "Cinza", marca = "Toyota", modelo = "Versa")
    carro1.emitirTicketPedagio()

    val carro2 = Carro(placa = "FDS-5547", cor = "Vermelho", marca = "Fiat", modelo = "Uno")
    carro2.emitirTicketPedagio()

    val moto1 = Moto(placa = "DCS-9868", cor = "Azul", marca = "Honda", modelo = "Biz-125")
    moto1.emitirTicketPedagio()

    val moto2 = Moto(placa = "BGH-6382", cor = "Preto", marca = "Yamaha", modelo = "VX-7")
    moto2.emitirTicketPedagio()

    val caminhao1 = Carro.Caminhao(placa = "DKW-5799", cor = "Branco", marca = "Mercedes-Benz",
        modelo = "Accelo", numeroEixos = 3)
    caminhao1.emitirTicketPedagio()

    val caminhao2 = Carro.Caminhao(placa = "DTF-5447", cor = "Verde", marca = "Mercedes-Benz",
        modelo = "Actros", numeroEixos = 6)
    caminhao2.emitirTicketPedagio()

}


//Imprimir:
//Veiculo: Carro
//Placa: XPTO-1234
//Cor: Cinza
//Marca: BMW
//Modelo: X1
//Número de Eixos: 2
//Valor de Taxa: R$ 5,00