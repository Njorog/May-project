package net.ezra.ui.f2h


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
fun F2HScreen(navController: NavHostController) {
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
                            navController.navigate(ROUTE_F3H) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                            Text(text = "Form3")
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

                    Text(text = "Form2 page")




                    Spacer(modifier = Modifier.height(30.dp))

                    val context= LocalContext.current
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable { val url = "https://youtu.be/2mdaBTa7IMg?si=0ght3pTt4kuLnmdL" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent) }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Trade", modifier = Modifier
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
                    .clickable { val url = "https://youtu.be/JczRPGXPBu0?si=PjnCqzBtbbuEUhR3" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Development of Transport", modifier = Modifier
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
                    .clickable { val url = "https://youtu.be/K2YSP_kaobg?si=W1v4rZPM_cvkJOsC" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Development of Communication ",
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
                    .clickable { val url = "https://youtu.be/_Fs6C3brkoA?si=kNF8qt790zkD0wvm" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Development of Industry", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/hluk_ahUwBw?si=X6PEMwlENal8NKhF" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Urbanization ", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }



                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/Gm8kLOo5af0?si=u2_L2HWezy7Q0UVy" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Organization of African Society",
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
                    .clickable { val url = "https://youtu.be/YXUmgOuyUjo?si=hKG4gqQQC94DhTq0" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Constitutions and Constitution Making", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }



                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/8_GLgqmpEtY?si=OvqrRis5Y6YsUu8z" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VIII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text ="Democracy and Human Rights", modifier = Modifier
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
    F2HScreen(rememberNavController())
}