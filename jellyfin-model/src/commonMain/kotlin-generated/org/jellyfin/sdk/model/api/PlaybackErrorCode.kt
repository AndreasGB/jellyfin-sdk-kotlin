// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class PlaybackErrorCode(
	public val serialName: String,
) {
	@SerialName("NotAllowed")
	NOT_ALLOWED("NotAllowed"),
	@SerialName("NoCompatibleStream")
	NO_COMPATIBLE_STREAM("NoCompatibleStream"),
	@SerialName("RateLimitExceeded")
	RATE_LIMIT_EXCEEDED("RateLimitExceeded"),
	;

	public override fun toString(): String = serialName
}
