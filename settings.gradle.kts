enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

//TODO: change project root you may also want to refactor the name of the directory
rootProject.name = "KMPTemplate"

include(":android", ":desktop", ":common")
