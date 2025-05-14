package data

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import domain.JwtPayload
import java.util.Base64
import kotlin.io.encoding.ExperimentalEncodingApi


class Jwt(private val token: String) {

    @OptIn(ExperimentalEncodingApi::class, ExperimentalStdlibApi::class)
    private val userData: JsonObject by lazy {
        val userData = String(Base64.getUrlDecoder().decode(token.split(".")[1]))
        JsonParser.parseString(userData).asJsonObject
    }

    fun getUserData(): JwtPayload = gson.fromJson(userData, JwtPayload::class.java)

    fun isExpired(): Boolean {
        return userData.asJsonObject.get("exp").asLong < (System.currentTimeMillis() / 1000)
    }

    companion object {

        @JvmStatic
        private val gson = Gson()
    }
}