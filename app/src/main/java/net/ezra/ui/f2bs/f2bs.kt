package net.ezra.ui.f2bs

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
import net.ezra.navigation.ROUTE_BUSINESSS
import net.ezra.navigation.ROUTE_F3BS
import net.ezra.navigation.ROUTE_F4BS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun F2BSScreen(navController: NavHostController) {




    LazyColumn {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                Row (modifier = Modifier.fillMaxWidth()
                    .background(Color(0xFF4CAF50))){

                    Button(onClick = { navController.navigate(ROUTE_SUBJECTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors= ButtonDefaults.buttonColors(Color.White)){ Image(imageVector = Icons.Default.ArrowBack, contentDescription = null) }

                    Spacer(modifier = Modifier.width(120.dp))

                    Text(text = "BUSINESS", modifier = Modifier.padding(top = 20.dp), fontWeight = FontWeight.Bold)


                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier.padding(10.dp)) {
                    Button(onClick = { navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form 1")

                    }
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = { navController.navigate(ROUTE_F3BS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form3")
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(onClick = { navController.navigate(ROUTE_F4BS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form4")
                    }




                }
                Spacer(modifier = Modifier.height(30.dp))

                Text(text = "form2 page")
                Spacer(modifier = Modifier.height(10.dp))
                val context= LocalContext.current
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {val url = "https://youtu.be/UCxYocVXxLA?si=cxXvc_aHvDTQACbA" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent) }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Forms of Business Units", modifier = Modifier
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
                .clickable { val url = "https://youtu.be/BTw_wC0_tOM?si=YR5mSBBIxbYqHGJD" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Government And Business", modifier = Modifier
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
                .clickable {  val url = "https://youtu.be/61S4wxNO9Ew?si=AOEPIBzEYoThDDAq" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent)}
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Transport", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/61S4wxNO9Ew?si=AOEPIBzEYoThDDAq" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Communication", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/cHaqgZpF4y4?si=weLpzu2r3n7tG1ZJ" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Warehousing", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }



            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable {val url = "https://youtu.be/y_dFi8zmU_U?si=W6hNahhSTT00rraa" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Insurance", modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(vertical = 7.dp)
                )

            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
                .background(Color(0XFFADD8E6))
                .height(40.dp)
                .clickable { val url = "https://youtu.be/ExOzt9EdU9g?si=K_ngR5y-v9ErZ5dr" // Replace "https://example.com" with the URL of the website you want to go to
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(url)
                    context.startActivity(intent) }
                .clip(RoundedCornerShape(8.dp))) {
                Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Production Promotion", modifier = Modifier
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
    F2BSScreen(rememberNavController())
}
