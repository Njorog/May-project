package net.ezra.ui.f3a


import android.content.Intent
import android.content.res.Configuration
import android.net.Uri

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import net.ezra.navigation.ROUTE_AGRI
import net.ezra.navigation.ROUTE_F2A
import net.ezra.navigation.ROUTE_F3A
import net.ezra.navigation.ROUTE_F4A
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun F3AScreen(navController: NavHostController) {


    LazyColumn {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(modifier = Modifier.fillMaxWidth()
                    .background(Color(0xFF4CAF50))) {
                    Button(onClick = {    navController.navigate(ROUTE_SUBJECTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } }, colors = ButtonDefaults.buttonColors(Color.White)) {



                        Image(imageVector = Icons.Default.ArrowBack, contentDescription = null)}
                    Spacer(modifier = Modifier.width(120.dp))

                    Text(text = "AGRICULTURE", modifier = Modifier.padding(top = 20.dp), fontWeight = FontWeight.Bold)


                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier.padding(10.dp)) {
                    Button(onClick = {
                        navController.navigate(ROUTE_AGRI) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form 1")

                    }
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = {
                        navController.navigate(ROUTE_F2A) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form2")
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(onClick = {
                        navController.navigate(ROUTE_F4A) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form4")
                    }


                }
                Spacer(modifier = Modifier.height(30.dp))


                Text(text = "form3 page")
                Spacer(modifier = Modifier.height(10.dp))
                val context= LocalContext.current
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {val url = "https://youtu.be/M_8vycxeBXQ?si=iEOfphAhI4VOCEyk" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Livestock Production III (Selecting and Breeding)", modifier = Modifier
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
                .clickable { val url = "https://youtu.be/V6DWD9wb7Mc?si=xi356dhlHkJb9QY2" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Livestock Production IV (Livestock Rearing)", modifier = Modifier
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
                .clickable { val url = "https://youtu.be/gvmu0sThnjg?si=8V3K95Zv-MURydEr" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Farm Structures", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/5HHIiCz13Uo?si=TcVxaGv-ibLlJXdU" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Agricultural Economics II (Land Tenure and Land Reform)", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/3SU_HS4zRH4?si=-h7CzPIEbCGrq1O1" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Soil and Water Conservation ", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }



            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/dYAxt0xm0qI?si=dnAWLEAitEibU2-m" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Weeds and Weed Control", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/L3sbY_0boL8?si=VQE9Lth8u_N8R50U" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Crops Pests and Diseases", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }



            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {  val url = "https://youtu.be/6xQLt_dZcZ0?si=TnZD2cC9KoJIjr29" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)}
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VIII)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Crop Productivity VI (Field Practices II)", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }



            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/jWewi8IUfvI?si=T4IsqBmGH8ecAcLc" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(IX)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Livestock Health III (Diseases)", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }
















        }
    }
}





@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    F3AScreen(rememberNavController())
}