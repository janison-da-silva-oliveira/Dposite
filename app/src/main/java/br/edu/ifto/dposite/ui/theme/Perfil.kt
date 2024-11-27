package br.edu.ifto.dposite.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.ifto.dposite.R


@Composable
fun Perfil () {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF596495), // 0%: Azul mais escuro
                        Color(0xFF3D8BC5), // 50%: Azul intermediário
                        Color(0xFF708EBC)  // 75%: Azul claro
                    ),
                    start = Offset(0f, 0f),   // Começa no topo esquerdo
                    end = Offset(0f, Float.POSITIVE_INFINITY) // Vai até o fundo
                )
            )
    )

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.perfil),
            contentDescription = "Foto de Perfil",
            modifier = Modifier.padding(top = 150.dp).size(152.dp)
        )
        Text( modifier = Modifier.padding(top = 10.dp),
            text = "Nome de Usúario",
            fontSize = 32.sp)


        //Suas informações
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround)
        {

            Image(
                painter = painterResource(R.drawable.iconeinfo),
                contentDescription = "Icone Informações",
                modifier = Modifier.size(30.dp)
            )
            Text( modifier = Modifier.padding(top = 10.dp),
                text = "Suas Informações",
                fontSize = 30.sp)
        }

        //Email do Usúario
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround)
        {

            Image(
                painter = painterResource(R.drawable.email),
                contentDescription = "Email",
                modifier = Modifier.size(30.dp)
            )
            Text( modifier = Modifier.padding(top = 10.dp),
                text = "User@gmail.com",
                fontSize = 30.sp)
        }

        //Telefone
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround)
        {

            Image(
                painter = painterResource(R.drawable.telefone),
                contentDescription = "Telefone",
                modifier = Modifier.size(30.dp)
            )
            Text( modifier = Modifier.padding(top = 10.dp),
                text = "(63) 90000-0000",
                fontSize = 30.sp)
        }

        //Suas informações
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround)
        {

            Image(
                painter = painterResource(R.drawable.editar),
                contentDescription = "Editar",
                modifier = Modifier.size(30.dp)
            )
            Text( modifier = Modifier.padding(top = 10.dp),
                text = "Alterar Informações",
                fontSize = 30.sp)
        }

        Button(onClick = {
                    // Ação que ocorre ao clicar no botão
                }, modifier = Modifier.padding(16.dp)
            // Opcional: Adiciona margens ao botão
            ) {
                Text(
                    text = "Sair",
                    fontSize = 25.sp,
                    color = Color.White
                ) // Conteúdo do botão
            }
        }
    }