package domain

import com.google.gson.annotations.SerializedName

data class JwtPayload(

    @SerializedName("iss")
    val iss: String,

    @SerializedName("sub")
    val sub: String?,

    @SerializedName("role")
    val role: String?,

    @SerializedName("exp")
    val exp: Int,

    @SerializedName("teams")
    val teams: List<JwtTeam>?,

    @SerializedName("iat")
    val iat: Int,
)

data class JwtTeam(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String?,
)

