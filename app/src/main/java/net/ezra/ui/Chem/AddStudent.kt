package net.ezra.ui.Chem

import android.content.Intent
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
import net.ezra.navigation.ROUTE_F2C
import net.ezra.navigation.ROUTE_F3C
import net.ezra.navigation.ROUTE_F4C
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS

@Composable
fun ChemScreen(navController: NavHostController) {
    LazyColumn {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                Row (modifier=Modifier.background(Color(0xFF4CAF50))
                    .fillMaxWidth()){

                    Button(onClick = { navController.navigate(ROUTE_SUBJECTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors=ButtonDefaults.buttonColors(Color.White)){ Image(imageVector = Icons.Default.ArrowBack, contentDescription = null)}

                    Spacer(modifier = Modifier.width(120.dp))

                    Text(text = "CHEM", modifier = Modifier.padding(top = 20.dp), fontWeight = FontWeight.Bold)


                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier.padding(10.dp)) {
                    Button(onClick = { navController.navigate(ROUTE_F2C) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form 2")

                    }
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = { navController.navigate(ROUTE_F3C) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form3")
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(onClick = { navController.navigate(ROUTE_F4C
                    ) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form4")
                    }




                }

                Spacer(modifier = Modifier.height(10.dp))
                val context= LocalContext.current
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {   val url =
                        "https://youtu.be/EIXGD1d752Y?si=RjEbnt3gPjsUNrq4" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)}
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Introduction to Chem", modifier = Modifier
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
                    "https://youtu.be/ti_6J8-_UeQ?si=3K4Bt4n-yBrtbtPR" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Simple Classification Substances", modifier = Modifier
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
                .clickable {  val url =
                    "https://youtu.be/jkP1iMSkj7Q?si=JAdizObUHavORBTB" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Acids,Bases and Indicators", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {   val url =
                    "https://youtu.be/2ajsAlvq5-8?si=3jTDFEphKLGUI3js" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)}
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Air Oxygen and Combustion", modifier = Modifier
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
                    "https://youtu.be/HJi0Qph7Rtw?si=vatPyTFJoLtbr97Y" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Chemical Properties of Oxygen", modifier = Modifier
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
                    "https://youtu.be/2ajsAlvq5-8?si=tlrG-HbjbA9KUAzC" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Water and Hydrogen", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }












            }
        }


    }



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ChemScreen(rememberNavController())
}






