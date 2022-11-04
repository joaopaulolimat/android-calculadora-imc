    package com.example.calculadoraimc

    import org.junit.Assert.*
    import org.junit.Test

    class UtilsTest{
        // testa se o resultado do imc está dando certo
        @Test
        fun testGetImcResult_90_180_sobrepeso() {
            val result = getImcResult("90", "1.80")
            assertEquals(result.result, Result.SOBREPESO)
        }

        // testa se os campos de peso e altura estão sendo preenchidos e retornando informação para o usuário
        @Test
        fun testGetImcResult_embranco_aviso() {
            val semPeso = getImcResult("", "1.80")
            assertEquals(semPeso.result, Result.BLANK)

            val semAltura = getImcResult("90", "")
            assertEquals(semAltura.result, Result.BLANK)
        }
    }