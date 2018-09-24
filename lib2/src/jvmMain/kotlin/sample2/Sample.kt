package sample2

import sample1.mppGreeting

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = "JVM"
}

class HelloFromJVM {
    val something = "Greetings from lib2, ${Platform.name}, coming from $this"
}

actual val mppGreeting2: String = "Greetings from lib2, ${Platform.name} module. Using also MPP library greeting: '$mppGreeting'"