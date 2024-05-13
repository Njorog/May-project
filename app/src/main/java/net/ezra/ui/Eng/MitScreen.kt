package net.ezra.ui.Eng

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import net.ezra.navigation.ROUTE_ENG
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun EngScreen(navController: NavHostController) {
LazyColumn {
    item {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color(0XFFFF5733)
                )

                .padding(10.dp)
                .padding(top = 0.dp), verticalArrangement = Arrangement.spacedBy(8.dp)
        )
        {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = {
                        navController.navigate(ROUTE_SUBJECTS) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    },
                    colors = ButtonDefaults.buttonColors(Color.White)
                ) { Image(imageVector = Icons.Default.ArrowBack, contentDescription = null) }

                Spacer(modifier = Modifier.width(120.dp))

                Text(
                    text = "ENGLISH",
                    modifier = Modifier.padding(top = 10.dp),
                    fontWeight = FontWeight.Bold
                )


            }









            Spacer(modifier = Modifier.height(20.dp))

            Row {

                Text(text = "They are summarized on a playlist")
            }


            Spacer(modifier = Modifier.height(30.dp))

            val context = LocalContext.current
            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    val url =
                        "https://youtu.be/kfe_ANMdGPk?si=A1jkNkgq6hD85c3O" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)
                }
                .height(100.dp)) {

                Box {

                    Text(
                        text = "The Samaritan",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                }


            }
            Spacer(modifier = Modifier.height(30.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    val url =
                        "https://youtu.be/wnO9JSBaFOs?si=s0Pf1SruA6o6b4hl" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)
                }
                .height(100.dp)) {

                Box {

                    Text(
                        text = "Fathers of Nations",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                }


            }
            Spacer(modifier = Modifier.height(30.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    val url =
                        "https://youtu.be/tFrUQ0PvoDU?si=NYCSdGBfNTtTOlKu" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)
                }
                .height(100.dp)) {

                Box {

                    Text(
                        text = "A Silent Song",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                }


            }
            Spacer(modifier = Modifier.height(30.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    val url =
                        "https://youtu.be/QCZr4fQ7hkg?si=UtKje9MJA-_MJH1V" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)
                }
                .height(100.dp)) {

                Box {

                    Text(
                        text = "An Artist of the Floating world",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                }


            }


            Spacer(modifier = Modifier.height(30.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    val url =
                        "https://youtu.be/hCfrjProZbM?si=_j7XRDApiBeJeWNZ" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)
                }
                .height(100.dp)) {

                Box {

                    Text(
                        text = "Parliament of owls",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                }


            }


        }
    }
}
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    EngScreen(rememberNavController())
}

