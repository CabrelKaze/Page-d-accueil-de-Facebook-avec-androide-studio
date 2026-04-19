package com.example.facebook


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Login (modifier: Modifier = Modifier){
    var phoneOrEmail by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = 16.dp,
                vertical = 20.dp,

            )
    ) {
        Text(
            text = "facebook",
            fontSize = 50.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Blue,
            modifier = Modifier.padding( top = 50.dp)
        )
        Spacer(
            modifier = Modifier.height(  30.dp)
        )
        OutlinedTextField(
            value = phoneOrEmail,
            onValueChange = { phoneOrEmail = it },
            label = {
                Text("Numero de telephone ou Email")
            }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(10.dp)

        )
        Spacer( modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Password")
            }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(10.dp)
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors( Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(10.dp)
        )
        {
            Text("Login", fontWeight = FontWeight.Bold )
        }
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        TextButton(
            onClick = {}
        ) {
            Text("Mot de pass oublié", fontSize = 17.sp, color = Color.Blue)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .weight(1f)
                    .background(Color.Black)
            )
            Text(
                "or",
                fontSize = 17.sp,
                modifier = Modifier.padding(horizontal = 10.dp)

            )
            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .weight(1f)
                    .background(Color.Black)
            )
        }
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(red = 20, blue = 3, green = 100)),
            modifier = Modifier.height(50.dp), shape = RoundedCornerShape(10.dp)
        ) {
            Text("Créer un compte", fontWeight = FontWeight.Bold )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Loginpreview(){
    Surface(
        modifier = Modifier.fillMaxSize()) {
        Login()
    }
}
