package net.ezra.ui.start


import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_BUSINESSS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS
import net.ezra.navigation.ROUTE_CHEM
import net.ezra.navigation.ROUTE_PHY
import net.ezra.navigation.ROUTE_KISW
import net.ezra.navigation.ROUTE_ENG
import net.ezra.navigation.ROUTE_MATH

import net.ezra.R
import net.ezra.navigation.ROUTE_AGRI
import net.ezra.navigation.ROUTE_BIO
import net.ezra.navigation.ROUTE_COMP
import net.ezra.navigation.ROUTE_F3B
import net.ezra.navigation.ROUTE_GEO
import net.ezra.navigation.ROUTE_HIST
import net.ezra.navigation.ROUTE_RE
import net.ezra.navigation.ROUTE_SPLASH

@Composable
fun StartScreen(navController: NavHostController) {

    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFDAF7A6))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            //Image(
            //  painter = painterResource(id = R.drawable.bk),
            // contentDescription = "Homepage Image",
//modifier = Modifier
            // .fillMaxWidth()
            //  .height(200.dp),
            // contentScale = ContentScale.Crop
            // )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Welcome to The App",

                color = Color.Black
            )
            Spacer(modifier = Modifier.height(20.dp))


            Spacer(modifier = Modifier.height(10.dp))



            Text(
                text = "To make learning easy and understandable.",
                fontWeight = FontWeight.Bold,

                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Use  buttons to navigate.",

                color = Color.Black
            )

            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_SPLASH) { inclusive = true }
                }  },
                colors = ButtonDefaults.buttonColors( Color.Blue),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Continue", color = Color.White)
            }
        }
    }


}



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    StartScreen(rememberNavController())
}

