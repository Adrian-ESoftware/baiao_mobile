fun main() {
    // 1. Comparação de duas Strings
    val stringA = "Kotlin"
    val stringB = "Kotlin"
    println("1. A string A é igual à string B? ${stringA == stringB}")

    // 2. Verifica se a idade permite dirigir
    val idade = 30
    val podeDirigir = idade >= 18
    println("2. Pode dirigir? $podeDirigir")

    // 3. Inversão da lógica: verifica se não pode dirigir
    println("3. Não pode dirigir? ${!podeDirigir}")

    // 4. É motorista OU tem 17 anos ou mais
    val ehMotorista = true
    println("4. É motorista ou tem 17 anos ou mais? ${ehMotorista || idade >= 17}")

    // 5. É motorista E tem mais de 30 anos
    println("5. É motorista e tem mais de 30 anos? ${ehMotorista && idade > 30}")

    // 6. Desconto de 12% para iMac com preço a partir de R$ 10.000
    val produto = "iMac"
    val preco = 22000.0

    if (produto == "iMac" && preco >= 10000.0) {
        val desconto = preco * 0.12
        val total = preco - desconto
        println("6. Desconto aplicado de 12%. Total a pagar: R$ ${"%.0f".format(total)}")
    }

    // Desafio: identifica fim de semana ou dia útil usando when
    print("\nInforme o dia da semana (SAB, DOM, SEG, TER, QUA, QUI ou SEX): ")
    val dia = readlnOrNull()?.trim()?.uppercase()

    when (dia) {
        "SAB", "DOM" -> println("Fim de semana")
        "SEG", "TER", "QUA", "QUI", "SEX" -> println("Dia útil")
        else -> println("Erro: informe um dia válido.")
    }
}
