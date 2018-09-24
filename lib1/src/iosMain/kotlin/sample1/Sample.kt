package sample1

actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "iOS"
}

actual val mppGreeting: String = "Greetings from lib1, ${Platform.name} module"