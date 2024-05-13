package net.ezra.ui.Kisw

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImagePainter.State.Empty.painter
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.navigation.ROUTE_KISW
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun KiswScreen(navController: NavHostController) {



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

        Row (modifier = Modifier
            .fillMaxWidth()
        ){
            Button(onClick = { navController.navigate(ROUTE_SUBJECTS) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            } },colors= ButtonDefaults.buttonColors(Color.White)){Image(imageVector = Icons.Default.ArrowBack, contentDescription = null)}

            Spacer(modifier = Modifier.width(120.dp))

            Text(text = "KISWAHILI", modifier = Modifier.padding(top = 20.dp), fontWeight = FontWeight.Bold)


        }









        Spacer(modifier = Modifier.height(20. dp))

        Row {

            Text(text = "They are summarized on a playlist")}


        Spacer(modifier = Modifier.height(30.dp))

        val context= LocalContext.current
        Card(modifier = Modifier
            .fillMaxWidth()
            .clickable {  val url =
                "https://youtu.be/N1Z5FNQQYmE?si=6csZ2kd-Ap7AJclh" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent) }
            .height(100.dp)) {

            Box {

                Text(text = "Bembea Ya Maisha", fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp))
            }


        }
        Spacer(modifier = Modifier.height(30.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .clickable{ val url =
                "https://youtu.be/N48WKh-vymg?si=pSU5O98y-2-D8Ysh" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)}
            .height(100.dp)) {

            Box {

                Text(text = "Mapambazuko Ya Machweo", fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp))}


        }
        Spacer(modifier = Modifier.height(30.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .clickable{ val url =
                "https://youtu.be/dhQev9OEJyQ?si=GaRQSMOzV1velS2r" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)}
            .height(100.dp)) {

            Box {

                Text(text = "Nguu Za Jadi", fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp))}


        }



















    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    KiswScreen(rememberNavController())
}

