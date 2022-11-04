package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
    class MainActivity : AppCompatActivity() {
        override fun onCreate (savedInstanceState: Bundle?) {
            super.onCreate (savedInstanceState )
            setContentView(R.layout.activity_main )

            // ação de clique do botão Calcular
            btn_make_calc.setOnClickListener {
                // pegar texto dos text inputs
                val pesoTxt = edt_peso.text.toString()
                val alturaTxt = edt_altura.text.toString()

                // calcula o imc a partir da classe de utils
                val imcResult = getImcResult(pesoTxt, alturaTxt)

                // mostra resultado do cálculo na tela
                txt_result_imc.text = imcResult.result.label
            }
        }
    }