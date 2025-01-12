// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Client capabilities dto.
 */
@Serializable
public data class ClientCapabilitiesDto(
	/**
	 * Gets or sets the list of playable media types.
	 */
	@SerialName("PlayableMediaTypes")
	public val playableMediaTypes: List<String>,
	/**
	 * Gets or sets the list of supported commands.
	 */
	@SerialName("SupportedCommands")
	public val supportedCommands: List<GeneralCommandType>,
	/**
	 * Gets or sets a value indicating whether session supports media control.
	 */
	@SerialName("SupportsMediaControl")
	public val supportsMediaControl: Boolean,
	/**
	 * Gets or sets a value indicating whether session supports content uploading.
	 */
	@SerialName("SupportsContentUploading")
	public val supportsContentUploading: Boolean,
	/**
	 * Gets or sets the message callback url.
	 */
	@SerialName("MessageCallbackUrl")
	public val messageCallbackUrl: String? = null,
	/**
	 * Gets or sets a value indicating whether session supports a persistent identifier.
	 */
	@SerialName("SupportsPersistentIdentifier")
	public val supportsPersistentIdentifier: Boolean,
	/**
	 * Gets or sets a value indicating whether session supports sync.
	 */
	@SerialName("SupportsSync")
	public val supportsSync: Boolean,
	/**
	 * A MediaBrowser.Model.Dlna.DeviceProfile represents a set of metadata which determines which
	 * content a certain device is able to play.
	 *
	 *
	 * Specifically, it defines the supported containers
	 * (`P:MediaBrowser.Model.Dlna.DeviceProfile.ContainerProfiles`) and
	 * codecs (`P:MediaBrowser.Model.Dlna.DeviceProfile.CodecProfiles`) (video and/or audio, including
	 * codec profiles and levels)
	 * the device is able to direct play (without transcoding or remuxing),
	 * as well as which containers/codecs to transcode to
	 * (`P:MediaBrowser.Model.Dlna.DeviceProfile.TranscodingProfiles`) in case it isn't.
	 */
	@SerialName("DeviceProfile")
	public val deviceProfile: DeviceProfile? = null,
	/**
	 * Gets or sets the app store url.
	 */
	@SerialName("AppStoreUrl")
	public val appStoreUrl: String? = null,
	/**
	 * Gets or sets the icon url.
	 */
	@SerialName("IconUrl")
	public val iconUrl: String? = null,
)
