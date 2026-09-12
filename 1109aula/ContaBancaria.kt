class ContaBancaria {
    var saldo: Double = 0.0
    var titular: String = ""

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        saldo -= valor
    }

    fun buscarSaldo(): Double {
        return saldo
    }
}
