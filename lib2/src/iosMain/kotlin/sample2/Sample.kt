package sample2

actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "iOS"
}

actual val mppGreeting2: String = "Greetings from lib2, ${Platform.name} module"