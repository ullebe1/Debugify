import com.modrinth.minotaur.dependencies.ModDependency

plugins {
    id("com.modrinth.minotaur")
    id("com.matthewprenger.cursegradle")
    `maven-publish`
    base
}

val minecraftVersion: String by rootProject
val isFabric = project.name == "fabric"

val publicationName = "debugify${project.name.capitalize()}"
publishing {
}
