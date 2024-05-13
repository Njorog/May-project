package net.ezra.ui.RE


import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
import net.ezra.navigation.ROUTE_KISW
import net.ezra.navigation.ROUTE_RE
import net.ezra.navigation.ROUTE_SUBJECTS

@Composable
fun CREScreen(navController: NavHostController) {



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

                Text(text = "C.R.E", modifier = Modifier.padding(top = 10.dp), fontWeight = FontWeight.Bold)


            }









            Spacer(modifier = Modifier.height(20. dp))
            Row {


            Text(text = "Due to the many topics of the Subjects ",modifier=Modifier.size(0.dp))}

            Row {

            Text(text = "They are summarized on a playlist")}


            Spacer(modifier = Modifier.height(30.dp))

            val context= LocalContext.current
            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable {  val url =
                    "https://youtu.be/2QbTnKFT-3A?si=fSzizi7ouifdhQ24" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .height(100.dp)) {

                Box {

                    Text(text = "FORM1", fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp))
                }


            }
            Spacer(modifier = Modifier.height(30.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable{ val url =
                    "https://youtu.be/KHNKHl1hlQE?si=1pwgk6bFLEMioHIf" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)}
                .height(100.dp)) {

                Box {

                Text(text = "FORM2", fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp))}


            }
            Spacer(modifier = Modifier.height(30.dp))

            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable{ val url =
                    "https://youtu.be/7EFlqEnR8ZM?si=MLHEySiABQQoSZ0y" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)}
                .height(100.dp)) {

                Box {

                Text(text = "FORM3", fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp))}


            }
            Spacer(modifier = Modifier.height(30.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable {   val url =
                    "https://youtu.be/jRTPRPL3c6M?si=5LKVwlh8k8j33v_-" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)}
                .height(100.dp)) {

                Box {

                    Text(text = "FORM4", fontWeight = FontWeight.Bold, modifier = Modifier.padding(20.dp))}


            }







        }


}






@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    CREScreen(rememberNavController())
}