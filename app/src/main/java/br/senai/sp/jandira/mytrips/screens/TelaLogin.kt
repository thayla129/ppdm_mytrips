package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TelaLogin(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Card superior direito
        Box(
            modifier = Modifier
                .size(100.dp, 50.dp)
                .align(Alignment.TopEnd)
                .background(Color(0xFF9C27B0), shape = RoundedCornerShape(bottomStart = 20.dp))
        )

        // Card inferior esquerdo
        Box(
            modifier = Modifier
                .size(120.dp, 60.dp)
                .align(Alignment.BottomStart)
                .background(Color(0xFF9C27B0), shape = RoundedCornerShape(topEnd = 20.dp))
        )

        Column(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .align(Alignment.Center)
                .padding(24.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Login",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF9C27B0)
            )
            Text(
                text = "Please sign in to continue.",
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 4.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                label = { Text(text = "E-mail") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email icon",
                        tint = Color(0xFF9C27B0)
                    )
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Password icon",
                        tint = Color(0xFF9C27B0)
                    )
                }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier.width(120.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9C27B0))
                ) {
                    Text(text = "SIGN IN", color = Color.White, fontSize = 16.sp)
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(text = "Don’t have an account? ", color = Color.Gray)
                Text(text = "Sign up", color = Color(0xFF9C27B0), fontWeight = FontWeight.Bold)
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaInicialPreview() {
    TelaLogin()
}


