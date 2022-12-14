plugins {
    id(Java.libraryPlugin)
    id(Kotlin.javaPlugin)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(Koin.core)
    implementation(Kotlin.Coroutines.core)
}
