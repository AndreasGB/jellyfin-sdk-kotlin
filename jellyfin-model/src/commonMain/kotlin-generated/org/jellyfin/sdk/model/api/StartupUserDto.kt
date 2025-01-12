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
 * The startup user DTO.
 */
@Serializable
public data class StartupUserDto(
	/**
	 * Gets or sets the username.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets the user's password.
	 */
	@SerialName("Password")
	public val password: String? = null,
)
