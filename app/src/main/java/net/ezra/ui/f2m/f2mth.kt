package net.ezra.ui.f2m


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
import net.ezra.navigation.ROUTE_F3M
import net.ezra.navigation.ROUTE_F4M
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MATH
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun F2Screen(navController: NavHostController) {
    LazyColumn {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier.fillMaxWidth()
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
                        text = "Math",
                        modifier = Modifier.padding(top = 20.dp),
                        fontWeight = FontWeight.Bold
                    )


                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier.padding(10.dp)) {
                    Button(onClick = {
                        navController.navigate(ROUTE_MATH) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form 1")

                    }
                    Spacer(modifier = Modifier.width(60.dp))

                    Button(onClick = {
                        navController.navigate(ROUTE_F3M) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form3")
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(onClick = {
                        navController.navigate(ROUTE_F4M) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                        Text(text = "Form4")
                    }


                }
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = "Form 2 page")
                val context = LocalContext.current
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/GedbSagIN0M?si=U-ERGhXkCnHJvuO8" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Cubes and cube roots", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 0.dp)
                    )

                }



                Spacer(modifier = Modifier.height(30.dp))

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/aGcknkygK4Q?si=8GmUXujTWHKQfe0f" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Reciprocals", modifier = Modifier
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
                    .clickable {
                        val url =
                            "https://youtu.be/y4L3OiaarYI?si=muMlFwycazON4rZf" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Indices and Logarithms", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/9vvn-SU_ap0?si=yPCrPH87cTZ99PKM" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Gradient and Equations of Straight Lines", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/PSdefpWnPBk?si=8kbSD0KAmbEq7S2N" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Reflection and Congruence", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }



                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/orMcWgAm5jw?si=Xxu2lDQSyfI8qQmv" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Rotation", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/Ve7gbZAFZcA?si=VCilfiUzGbpPYW38" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Similarity and Enlargement", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }



                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/hIAR0J0_Xz0?si=5_j3v0ynKfOQtIgo" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(VIII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = " The Pythagoras theorem", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }



                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/H6wXbEQLXXE?si=TvZXxjfiZcJGh4nD" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IX)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Trigonometry Ratios", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }


                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/JdUAIXItOmk?si=k_83p7VWzJ9SIl6-" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(X)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Area of a Triangle", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .background(Color(0XFFADD8E6))
                    .height(40.dp)
                    .clickable {
                        val url =
                            "https://youtu.be/l245kRD1V6k?si=tdaB760reWxF0NHz" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(XI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Area of a Quadrilaterals and Other Polygons", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )




                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/r5Pxjp-uZfA?si=W3PcfisooK-vSNZ_" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XII)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Area of Part of a Circle", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }


                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/m8hR2t9bOYA?si=LeKz5KwgDyw90C3U" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XIII)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Surface Area of Solids ", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }




                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/0JsV3hXU9Xk?si=fmHgXyA0YkLp_-zY" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XIV)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Volume of Solids", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }



                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/g4Ct-nCyMBk?si=yqh_jpaxlJEvmNrB" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XV)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = " Quadratic Equations and Expressions", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }



                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/tncnBYtSwTc?si=HIfhqyz6c2uVhLHT" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XVI)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Linear Inequalities", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/XDdPLJ4xh7E?si=n3s7J3-DgEuuKIt6" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XVII)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Linear Motion", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/NZvc_XL0uZI?si=-6Zmu5HHBuYZUQWw" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XVIII)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Statistics", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }


                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/EIRVznXqjHE?si=gH9BnDbTF9tiYdD-" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XIX)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Angle Properties of a Circle", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }



                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/Vja1sAybvw4?si=REatxNsRiO4C_CSu" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))) {
                        Text(text = "(XX)", modifier = Modifier.padding(top = 10.dp))
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            text = "Vectors I", modifier = Modifier
                                .padding(top = 10.dp)
                                .padding(vertical = 7.dp)
                        )

                    }


                }
            }


        }
    }
}



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    F2Screen(rememberNavController())
}