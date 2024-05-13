package net.ezra.ui.home
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import net.ezra.navigation.ROUTE_BUSINESSS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SUBJECTS
import net.ezra.navigation.ROUTE_CHEM
import net.ezra.navigation.ROUTE_PHY
import net.ezra.navigation.ROUTE_KISW
import net.ezra.navigation.ROUTE_ENG
import net.ezra.navigation.ROUTE_MATH

import net.ezra.R
import net.ezra.navigation.ROUTE_AGRI
import net.ezra.navigation.ROUTE_BIO
import net.ezra.navigation.ROUTE_COMP
import net.ezra.navigation.ROUTE_F3B
import net.ezra.navigation.ROUTE_GEO
import net.ezra.navigation.ROUTE_HIST
import net.ezra.navigation.ROUTE_RE
import net.ezra.ui.RE.CREScreen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    val imageResourceIds = listOf(
        R.drawable.p1a,
        R.drawable.p2,
        R.drawable.mtv2,
        R.drawable.jik,

    )
    val pagerState = rememberPagerState(pageCount = {imageResourceIds.size})
    LaunchedEffect(Unit) {
while (true){
    delay(3000)
      val nextPage=(pagerState.currentPage +1)% pagerState.pageCount
pagerState.scrollToPage(nextPage)}
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.wrapContentSize()) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .wrapContentSize()

            ) { currentPage ->
                Card(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(26.dp),

                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = imageResourceIds[currentPage]),
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(70.dp))












    }


Column {
Spacer(modifier = Modifier.height(500.dp))

    Row {


        Card(modifier = Modifier
            .clickable {
                navController.navigate(ROUTE_SUBJECTS) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }
            }
            .padding(40.dp)
            .padding(top = 10.dp)
            .width(100.dp)
            .height(100.dp)) {
            Box {
                Image(painter = painterResource(id = R.drawable.subj), contentDescription =null, modifier = Modifier.padding(10.dp) )
                Text(text = "Subjects", modifier = Modifier
                    .padding(top = 60.dp)
                    .padding(10.dp))

            }


        }

        Spacer(modifier = Modifier.width(10.dp))
        val context= LocalContext.current
        Card(modifier = Modifier
            .clickable {val url =
                "https://teacher.co.ke/lesson-notes/" // Replace "https://example.com" with the URL of the website you want to go to
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                context.startActivity(intent) }
            .padding(50.dp)
            .padding(top = 0.dp)
            .height(100.dp)
            .width(100.dp)

            .height(90.dp)) {
            Box {
                Image(painter = painterResource(id = R.drawable.nt), contentDescription =null,  modifier = Modifier.padding(10.dp))

                Text(text = " Notes", modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(10.dp))
            }


        }





    }

}






}







@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}