// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class LiveTvOptions(
	@SerialName("GuideDays")
	public val guideDays: Int? = null,
	@SerialName("RecordingPath")
	public val recordingPath: String? = null,
	@SerialName("MovieRecordingPath")
	public val movieRecordingPath: String? = null,
	@SerialName("SeriesRecordingPath")
	public val seriesRecordingPath: String? = null,
	@SerialName("EnableRecordingSubfolders")
	public val enableRecordingSubfolders: Boolean,
	@SerialName("EnableOriginalAudioWithEncodedRecordings")
	public val enableOriginalAudioWithEncodedRecordings: Boolean,
	@SerialName("TunerHosts")
	public val tunerHosts: List<TunerHostInfo>? = null,
	@SerialName("ListingProviders")
	public val listingProviders: List<ListingsProviderInfo>? = null,
	@SerialName("PrePaddingSeconds")
	public val prePaddingSeconds: Int,
	@SerialName("PostPaddingSeconds")
	public val postPaddingSeconds: Int,
	@SerialName("MediaLocationsCreated")
	public val mediaLocationsCreated: List<String>? = null,
	@SerialName("RecordingPostProcessor")
	public val recordingPostProcessor: String? = null,
	@SerialName("RecordingPostProcessorArguments")
	public val recordingPostProcessorArguments: String? = null,
)
