package net.ezra.ui.f3h


import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_F2H
import net.ezra.navigation.ROUTE_F3H
import net.ezra.navigation.ROUTE_F4H
import net.ezra.navigation.ROUTE_HIST
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS
import net.ezra.ui.Agri.AgriScreen


@Composable
fun F3HScreen(navController: NavHostController) {

    Column {
        LazyColumn {
            item {
                Column(modifier = Modifier.fillMaxSize()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFF4CAF50))
                    ) {
                        Button(onClick = {
                            navController.navigate(ROUTE_SUBJECTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color.White)) {
                            Image(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                        }

                        Spacer(modifier = Modifier.width(120.dp))

                        Text(
                            text = "HISTORY",
                            modifier = Modifier.padding(top = 20.dp),
                            fontWeight = FontWeight.Bold
                        )


                    }
                    Spacer(modifier = Modifier.height(30.dp))

                    Row(modifier = Modifier.padding(10.dp)) {
                        Button(onClick = {
                            navController.navigate(ROUTE_HIST) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                            Text(text = "Form 1")

                        }
                        Spacer(modifier = Modifier.width(60.dp))

                        Button(onClick = {
                            navController.navigate(ROUTE_F2H) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                            Text(text = "Form2")
                        }
                        Spacer(modifier = Modifier.width(40.dp))
                        Button(onClick = {
                            navController.navigate(ROUTE_F4H) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                            Text(text = "Form4")
                        }


                    }
                    Spacer(modifier = Modifier.height(30.dp))

                    Text(text = "Form3 page")




                    Spacer(modifier = Modifier.height(30.dp))

                    val context= LocalContext.current
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable { val url = "https://youtu.be/f5tULwfd2Qo?si=tAfdqKsDrMBkwr1_" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent) }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "European Invasion and Colonization of Africa", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 0.dp)
                        )

                    }


                }
                Spacer(modifier = Modifier.height(30.dp))
                val context= LocalContext.current
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {  val url = "https://youtu.be/FpepX0x2-S0?si=awRXtHzwbkDgUznP" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Establishment of Colonial Rule in Kenya", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }

                Spacer(modifier = Modifier.height(20.dp))




                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/BXyqp3gRUqc?si=I77OlIOBwq5ZOsl9" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Colonial Administration ",
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {val url = "https://youtu.be/ZlRHrCjbgFE?si=SS1_qvz1H_lyjFjJ" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent ) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Socio-Economic Development in Colonial Kenya", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {val url = "https://youtu.be/HFIE9vFZUjA?si=Ul7oZ2LIImDNXDuQ" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent )}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Political Developments and Struggle For Independence in Kenya (1919-1963) ", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/IZsreYT3IlA?si=-8bNzjx36RXbABh" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent  )}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Rise of African Nationalism",
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/GVhD77emMlU?si=yteFhRYv_pZIB2S3" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent  )}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Lives and Contributions of Kenyan Leaders", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }



                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/87UN0cy74MQ?si=SUxbmQMy4Xt5QUKt" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VIII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "The Formation Structure And Functions of The Government of Kenya", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }





            }


        }
    }




}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    F3HScreen(rememberNavController())
}