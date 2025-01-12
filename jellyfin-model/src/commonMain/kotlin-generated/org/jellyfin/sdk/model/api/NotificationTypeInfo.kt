// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class NotificationTypeInfo(
	@SerialName("Type")
	public val type: String? = null,
	@SerialName("Name")
	public val name: String? = null,
	@SerialName("Enabled")
	public val enabled: Boolean,
	@SerialName("Category")
	public val category: String? = null,
	@SerialName("IsBasedOnUserEvent")
	public val isBasedOnUserEvent: Boolean,
)
