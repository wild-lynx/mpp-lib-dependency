package sample1

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = "JVM"
}

class HelloFromJVM {
    val something = "Greetings from lib1, ${Platform.name}, coming from $this"
}

actual val mppGreeting: String = "Greetings from lib1, ${Platform.name} module"