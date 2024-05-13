package net.ezra.ui.f3g


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
import net.ezra.navigation.ROUTE_F3H
import net.ezra.navigation.ROUTE_F4G
import net.ezra.navigation.ROUTE_F4H
import net.ezra.navigation.ROUTE_GEO
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_GEO
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun F3GScreen(navController: NavHostController) {
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
                        navController.navigate(ROUTE_F4G) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form4")
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
                        .clickable { val url =
                            "https://youtu.be/YTucv9kODb0?si=Oe5axd13TWeJK5wG" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent) }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Statistics", modifier = Modifier
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
                        "https://youtu.be/Q7zQLjPCmVE?si=V3B4mt_u8MApTP1w" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Map Work", modifier = Modifier
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
                        "https://youtu.be/VAY6TqlogRo?si=CgvKVHsQzwcgvmF8" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "External Land Forming Process", modifier = Modifier
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
                        "https://youtu.be/CungMslG6Mg?si=e2L660kW14yWs4fj" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Hydrological/ Water Cycle", modifier = Modifier
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
                        "https://youtu.be/Tyu7zO-UjPo?si=PxCKxP3OHYv6kdZ7" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Lakes", modifier = Modifier
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
                        "https://youtu.be/gp8Ch3HKkwQ?si=HPlQLaQqgER1jf1I" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Oceans,Seas and Their Coasts", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {val url =
                        "https://youtu.be/xrsuwPybmT4?si=-64D8fekAls30oxa" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Glaciation", modifier = Modifier
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
                        "https://youtu.be/P-9EEJovFlM?si=oAugO7B1EG2QCmWM" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IX)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Soil", modifier = Modifier
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
                        "https://youtu.be/Ni4qSKIKjrU?si=NU1xKrW9pFH8MG4X" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(X)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Agriculture", modifier = Modifier
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
    F3GScreen(rememberNavController())
}
