package enumFeriados

enum class Mes(val id: Int, val nome: String, val temFeriado: Boolean, val feriados: Int) {
    JANEIRO(1, "Janeiro", true, 1),
    FEVEREIRO(2, "Fevereiro", true, 1),
    MARCO(3, "Março", false, 0),
    ABRIL(4, "Abril", true, 2),
    MAIO(5, "Maio", true, 1),
    JUNHO(6, "Junho", false, 0),
    JULHO(7, "Julho", false, 0),
    AGOSTO(8, "Agosto", false, 0),
    SETEMBRO(9, "Setembro", true, 1),
    OUTUBRO(10, "Outubro", true, 1),
    NOVEMBRO(11, "Novembro", true, 2),
    DEZEMBRO(12, "Dezembro", true, 1)

}

fun main(args: Array<String>) {

    for (mesDoAno in Mes.values()) {
        if (mesDoAno.temFeriado && mesDoAno.feriados == 1) {
            println("O mês de ${mesDoAno.nome} possui ${mesDoAno.feriados} feriado.")
        } else if (mesDoAno.temFeriado == true && mesDoAno.feriados > 1) {
            println("O mês de ${mesDoAno.nome} possui ${mesDoAno.feriados} feriados.")
        } else {
            println("O mês de ${mesDoAno.nome} não possui feriado.")
        }
    }
}