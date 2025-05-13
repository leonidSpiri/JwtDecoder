package domain

import com.google.gson.annotations.SerializedName

data class JwtPayload(

    @SerializedName("iss")
    val iss: String,

    @SerializedName("sub")
    val sub: String,

    @SerializedName("role")
    val role: String,

    @SerializedName("exp")
    val exp: Int,

    @SerializedName("iat")
    val iat: Int,
)

