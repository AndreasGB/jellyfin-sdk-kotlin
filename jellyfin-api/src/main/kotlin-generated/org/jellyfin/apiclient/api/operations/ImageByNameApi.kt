// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import io.ktor.utils.io.ByteReadChannel
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.ImageByNameInfo

public class ImageByNameApi(
	private val api: KtorClient
) {
	/**
	 * Get all general images.
	 */
	public suspend fun getGeneralImages(): Response<List<ImageByNameInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<ImageByNameInfo>>("/Images/General", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get General Image.
	 *
	 * @param name The name of the image.
	 * @param type Image Type (primary, backdrop, logo, etc).
	 */
	public suspend fun getGeneralImage(name: String, type: String): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		pathParameters["type"] = type
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteReadChannel>("/Images/General/{name}/{type}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get General Image.
	 *
	 * @param name The name of the image.
	 * @param type Image Type (primary, backdrop, logo, etc).
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getGeneralImageUrl(
		name: String,
		type: String,
		includeCredentials: Boolean = false
	): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["name"] = name
		pathParameters["type"] = type
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/Images/General/{name}/{type}", pathParameters, queryParameters,
				includeCredentials)
	}

	/**
	 * Get all media info images.
	 */
	public suspend fun getMediaInfoImages(): Response<List<ImageByNameInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<ImageByNameInfo>>("/Images/MediaInfo", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get media info image.
	 *
	 * @param theme The theme to get the image from.
	 * @param name The name of the image.
	 */
	public suspend fun getMediaInfoImage(theme: String, name: String): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["theme"] = theme
		pathParameters["name"] = name
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteReadChannel>("/Images/MediaInfo/{theme}/{name}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get media info image.
	 *
	 * @param theme The theme to get the image from.
	 * @param name The name of the image.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getMediaInfoImageUrl(
		theme: String,
		name: String,
		includeCredentials: Boolean = false
	): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["theme"] = theme
		pathParameters["name"] = name
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/Images/MediaInfo/{theme}/{name}", pathParameters, queryParameters,
				includeCredentials)
	}

	/**
	 * Get all general images.
	 */
	public suspend fun getRatingImages(): Response<List<ImageByNameInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<List<ImageByNameInfo>>("/Images/Ratings", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get rating image.
	 *
	 * @param theme The theme to get the image from.
	 * @param name The name of the image.
	 */
	public suspend fun getRatingImage(theme: String, name: String): Response<ByteReadChannel> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["theme"] = theme
		pathParameters["name"] = name
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.`get`<ByteReadChannel>("/Images/Ratings/{theme}/{name}", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Get rating image.
	 *
	 * @param theme The theme to get the image from.
	 * @param name The name of the image.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getRatingImageUrl(
		theme: String,
		name: String,
		includeCredentials: Boolean = false
	): String {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["theme"] = theme
		pathParameters["name"] = name
		val queryParameters = emptyMap<String, Any?>()
		return api.createUrl("/Images/Ratings/{theme}/{name}", pathParameters, queryParameters,
				includeCredentials)
	}
}