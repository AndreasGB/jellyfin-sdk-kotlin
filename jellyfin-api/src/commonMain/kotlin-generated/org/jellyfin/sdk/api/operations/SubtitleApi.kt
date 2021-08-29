// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import io.ktor.utils.io.ByteReadChannel
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.emptyMap
import kotlin.collections.mutableMapOf
import org.jellyfin.sdk.api.client.ApiClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.extensions.`get`
import org.jellyfin.sdk.api.client.extensions.delete
import org.jellyfin.sdk.api.client.extensions.post
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.api.FontFile
import org.jellyfin.sdk.model.api.RemoteSubtitleInfo
import org.jellyfin.sdk.model.api.UploadSubtitleDto

public class SubtitleApi(
	private val api: ApiClient
) {
	/**
	 * Deletes an external subtitle file.
	 *
	 * @param itemId The item id.
	 * @param index The index of the subtitle file.
	 */
	public suspend fun deleteSubtitle(itemId: UUID, index: Int): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["index"] = index
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.delete<Unit>("/Videos/{itemId}/Subtitles/{index}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Downloads a remote subtitle.
	 *
	 * @param itemId The item id.
	 * @param subtitleId The subtitle id.
	 */
	public suspend fun downloadRemoteSubtitles(itemId: UUID, subtitleId: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["subtitleId"] = subtitleId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.post<Unit>("/Items/{itemId}/RemoteSearch/Subtitles/{subtitleId}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets a fallback font file.
	 *
	 * @param name The name of the fallback font file to get.
	 */
	public suspend fun getFallbackFont(name: String): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteReadChannel>("/FallbackFont/Fonts/{name}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets a fallback font file.
	 *
	 * @param name The name of the fallback font file to get.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getFallbackFontUrl(name: String, includeCredentials: Boolean = true): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/FallbackFont/Fonts/{name}", pathParameters, queryParameters,
				includeCredentials)
	}

	/**
	 * Gets a list of available fallback font files.
	 */
	public suspend fun getFallbackFontList(): Response<List<FontFile>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<FontFile>>("/FallbackFont/Fonts", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets the remote subtitles.
	 *
	 * @param id The item id.
	 */
	public suspend fun getRemoteSubtitles(id: String): Response<String> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["id"] = id
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<String>("/Providers/Subtitles/Subtitles/{id}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 */
	public suspend fun getSubtitle(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeFormat: String,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
		startPositionTicks: Long? = 0
	): Response<String> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["routeItemId"] = routeItemId
		pathParameters["routeMediaSourceId"] = routeMediaSourceId
		pathParameters["routeIndex"] = routeIndex
		pathParameters["routeFormat"] = routeFormat
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["endPositionTicks"] = endPositionTicks
		queryParameters["copyTimestamps"] = copyTimestamps
		queryParameters["addVttTimeMap"] = addVttTimeMap
		queryParameters["startPositionTicks"] = startPositionTicks
		val data = null
		val response =
				api.`get`<String>("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/Stream.{routeFormat}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param itemId The item id.
	 * @param mediaSourceId The media source id.
	 * @param index The subtitle stream index.
	 * @param format The format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getSubtitleDeprecated(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeFormat: String,
		itemId: UUID? = null,
		mediaSourceId: String? = null,
		index: Int? = null,
		format: String? = null,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false,
		startPositionTicks: Long? = 0
	): Response<String> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["routeItemId"] = routeItemId
		pathParameters["routeMediaSourceId"] = routeMediaSourceId
		pathParameters["routeIndex"] = routeIndex
		pathParameters["routeFormat"] = routeFormat
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["itemId"] = itemId
		queryParameters["mediaSourceId"] = mediaSourceId
		queryParameters["index"] = index
		queryParameters["format"] = format
		queryParameters["endPositionTicks"] = endPositionTicks
		queryParameters["copyTimestamps"] = copyTimestamps
		queryParameters["addVttTimeMap"] = addVttTimeMap
		queryParameters["startPositionTicks"] = startPositionTicks
		val data = null
		val response =
				api.`get`<String>("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/Stream.{routeFormat}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets an HLS subtitle playlist.
	 *
	 * @param itemId The item id.
	 * @param index The subtitle stream index.
	 * @param mediaSourceId The media source id.
	 * @param segmentLength The subtitle segment length.
	 */
	public suspend fun getSubtitlePlaylist(
		itemId: UUID,
		index: Int,
		mediaSourceId: String,
		segmentLength: Int
	): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["index"] = index
		pathParameters["mediaSourceId"] = mediaSourceId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["segmentLength"] = segmentLength
		val data = null
		val response =
				api.`get`<ByteReadChannel>("/Videos/{itemId}/{mediaSourceId}/Subtitles/{index}/subtitles.m3u8",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets an HLS subtitle playlist.
	 *
	 * @param itemId The item id.
	 * @param index The subtitle stream index.
	 * @param mediaSourceId The media source id.
	 * @param segmentLength The subtitle segment length.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getSubtitlePlaylistUrl(
		itemId: UUID,
		index: Int,
		mediaSourceId: String,
		segmentLength: Int,
		includeCredentials: Boolean = true
	): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["index"] = index
		pathParameters["mediaSourceId"] = mediaSourceId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["segmentLength"] = segmentLength
		return api.createUrl("/Videos/{itemId}/{mediaSourceId}/Subtitles/{index}/subtitles.m3u8",
				pathParameters, queryParameters, includeCredentials)
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeStartPositionTicks The (route) start position of the subtitle in ticks.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 */
	public suspend fun getSubtitleWithTicks(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeStartPositionTicks: Long,
		routeFormat: String,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false
	): Response<String> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["routeItemId"] = routeItemId
		pathParameters["routeMediaSourceId"] = routeMediaSourceId
		pathParameters["routeIndex"] = routeIndex
		pathParameters["routeStartPositionTicks"] = routeStartPositionTicks
		pathParameters["routeFormat"] = routeFormat
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["endPositionTicks"] = endPositionTicks
		queryParameters["copyTimestamps"] = copyTimestamps
		queryParameters["addVttTimeMap"] = addVttTimeMap
		val data = null
		val response =
				api.`get`<String>("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/{routeStartPositionTicks}/Stream.{routeFormat}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Gets subtitles in a specified format.
	 *
	 * @param routeItemId The (route) item id.
	 * @param routeMediaSourceId The (route) media source id.
	 * @param routeIndex The (route) subtitle stream index.
	 * @param routeStartPositionTicks The (route) start position of the subtitle in ticks.
	 * @param routeFormat The (route) format of the returned subtitle.
	 * @param itemId The item id.
	 * @param mediaSourceId The media source id.
	 * @param index The subtitle stream index.
	 * @param startPositionTicks The start position of the subtitle in ticks.
	 * @param format The format of the returned subtitle.
	 * @param endPositionTicks Optional. The end position of the subtitle in ticks.
	 * @param copyTimestamps Optional. Whether to copy the timestamps.
	 * @param addVttTimeMap Optional. Whether to add a VTT time map.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getSubtitleWithTicksDeprecated(
		routeItemId: UUID,
		routeMediaSourceId: String,
		routeIndex: Int,
		routeStartPositionTicks: Long,
		routeFormat: String,
		itemId: UUID? = null,
		mediaSourceId: String? = null,
		index: Int? = null,
		startPositionTicks: Long? = null,
		format: String? = null,
		endPositionTicks: Long? = null,
		copyTimestamps: Boolean? = false,
		addVttTimeMap: Boolean? = false
	): Response<String> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["routeItemId"] = routeItemId
		pathParameters["routeMediaSourceId"] = routeMediaSourceId
		pathParameters["routeIndex"] = routeIndex
		pathParameters["routeStartPositionTicks"] = routeStartPositionTicks
		pathParameters["routeFormat"] = routeFormat
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["itemId"] = itemId
		queryParameters["mediaSourceId"] = mediaSourceId
		queryParameters["index"] = index
		queryParameters["startPositionTicks"] = startPositionTicks
		queryParameters["format"] = format
		queryParameters["endPositionTicks"] = endPositionTicks
		queryParameters["copyTimestamps"] = copyTimestamps
		queryParameters["addVttTimeMap"] = addVttTimeMap
		val data = null
		val response =
				api.`get`<String>("/Videos/{routeItemId}/{routeMediaSourceId}/Subtitles/{routeIndex}/{routeStartPositionTicks}/Stream.{routeFormat}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Search remote subtitles.
	 *
	 * @param itemId The item id.
	 * @param language The language of the subtitles.
	 * @param isPerfectMatch Optional. Only show subtitles which are a perfect match.
	 */
	public suspend fun searchRemoteSubtitles(
		itemId: UUID,
		language: String,
		isPerfectMatch: Boolean? = null
	): Response<List<RemoteSubtitleInfo>> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		pathParameters["language"] = language
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["isPerfectMatch"] = isPerfectMatch
		val data = null
		val response =
				api.`get`<List<RemoteSubtitleInfo>>("/Items/{itemId}/RemoteSearch/Subtitles/{language}",
				pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Upload an external subtitle file.
	 *
	 * @param itemId The item the subtitle belongs to.
	 */
	public suspend fun uploadSubtitle(itemId: UUID, `data`: UploadSubtitleDto): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Videos/{itemId}/Subtitles", pathParameters, queryParameters, data)
		return response
	}
}
