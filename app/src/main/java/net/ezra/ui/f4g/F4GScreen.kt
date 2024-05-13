package net.ezra.ui.f4g


import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.widget.VideoView
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_F2G
import net.ezra.navigation.ROUTE_F3G
import net.ezra.navigation.ROUTE_F3H
import net.ezra.navigation.ROUTE_F4G
import net.ezra.navigation.ROUTE_F4H
import net.ezra.navigation.ROUTE_GEO
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_GEO
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun F4GScreen(navController: NavHostController) {
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
                        text = "GEOGRAPHY",
                        modifier = Modifier.padding(top = 20.dp),
                        fontWeight = FontWeight.Bold
                    )


                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier.padding(10.dp)) {
                    Button(onClick = {
                        navController.navigate(ROUTE_GEO) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form 1")

                    }
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = {
                        navController.navigate(ROUTE_F2G) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form 2")
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(onClick = {
                        navController.navigate(ROUTE_F3G) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form3")
                    }}


                    Spacer(modifier = Modifier.height(30.dp))

                    Text(text = "Form4 page")
                    Spacer(modifier = Modifier.height(10.dp))


                    val context= LocalContext.current
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {  val url =
                            "https://youtu.be/IDA8CNxzPJ8?si=ljw6Ixp-Y7CZIafz" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)}
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Land Reclamation", modifier = Modifier
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
                    .clickable { val url =
                        "https://youtu.be/-V1zyl3iFGI?si=V08T4WTpsZuzp2qv" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Fishing", modifier = Modifier
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
                        "https://youtu.be/bwOQV-mePY8?si=scdo3lqVE8TJPMb2" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Wildlife and Tourism", modifier = Modifier
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
                        "https://youtu.be/_QHthrAdAgc?si=KUBD_i655x-Po2iy" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Energy", modifier = Modifier
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
                        "https://youtu.be/pHdSnSWOx38?si=qfby6LgXGqu3uy8e" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Industry", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url =
                        "https://youtu.be/ukyWjt-gIRA?si=DtzFuevpzfW4IqLi" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Transport and Communication", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url =
                        "https://youtu.be/SlwCSe53KsA?si=FDgcGMVYFVPi_U1L" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Trade", modifier = Modifier
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
                        "https://youtu.be/jiNZXNZXpxM?si=4T3xAOBKYK2zekfg" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VIII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Population", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url =
                        "https://youtu.be/cgKTGC-iuoI?si=R2MYYemq94ODSKdm"// Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IX)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Urbanisation", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url =
                        "https://youtu.be/-G6HYTpE0g4?si=AHusV6Z_O0W_r-T3" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(X)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Management and Conservation of Environment", modifier = Modifier
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
    F4GScreen(rememberNavController())
}
