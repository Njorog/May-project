package net.ezra.ui.Subjects

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_AGRI
import net.ezra.navigation.ROUTE_BIO
import net.ezra.navigation.ROUTE_BUSINESSS
import net.ezra.navigation.ROUTE_CHEM
import net.ezra.navigation.ROUTE_COMP
import net.ezra.navigation.ROUTE_RE
import net.ezra.navigation.ROUTE_ENG
import net.ezra.navigation.ROUTE_GEO
import net.ezra.navigation.ROUTE_HIST
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_KISW
import net.ezra.navigation.ROUTE_MATH
import net.ezra.navigation.ROUTE_PHY
import net.ezra.navigation.ROUTE_RE

import net.ezra.navigation.ROUTE_SUBJECTS

@Composable
fun SubjectScreen(navController: NavHostController) {
    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()


            ) {

                Row(
                    modifier = Modifier
                        .background(Color(0xFFCCCCFF))
                        .fillMaxWidth()
                ) {

                    Button(
                        onClick = {
                            navController.navigate(ROUTE_HOME) {
                                popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) { Image(imageVector = Icons.Default.ArrowBack, contentDescription = null) }

                    Spacer(modifier = Modifier.width(100.dp))

                    Text(
                        text = "SUBJECTS",
                        modifier = Modifier.padding(top = 30.dp),
                        fontWeight = FontWeight.Bold
                    )


                }
                Spacer(modifier = Modifier.height(30.dp))

                Row {
                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)
                                .clickable { }

                        ) {
                            Box {
                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.mth),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Maths",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(20.dp)
                        )
                        Button(onClick = {
                            navController.navigate(ROUTE_MATH) {
                                popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                            Text(text = "view")

                        }


                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)
                                .clickable { }

                        ) {
                            Box {
                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.eng),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "English",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(20.dp)
                        )
                        Button(onClick = {
                            navController.navigate(ROUTE_ENG) {
                                popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                            Text(text = "view")

                        }


                    }


                }


                Row {


                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)
                                .clickable { }

                        ) {
                            Box {
                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.kisw),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Kiswahili",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(20.dp)
                        )
                        Button(onClick = {
                            navController.navigate(ROUTE_KISW) {
                                popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                            Text(text = "view")

                        }


                    }


                    Spacer(modifier = Modifier.width(20.dp))

                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)
                                .clickable { }

                        ) {
                            Box {


                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.chem),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Chem",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(20.dp)
                        )
                        Button(onClick = {
                            navController.navigate(ROUTE_CHEM) {
                                popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                            Text(text = "view")

                        }


                    }
                }




                Row {


                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)
                                .clickable { }

                        ) {
                            Box {


                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.phy),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Physics",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(20.dp)
                        )
                        Button(onClick = {
                            navController.navigate(ROUTE_PHY) {
                                popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                            Text(text = "view")

                        }


                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)
                                .clickable { }

                        ) {
                            Box {
                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.bio),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }

                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Biology",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(20.dp)
                        )
                        Button(onClick = {
                            navController.navigate(ROUTE_BIO) {
                                popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                            }
                        }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                            Text(text = "view")

                        }


                    }


                }

                Row {


                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)

                        ) {

                            Box {


                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.hist),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "History",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_HIST) {
                            popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                        Text(text = "view")

                    }}



                    Spacer(modifier = Modifier.width(20.dp))

                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)

                        ) {
                            Box {


                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.geo),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }


                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Geo",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_GEO) {
                            popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                        Text(text = "view")

                    }
                }}




                Row {


                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)

                        ) {

                            Box {


                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.relig),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "C.R.E",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_RE) {
                            popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                        Text(text = "view")

                    }}



                    Spacer(modifier = Modifier.width(20.dp))

                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)

                        ) {

                            Box {


                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.agri),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Agriculture",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_AGRI) {
                            popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                        Text(text = "view")

                    }
                }}







                Row {
                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)

                        ) {

                            Box {


                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.comps),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Computer",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_COMP) {
                            popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                        Text(text = "view")

                    }}



                    Spacer(modifier = Modifier.width(20.dp))

                    Card(modifier = Modifier.padding(30.dp)) {
                        Card(
                            modifier = Modifier
                                .padding(20.dp)

                        ) {

                            Box {


                                Image(
                                    painter = painterResource(id = net.ezra.R.drawable.bst),
                                    contentDescription = null,
                                    modifier = Modifier.padding(top = 20.dp)
                                )
                            }
                        }

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "B/st",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(20.dp)
                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_BUSINESSS) {
                            popUpTo(ROUTE_SUBJECTS) { inclusive = true }
                        }
                    }, colors = ButtonDefaults.buttonColors(Color(0xff0ac4c6)), modifier = Modifier.padding(15.dp)) {
                        Text(text = "view")

                    }}


                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    SubjectScreen(rememberNavController())
}
