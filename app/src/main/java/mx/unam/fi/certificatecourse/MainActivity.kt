package mx.unam.fi.certificatecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.unam.fi.certificatecourse.ui.theme.CertificateCourseTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CertificateCourseTheme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CertificateCourse("Luisa", 5,"User Interface with Jetpack Compose")
                }
            }
        }
    }
}

@Composable
fun CertificateCourse(name: String, number: Int, course: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment. CenterHorizontally
    ) {

        //Primer renglón
        Box(contentAlignment = Alignment.Center) {
            Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.escudo_unam),
                    contentDescription = null,
                    modifier.size(50.dp, 50.dp)
                )
                Text(text = "\n DroidWorks Inc.")
                Image(
                    painter = painterResource(id = R.drawable.escudo_fi),
                    contentDescription = null,
                    modifier.size(50.dp, 50.dp)
                )
            }
        }

        Spacer(modifier = modifier.height(50.dp))

        //Segundo renglón:
        Text(text = "This certificate is presented to:")

        Spacer(modifier = modifier.height(20.dp))

        //Tercer renglón
        Box(contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.android1),
                contentDescription = null,
                modifier = modifier
                    .fillMaxWidth()
                    .size(150.dp, 150.dp),
                alpha = 0.4F
            )
            Text(
                text = name,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
            )
        }

        Spacer(modifier = modifier.height(20.dp))

        //Cuarto renglón
        Text(
            text = "Has completed a $number hours course on",
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = modifier.height(10.dp))

        //Quinto renglón
        Text(text = course,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = modifier.height(50.dp))

        //Sexto renglón
        Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(id = R.drawable.firma1),
                contentDescription = null,
                modifier.size(70.dp, 40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.firma2),
                contentDescription = null,
                modifier.size(70.dp, 40.dp)
            )
        }

        //Séptimo renglón
        Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround){
            Text(
                text = "Daniel Aguirre Bravo",
                fontSize = 10.sp,
            )
            Text(
                text = "Jorge Rodríguez Vera",
                fontSize = 10.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CertificateCoursePreview() {
    CertificateCourseTheme{
        CertificateCourse("Luisa",5,"User Interface with Jetpack Compose")
    }
}