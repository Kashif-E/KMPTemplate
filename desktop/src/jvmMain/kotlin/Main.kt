import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.kashif.common.Application


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
       Application()
    }
}
