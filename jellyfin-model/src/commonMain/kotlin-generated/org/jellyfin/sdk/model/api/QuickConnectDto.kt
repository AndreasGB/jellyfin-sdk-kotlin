// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The quick connect request body.
 */
@Serializable
public data class QuickConnectDto(
	/**
	 * Gets or sets the quick connect secret.
	 */
	@SerialName("Secret")
	public val secret: String,
)
