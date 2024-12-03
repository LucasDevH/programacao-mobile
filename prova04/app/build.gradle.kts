plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "br.com.hoppehosting.prova_04"
    compileSdk = 34

    defaultConfig {
        applicationId = "br.com.hoppehosting.prova_04"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.androidx.core.ktx)
    // androidx.appcompat: é a dependência do AppCompat. Será utilizada para adicionar compatibilidade com versões antigas.
    // androidx.constraintlayout: é a dependência do ConstraintLayout. Será utilizada para adicionar o layout de constraint.
    implementation(libs.androidx.constraintlayout)

    // androidx.databinding: é a dependência do Data Binding. Será utilizada para adicionar o Data Binding.
    implementation(libs.androidx.databinding.runtime)

    // com.google.android.material: é a dependência do Material Components. Será utilizada para adicionar componentes do Material Design.
    implementation(libs.circleimageview)
    implementation(libs.glide)
}