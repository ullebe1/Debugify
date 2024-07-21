import com.google.gson.Gson
import com.google.gson.JsonObject
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpRequest.BodyPublishers
import java.net.http.HttpResponse
import java.net.http.HttpResponse.BodyHandlers

plugins {
    id("com.modrinth.minotaur")
    id("com.matthewprenger.cursegradle")
    id("com.github.breadmoirai.github-release")
}

afterEvaluate {
    tasks {
    }
}
