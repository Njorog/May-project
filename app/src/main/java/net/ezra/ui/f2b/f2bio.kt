package net.ezra.ui.f2b



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
import net.ezra.navigation.ROUTE_BIO
import net.ezra.navigation.ROUTE_F3B
import net.ezra.navigation.ROUTE_F4B
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun F2BScreen(navController: NavHostController) {




    LazyColumn {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                Row (modifier = Modifier.fillMaxWidth()
                    .background(Color(0xFF4CAF50))){

                    Button(onClick = { navController.navigate(ROUTE_SUBJECTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors=ButtonDefaults.buttonColors(Color.White)){Image(imageVector = Icons.Default.ArrowBack, contentDescription = null)}

                    Spacer(modifier = Modifier.width(120.dp))

                    Text(text = "BIO", modifier = Modifier.padding(top = 20.dp), fontWeight = FontWeight.Bold)


                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier.padding(10.dp)) {
                    Button(onClick = { navController.navigate(ROUTE_BIO) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form 1")

                    }
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = { navController.navigate(ROUTE_F3B) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form3")
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(onClick = { navController.navigate(ROUTE_F4B) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form4")
                    }




                }
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = "Form2 page")


                Spacer(modifier = Modifier.height(10.dp))

                val context=LocalContext.current
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable { val url = "https://youtu.be/S9bXZ5vU5Gw?si=Axm1Numy592dJqWz" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {

                    Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Transportation in plants", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 0.dp)
                    )

                }


            }
            Spacer(modifier = Modifier.height(30.dp))
            val context=LocalContext.current
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {  val url = "https://youtu.be/nL6ydoxRi5s?si=kPrZU9OGaLLyZOjf" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Transportation in Animals", modifier = Modifier
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
                .clickable {   val url = "https://youtu.be/SYMy78yFfUE?si=f7aQeWXXt71dLWV-" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Respiration", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/aU5_ogRtNRM?si=D76D65w-HXx5jbe1" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Gaseous Exchange in Plants", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {  val url = "https://youtu.be/hvabmIjOTZg?si=HBvSlB_FQkso0jub" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Gaseous Exhange in Animals", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }



            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {  val url = "https://youtu.be/a5Zj-TY1OlM?si=Wzs3Sp1CsTA7rXNQ" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Excretion  and Homeostasis", modifier = Modifier
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
    F2BScreen(rememberNavController())
}