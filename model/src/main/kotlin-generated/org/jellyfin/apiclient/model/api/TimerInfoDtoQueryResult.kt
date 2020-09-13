// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.model.api

import kotlin.Int
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TimerInfoDtoQueryResult(
	/**
	 * Gets or sets the items.
	 */
	@SerialName("Items")
	val items: List<TimerInfoDto>? = null,
	/**
	 * The total number of records available.
	 */
	@SerialName("TotalRecordCount")
	val totalRecordCount: Int,
	/**
	 * The index of the first record in Items.
	 */
	@SerialName("StartIndex")
	val startIndex: Int
)
