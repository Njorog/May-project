package net.ezra.ui.f4c


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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_CHEM
import net.ezra.navigation.ROUTE_F2C
import net.ezra.navigation.ROUTE_F3C
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun F4CScreen(navController: NavHostController) {
    LazyColumn {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(modifier = Modifier.fillMaxWidth()
                    .background(Color(0xFF4CAF50))) {
                    Button(onClick = {
                        navController.navigate(ROUTE_SUBJECTS) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color.White)) {
                        Image(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                    Spacer(modifier = Modifier.width(120.dp))

                    Text(text = "CHEM", modifier = Modifier.padding(top = 20.dp), fontWeight = FontWeight.Bold)


                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier.padding(10.dp)) {
                    Button(onClick = { navController.navigate(ROUTE_CHEM) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form 1")

                    }
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = { navController.navigate(ROUTE_F2C) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form2")
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(onClick = { navController.navigate(ROUTE_F3C) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form3")
                    }




                }
                Spacer(modifier = Modifier.height(30.dp))

                Text(text = "Form 4 page", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                val context= LocalContext.current
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url =
                        "https://youtu.be/ilVG0druLMo?si=bP77Zfk4nu4WJd2x" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Organic Chemistry II", modifier = Modifier
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
                .clickable {  val url =
                    "https://youtu.be/dEzW4AzAvaQ?si=mm3POyTireZIIenw" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Acids,Bases and Salts", modifier = Modifier
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
                .clickable { val url =
                    "https://youtu.be/C_N3V0N_jis?si=NPvbzmGohlDsYvNb" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)  }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Energy Changes in Chemical and Physical Process", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {  val url =
                    "https://youtu.be/xMLJBeqFKIw?si=bdUCODZ545BYr7on" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Reaction Rates and Reversible Reactions", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {  val url =
                    "https://youtu.be/sRnKXsKhD4s?si=xfGbZI3k7-rFfgvp" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Electrochemistry", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {  val url =
                    "https://youtu.be/7Vg7PIj5aTI?si=sMsOL3BjzDZ2VnXy" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Metals:Extraction Properties and Uses", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {  val url =
                    "https://youtu.be/a6y8YR7-6iI?si=CZB7Y08G1jUdfWv7" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Radioactivity", modifier = Modifier
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
    F4CScreen(rememberNavController())
}