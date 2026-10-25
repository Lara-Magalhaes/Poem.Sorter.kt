package com.mutare.poem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (
    showBackground = true, showSystemUi = true
)
@Composable
fun TelaPrincipal(modifier: Modifier = Modifier){
    Column(modifier=modifier
        .fillMaxSize()
        .background(Color.Black)
        .safeDrawingPadding(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
       Box(
           modifier = Modifier
               .size(200.dp),
           contentAlignment = Alignment.Center
       )           {
               Text(text= "quero ficar no centro todo",
                   color= Color.White,
                   modifier= Modifier
                       .padding(vertical = 16.dp)
               )

           }

        Text(text= "Oie , eu fico abaixo da box!",
            color= Color.Blue,
            textAlign = TextAlign.Center
        )



    }
}

//os filhos da Column podem controlar apenas a horizontal, que é o eixo cruzado da Column
// a vertical é exclusivamente controlada pela Column. Logo, Text sozinho não pode definir seu alinhamento vertical.
//Ainda, a diferença entre uma Column e Box:
// Dois textos seguidos em uma Column ficarão rigidamente um embaixo do outro, enquanto  dois textos seguidos em uma box vão se sobrepor.
//Entretanto, é possível fazer modificações em cada texto dentro de uma box usando modificador.alignment em cada um.
//alternativa com column é usar Spacer