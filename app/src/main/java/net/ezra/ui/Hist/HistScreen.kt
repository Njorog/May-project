package net.ezra.ui.Hist




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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_F2A
import net.ezra.navigation.ROUTE_F2H
import net.ezra.navigation.ROUTE_F3A
import net.ezra.navigation.ROUTE_F3H
import net.ezra.navigation.ROUTE_F4A
import net.ezra.navigation.ROUTE_F4H
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun HistScreen(navController: NavHostController) {

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
                            navController.navigate(ROUTE_F2H) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                            Text(text = "Form 2")

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






                    Spacer(modifier = Modifier.height(30.dp))

                    val context= LocalContext.current
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable { val url = "https://youtu.be/4igpxri5ZYg?si=UD7vaa3As0jotwTF" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent) }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Introduction To History and History", modifier = Modifier
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
                    .clickable { val url = "https://youtu.be/kxfcJ2zdaBY?si=olytP3NyVHIR1n5w" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Early Man", modifier = Modifier
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
                    .clickable {  val url = "https://youtu.be/uDHIRdgB5MM?si=UsQYSdo2bkpvwCEM" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Development of Agriculture and Animal Domestication",
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
                    .clickable {val url = "https://youtu.be/YapoWNOAlsQ?si=fXJRBKgRRkOzcK-O" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Agrarian Revolution", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/2F2z__7uDi4?si=whmBMw06nfQ2FP5N" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "The Peoples of Kenya upto the 19TH Century ", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }



                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/11XYYz2Gubo?si=tPls9dolM95u-IhU" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Contacts Between The East African Coast and The Outside World",
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
                    .clickable { val url = "" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Citizenship", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }



                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/Kkp30adl3W4?si=fJed5qEhT485kuRj" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VIII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "National Integration", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


            }


                                    }
                                }




                }

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HistScreen(rememberNavController())
}