package net.ezra.ui.f3m


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
import net.ezra.navigation.ROUTE_F2M
import net.ezra.navigation.ROUTE_F4M
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MATH
import net.ezra.navigation.ROUTE_SUBJECTS


@Composable
fun F3Screen(navController: NavHostController) {
    LazyColumn {
        item {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(modifier= Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF4CAF50)) ){
                    Button(onClick = {
                        navController.navigate(ROUTE_SUBJECTS) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color.White)) {
                        Image(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }

                    Spacer(modifier = Modifier.width(120.dp))

                    Text(text = "Math", modifier = Modifier.padding(top = 20.dp), fontWeight = FontWeight.Bold)

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
                    navController.navigate(ROUTE_F2M) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                }, colors = ButtonDefaults.buttonColors(Color(0xffCABCBC))) {
                    Text(text = "Form2")
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
                Text(text = "form3 page")
                Spacer(modifier = Modifier.height(10.dp))
                val context = LocalContext.current
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp)
                        .background(Color(0XFFADD8E6))
                        .height(40.dp)
                        .clickable {
                            val url =
                                "https://youtu.be/jsmq1Ur9Szs?si=7ozzEQhe-TBpo347" // Replace "https://example.com" with the URL of the website you want to go to
                            val intent = Intent(Intent.ACTION_VIEW)
                            intent.data = Uri.parse(url)
                            context.startActivity(intent)
                        }
                        .clip(RoundedCornerShape(8.dp))
                ) {
                    Text(text = "(I)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Quadratic Expressions and Equations", modifier = Modifier
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
                    "https://youtu.be/UTdYgS40veQ?si=QcbrEcq-JJENFGlw" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)
            }
            .clip(RoundedCornerShape(8.dp))) {
            Text(text = "(II)", modifier = Modifier.padding(top = 10.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Approximations and Errors", modifier = Modifier
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
                    "https://youtu.be/4CHY1v6OPjo?si=HL5KTfZVB92xx0z_" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)
            }
            .clip(RoundedCornerShape(8.dp))) {
            Text(text = "(III)", modifier = Modifier.padding(top = 10.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Trigonometry II", modifier = Modifier
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
                    "https://youtu.be/4KpIn4dlvrI?si=T89hlIBxN1oJYTiG" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)
            }
            .clip(RoundedCornerShape(8.dp))) {
            Text(text = "(IV)", modifier = Modifier.padding(top = 10.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Surds", modifier = Modifier
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
                    "https://youtu.be/bTvMx9I62d8?si=Km-qWD2bIS8b5GRF" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)
            }
            .clip(RoundedCornerShape(8.dp))) {
            Text(text = "(V)", modifier = Modifier.padding(top = 10.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Further Logarithms", modifier = Modifier
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
                    "https://youtu.be/GuPnPd0vWHk?si=dlfcRb_XNJRNcgXf" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)
            }
            .clip(RoundedCornerShape(8.dp))) {
            Text(text = "(VI)", modifier = Modifier.padding(top = 10.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Commercial Arithmetic II", modifier = Modifier
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
                    "https://youtu.be/GuPnPd0vWHk?si=dlfcRb_XNJRNcgXf" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)
            }
            .clip(RoundedCornerShape(8.dp))) {
            Text(text = "(VII)", modifier = Modifier.padding(top = 10.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Circles,Chords and Tangents", modifier = Modifier
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
                    "https://youtu.be/yIm2qwBhNUI?si=oaD6tPDZ8fCAo8KJ" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent)
            }
            .clip(RoundedCornerShape(8.dp))) {
            Text(text = "(VIII)", modifier = Modifier.padding(top = 10.dp))
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Matrices", modifier = Modifier
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
                            "https://youtu.be/XAff5Rmjgd4?si=cjA3H1mueygTWmxo" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(IX)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Matrices", modifier = Modifier
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
                            "https://youtu.be/XlFy2WXKXNc?si=xMzWnxG4kynaHFZH" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(X)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Formulae and Variation", modifier = Modifier
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
                            "https://youtu.be/A0sMK00yzNE?si=nvw0HdV8N-Ei402k" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(XI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Sequences and Series", modifier = Modifier
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
                            "https://youtu.be/SoElgEs2OrI?si=3u3VO8fRy94xmf-b" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(XII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Expansion", modifier = Modifier
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
                            "https://youtu.be/7Orr1I9V-QA?si=pxaRuDRlhv7hxj08" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(XIII)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Compound Proportions and Rates of work", modifier = Modifier
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
                            "https://youtu.be/6Mon_JyF8rQ?si=cwjq81YDAko3uUcZ" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "XIV)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Graphical Methods", modifier = Modifier
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
                            "https://youtu.be/70mU7248cs8?si=CRXoFcqi4rrnpaQx" // Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(XV)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Probability", modifier = Modifier
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
                            "https://youtu.be/Rai8tq08DcE?si=UqsPuywv55QIkiNM"// Replace "https://example.com" with the URL of the website you want to go to
                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        context.startActivity(intent)
                    }
                    .clip(RoundedCornerShape(8.dp))) {
                    Text(text = "(XVI)", modifier = Modifier.padding(top = 10.dp))
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Vectors II", modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(vertical = 7.dp)
                    )

                }






    }
    }


        }
    }





@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    F3Screen(rememberNavController())
}