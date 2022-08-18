plugins {
    org.openrndr.extra.convention.`kotlin-jvm`
}

dependencies {
    implementation(libs.openrndr.application)
    implementation(libs.openrndr.math)
    demoImplementation(project(":orx-camera"))
    demoImplementation(project(":orx-shapes"))
}