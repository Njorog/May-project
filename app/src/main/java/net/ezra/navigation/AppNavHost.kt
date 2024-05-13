package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.Agri.AgriScreen
import net.ezra.ui.Bio.BioScreen
import net.ezra.ui.SplashScreen
import net.ezra.ui.Math.MathScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.Businesss.BusinesssScreen
import net.ezra.ui.Comp.CompScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.Eng.EngScreen
import net.ezra.ui.Kisw.KiswScreen
import net.ezra.ui.Phy.PhyScreen
import net.ezra.ui.Bio.BioScreen
import net.ezra.ui.Businesss.BusinesssScreen
import net.ezra.ui.Chem.ChemScreen
import net.ezra.ui.Chem.ChemScreen
import net.ezra.ui.Comp.CompScreen
import net.ezra.ui.Eng.EngScreen
import net.ezra.ui.Geo.GeoScreen
import net.ezra.ui.Hist.HistScreen
import net.ezra.ui.Kisw.KiswScreen
import net.ezra.ui.RE.CREScreen
import net.ezra.ui.Subjects.SubjectScreen
import net.ezra.ui.f2a.F2AScreen
import net.ezra.ui.f2b.F2BScreen
import net.ezra.ui.f2bs.F2BSScreen
import net.ezra.ui.f2c.F2CScreen
import net.ezra.ui.f2co.F2COScreen
import net.ezra.ui.f2g.F2GScreen
import net.ezra.ui.f2h.F2HScreen
import net.ezra.ui.f2m.F2Screen
import net.ezra.ui.f2p.F2PScreen
import net.ezra.ui.f3a.F3AScreen
import net.ezra.ui.f3b.F3BScreen
import net.ezra.ui.f3bs.F3BSScreen
import net.ezra.ui.f3c.F3CScreen
import net.ezra.ui.f3co.F3COScreen
import net.ezra.ui.f3g.F3GScreen
import net.ezra.ui.f3h.F3HScreen
import net.ezra.ui.f3m.F3Screen
import net.ezra.ui.f3p.F3PScreen
import net.ezra.ui.f4a.F4AScreen
import net.ezra.ui.f4b.F4BScreen
import net.ezra.ui.f4bs.F4BSScreen
import net.ezra.ui.f4c.F4CScreen
import net.ezra.ui.f4co.F4COScreen
import net.ezra.ui.f4g.F4GScreen
import net.ezra.ui.f4h.F4HScreen
import net.ezra.ui.f4m.F4Screen
import net.ezra.ui.f4p.F4PScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_MATH) {
            MathScreen(navController)
        }

        composable(ROUTE_PHY) {
            PhyScreen(navController)
        }

        composable(ROUTE_HIST) {
            HistScreen(navController)
        }

        composable(ROUTE_BUSINESSS) {
            BusinesssScreen(navController)
        }

        composable(ROUTE_BIO) {
            BioScreen(navController)
        }

        composable(ROUTE_KISW) {
            KiswScreen(navController)
        }

        composable(ROUTE_COMP) {
            CompScreen(navController)
        }
        composable(ROUTE_CHEM) {
            ChemScreen(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_ENG) {
            EngScreen(navController)
        }

        composable(ROUTE_SUBJECTS) {
            SubjectScreen(navController)
        }

        composable(ROUTE_ENG) {
            EngScreen(navController)
        }
        composable(ROUTE_STA) {
            StartScreen(navController)
        }







        composable(ROUTE_F2M) {
            F2Screen(navController )
        }


        composable(ROUTE_F3M) {
            F3Screen(navController)
        }


        composable(ROUTE_F4M) {
            F4Screen(navController)
        }



        composable(ROUTE_F2P) {
            F2PScreen(navController)
        }


        composable(ROUTE_F3P) {
            F3PScreen(navController )
        }


        composable(ROUTE_F4P) {
            F4PScreen(navController)
        }




        composable(ROUTE_F2B) {
            F2BScreen(navController)
        }


        composable(ROUTE_F3B) {
            F3BScreen(navController)
        }


        composable(ROUTE_F4B) {
            F4BScreen(navController)
        }




        composable(ROUTE_F2BS) {
            F2BSScreen(navController)
        }


        composable(ROUTE_F3BS) {
            F3BSScreen(navController)
        }


        composable(ROUTE_F4BS) {
            F4BSScreen(navController)
        }


        composable(ROUTE_F2C) {
            F2CScreen(navController)
        }


        composable(ROUTE_F3C) {
            F3CScreen(navController)
        }


        composable(ROUTE_F4C) {
            F4CScreen(navController)
        }


        composable(ROUTE_RE) {
            CREScreen(navController)
        }

        composable(ROUTE_HIST) {
            HistScreen(navController)
        }

        composable(ROUTE_F2H) {
            F2HScreen(navController)
        }


        composable(ROUTE_F3H) {
            F3HScreen(navController)
        }


        composable(ROUTE_F4H) {
            F4HScreen(navController)
        }





        composable(ROUTE_F2G) {
            F2GScreen(navController)
        }

        composable(ROUTE_GEO) {
            GeoScreen(navController)
        }

        composable(ROUTE_F3G) {
            F3GScreen(navController)
        }


        composable(ROUTE_F4G) {
            F4GScreen(navController)
        }



        composable(ROUTE_AGRI) {
            AgriScreen(navController)
        }



        composable(ROUTE_F2A) {
            F2AScreen(navController)
        }


        composable(ROUTE_F3A) {
            F3AScreen(navController)
        }


        composable(ROUTE_F4A) {
            F4AScreen(navController)
        }


        composable(ROUTE_F2CO) {
            F2COScreen(navController)
        }


        composable(ROUTE_F3CO) {
            F3COScreen(navController)
        }


        composable(ROUTE_F4CO) {
            F4COScreen(navController)
        }
































    }
}