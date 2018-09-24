package sample1

actual class Sample {
    actual fun checkMe() = 12
}

actual object Platform {
    actual val name: String = "JS"
}

actual val mppGreeting: String = "Greetings from lib1, ${Platform.name} module"