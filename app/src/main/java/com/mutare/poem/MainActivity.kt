package com.mutare.poem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mutare.poem.ui.theme.FundoApp
import com.mutare.poem.ui.theme.PoemTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.sp
import com.mutare.poem.ui.theme.AliceFamily

val CorBotao= Color(0xFFD9B95B)



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PoemTheme {
FrasesEBotao()
            }
        }
    }
}
//modifier:Modifier=Modifier -> permite modificações externas opcionais, caso não receba, "Modifier" é adicionado como padrão.
// modifier = modifier
@Composable
fun FrasesEBotao(modifier: Modifier = Modifier)  //definindo o padrão de modificador
{

    var fraseAtual by remember { mutableStateOf<Frase?>(null) } //estado observável
    //utiliza o by remember para atualizar e lembrar do resultado

    Column(
        modifier = modifier //repassando o modificador já declarado
            .fillMaxSize()
            .background(FundoApp)
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top

    ) {

        Text(
            text = "Poem Sorter",
            color = Color.White,
            fontFamily = AliceFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(top = 24.dp)
                .padding(horizontal = 16.dp)
        )
        Text(
            text = "Adote o livro da frase sorteada!",
            color = Color.White,
            fontFamily = AliceFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )

        Image(
            painter = painterResource(R.drawable.icone_app_1024), // painter usado para importação ou uso de imagens/ícones a partir do seu encereço no android
            contentDescription = null,
            modifier=Modifier
                .size(300.dp)
                //nao há necessidade de acessibilidade para Talk Back
            //size definiria o tamanho da imagem importada (pois está dentro do parâmetro imagem)
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            contentAlignment = Alignment.Center
        )
        {
            val frase = fraseAtual

          if(frase != null)
          {
              Column(
                  horizontalAlignment = Alignment.CenterHorizontally,
                  verticalArrangement = Arrangement.spacedBy(16.dp)
              ) {
                  Text(
                      text = frase.texto,
                      color = Color.White,
                      textAlign = TextAlign.Center,
                  )
                  Text(text = "— ${frase.livro}", color = Color.White)
              }
          }
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.onda),//arquivo xml a partir de svg
                contentDescription = null,
            )
            Image(
                painter = painterResource(R.drawable.onda),//duplicação do mesmo caminho
                contentDescription = null,

            )
        }

        Button(
            onClick = { fraseAtual = frases.random() },
            colors = ButtonDefaults.buttonColors(
                containerColor = (CorBotao),
                contentColor = (Color.Black),
            ),
            border = BorderStroke(2.dp, Color.White),
            modifier = Modifier
                .padding(vertical = 32.dp)
                .height(70.dp)
                .fillMaxWidth(0.6f)

        )
        {
            Text(
                "Sortear",
                fontWeight = FontWeight.Bold,
                fontFamily = AliceFamily,
                fontSize = 24.sp
            )
        }
        //container color -> fundo do botão
        //content color -> cor do texto "cor do conteúdo"
    }
}


@Preview(showBackground = true, showSystemUi =true)
@Composable
fun FrasesEbotaoPrevia() {
    PoemTheme {
        FrasesEBotao()
    }

}
