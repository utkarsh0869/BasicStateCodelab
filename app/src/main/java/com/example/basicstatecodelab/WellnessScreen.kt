import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.basicstatecodelab.StatefulCounter
import com.example.basicstatecodelab.StatelessCounter

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column {
        StatefulCounter(modifier)
        WellnessTaskList()
    }
}