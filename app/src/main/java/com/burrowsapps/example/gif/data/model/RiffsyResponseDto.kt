package com.burrowsapps.example.gif.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Riffsy Api Response.
 *
 * eg. https://api.riffsy.com/v1/search?key=LIVDSRZULELA&tag=goodluck&limit=10
 */
@JsonClass(generateAdapter = true)
data class RiffsyResponseDto(
  @field:Json(name = "results") val resultsJson: List<ResultDto>? = emptyList(),
  @field:Json(name = "next") val nextJson: Double? = 0.0
) {
  val results: List<ResultDto>
    get() = resultsJson.orEmpty()
  val next: Double
    get() = nextJson ?: 0.0
}
