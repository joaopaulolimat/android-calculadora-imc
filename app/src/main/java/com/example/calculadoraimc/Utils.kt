package com.example.calculadoraimc
internal fun getImcResult(pesoTxt: String, alturaTxt: String): IMCResult {

    // checa se voltou texto sobre altura e/ou peso
    if(pesoTxt.isNullOrEmpty() || alturaTxt.isNullOrEmpty()){
        return IMCResult(Result.BLANK)
    }

    // converte valores para float
    val peso = pesoTxt.toFloat()
    val altura = alturaTxt.toFloat()
    val imc = peso / (altura * altura)

    // checa o valor do imc e retorna o que ele indica
    if (imc < 16){
        return IMCResult(Result.MAGREZA_III)
    } else if (imc < 17){
        return IMCResult(Result.MAGREZA_II)
    } else if (imc < 18.5){
        return IMCResult(Result.MAGREZA_I)
    } else if (imc < 25){
        return IMCResult(Result.OK)
    } else if (imc < 30){
        return IMCResult(Result.SOBREPESO)
    } else if (imc < 35){
        return IMCResult(Result.OBESIDADE_I)
    } else if (imc < 40){
        return IMCResult(Result.OBESIDADE_II)
    } else {
        return IMCResult(Result.OBESIDADE_III)
    }
}

data class IMCResult(val result: Result)
enum class Result(val label: String) {
    //enum com os resultados do imc
    MAGREZA_III("Magreza Severa"),
    MAGREZA_II("Magreza moderada"),
    MAGREZA_I("Magreza leve"),
    OK("Saudável"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_I("Obesidade Grau I"),
    OBESIDADE_II("Obesidade GHrau II (severa)"),
    OBESIDADE_III("Obesidade GHrau III (mórbida)"),
    BLANK("Insira os valores de peso e altura corretamente!")
}