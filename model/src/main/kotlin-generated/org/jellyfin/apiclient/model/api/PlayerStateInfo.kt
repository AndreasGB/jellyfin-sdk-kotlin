// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PlayerStateInfo(
	/**
	 * Gets or sets the now playing position ticks.
	 */
	@SerialName("PositionTicks")
	val positionTicks: Long? = null,
	/**
	 * Gets or sets a value indicating whether this instance can seek.
	 */
	@SerialName("CanSeek")
	val canSeek: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance is paused.
	 */
	@SerialName("IsPaused")
	val isPaused: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance is muted.
	 */
	@SerialName("IsMuted")
	val isMuted: Boolean,
	/**
	 * Gets or sets the volume level.
	 */
	@SerialName("VolumeLevel")
	val volumeLevel: Int? = null,
	/**
	 * Gets or sets the index of the now playing audio stream.
	 */
	@SerialName("AudioStreamIndex")
	val audioStreamIndex: Int? = null,
	/**
	 * Gets or sets the index of the now playing subtitle stream.
	 */
	@SerialName("SubtitleStreamIndex")
	val subtitleStreamIndex: Int? = null,
	/**
	 * Gets or sets the now playing media version identifier.
	 */
	@SerialName("MediaSourceId")
	val mediaSourceId: String? = null,
	@SerialName("PlayMethod")
	val playMethod: PlayMethod,
	@SerialName("RepeatMode")
	val repeatMode: RepeatMode
)
