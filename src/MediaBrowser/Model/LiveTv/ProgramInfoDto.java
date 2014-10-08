package MediaBrowser.Model.LiveTv;

import MediaBrowser.Model.Dto.*;
import MediaBrowser.Model.Entities.*;
import MediaBrowser.Model.Extensions.*;
import MediaBrowser.Model.Library.*;

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DebuggerDisplay("Name = {Name}, StartTime = {StartDate}, EndTime = {EndDate}")] public class ProgramInfoDto : IHasPropertyChangedEvent, IItemDto
public class ProgramInfoDto implements IHasPropertyChangedEvent, IItemDto
{
	/** 
	 Id of the program.
	*/
	private String Id;
	public final String getId()
	{
		return Id;
	}
	public final void setId(String value)
	{
		Id = value;
	}

	/** 
	 Gets or sets the primary image aspect ratio.
	 
	 <value>The primary image aspect ratio.</value>
	*/
	private Double PrimaryImageAspectRatio = null;
	public final Double getPrimaryImageAspectRatio()
	{
		return PrimaryImageAspectRatio;
	}
	public final void setPrimaryImageAspectRatio(Double value)
	{
		PrimaryImageAspectRatio = value;
	}

	/** 
	 Gets or sets the original primary image aspect ratio.
	 
	 <value>The original primary image aspect ratio.</value>
	*/
	private Double OriginalPrimaryImageAspectRatio = null;
	public final Double getOriginalPrimaryImageAspectRatio()
	{
		return OriginalPrimaryImageAspectRatio;
	}
	public final void setOriginalPrimaryImageAspectRatio(Double value)
	{
		OriginalPrimaryImageAspectRatio = value;
	}

	/** 
	 Gets or sets the type of the media.
	 
	 <value>The type of the media.</value>
	*/
	private String MediaType;
	public final String getMediaType()
	{
		return MediaType;
	}
	public final void setMediaType(String value)
	{
		MediaType = value;
	}

	/** 
	 Gets or sets the timer identifier.
	 
	 <value>The timer identifier.</value>
	*/
	private String TimerId;
	public final String getTimerId()
	{
		return TimerId;
	}
	public final void setTimerId(String value)
	{
		TimerId = value;
	}

	/** 
	 Gets or sets the series timer identifier.
	 
	 <value>The series timer identifier.</value>
	*/
	private String SeriesTimerId;
	public final String getSeriesTimerId()
	{
		return SeriesTimerId;
	}
	public final void setSeriesTimerId(String value)
	{
		SeriesTimerId = value;
	}

	/** 
	 Gets or sets the external identifier.
	 
	 <value>The external identifier.</value>
	*/
	private String ExternalId;
	public final String getExternalId()
	{
		return ExternalId;
	}
	public final void setExternalId(String value)
	{
		ExternalId = value;
	}

	/** 
	 Gets or sets the channel identifier.
	 
	 <value>The channel identifier.</value>
	*/
	private String ChannelId;
	public final String getChannelId()
	{
		return ChannelId;
	}
	public final void setChannelId(String value)
	{
		ChannelId = value;
	}

	/** 
	 Gets or sets the channel primary image tag.
	 
	 <value>The channel primary image tag.</value>
	*/
	private String ChannelPrimaryImageTag;
	public final String getChannelPrimaryImageTag()
	{
		return ChannelPrimaryImageTag;
	}
	public final void setChannelPrimaryImageTag(String value)
	{
		ChannelPrimaryImageTag = value;
	}

	/** 
	 Gets or sets the play access.
	 
	 <value>The play access.</value>
	*/
	private PlayAccess PlayAccess = getPlayAccess().values()[0];
	public final PlayAccess getPlayAccess()
	{
		return PlayAccess;
	}
	public final void setPlayAccess(PlayAccess value)
	{
		PlayAccess = value;
	}

	/** 
	 Gets or sets the name of the channel.
	 
	 <value>The name of the channel.</value>
	*/
	private String ChannelName;
	public final String getChannelName()
	{
		return ChannelName;
	}
	public final void setChannelName(String value)
	{
		ChannelName = value;
	}

	/** 
	 Gets or sets the community rating.
	 
	 <value>The community rating.</value>
	*/
	private Float CommunityRating = null;
	public final Float getCommunityRating()
	{
		return CommunityRating;
	}
	public final void setCommunityRating(Float value)
	{
		CommunityRating = value;
	}

	/** 
	 Gets or sets the official rating.
	 
	 <value>The official rating.</value>
	*/
	private String OfficialRating;
	public final String getOfficialRating()
	{
		return OfficialRating;
	}
	public final void setOfficialRating(String value)
	{
		OfficialRating = value;
	}

	/** 
	 Gets or sets the name of the service.
	 
	 <value>The name of the service.</value>
	*/
	private String ServiceName;
	public final String getServiceName()
	{
		return ServiceName;
	}
	public final void setServiceName(String value)
	{
		ServiceName = value;
	}

	/** 
	 Name of the program
	*/
	private String Name;
	public final String getName()
	{
		return Name;
	}
	public final void setName(String value)
	{
		Name = value;
	}

	/** 
	 Overview of the recording.
	*/
	private String Overview;
	public final String getOverview()
	{
		return Overview;
	}
	public final void setOverview(String value)
	{
		Overview = value;
	}

	/** 
	 The start date of the program, in UTC.
	*/
	private java.util.Date StartDate = new java.util.Date(0);
	public final java.util.Date getStartDate()
	{
		return StartDate;
	}
	public final void setStartDate(java.util.Date value)
	{
		StartDate = value;
	}

	/** 
	 The end date of the program, in UTC.
	*/
	private java.util.Date EndDate = new java.util.Date(0);
	public final java.util.Date getEndDate()
	{
		return EndDate;
	}
	public final void setEndDate(java.util.Date value)
	{
		EndDate = value;
	}

	/** 
	 Genre of the program.
	*/
	private java.util.ArrayList<String> Genres;
	public final java.util.ArrayList<String> getGenres()
	{
		return Genres;
	}
	public final void setGenres(java.util.ArrayList<String> value)
	{
		Genres = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is hd.
	 
	 <value><c>true</c> if this instance is hd; otherwise, <c>false</c>.</value>
	*/
	private Boolean IsHD = null;
	public final Boolean getIsHD()
	{
		return IsHD;
	}
	public final void setIsHD(Boolean value)
	{
		IsHD = value;
	}

	/** 
	 Gets or sets the audio.
	 
	 <value>The audio.</value>
	*/
	private ProgramAudio Audio = null;
	public final ProgramAudio getAudio()
	{
		return Audio;
	}
	public final void setAudio(ProgramAudio value)
	{
		Audio = value;
	}

	/** 
	 Gets or sets the original air date.
	 
	 <value>The original air date.</value>
	*/
	private java.util.Date OriginalAirDate = null;
	public final java.util.Date getOriginalAirDate()
	{
		return OriginalAirDate;
	}
	public final void setOriginalAirDate(java.util.Date value)
	{
		OriginalAirDate = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is repeat.
	 
	 <value><c>true</c> if this instance is repeat; otherwise, <c>false</c>.</value>
	*/
	private boolean IsRepeat;
	public final boolean getIsRepeat()
	{
		return IsRepeat;
	}
	public final void setIsRepeat(boolean value)
	{
		IsRepeat = value;
	}

	/** 
	 Gets or sets the episode title.
	 
	 <value>The episode title.</value>
	*/
	private String EpisodeTitle;
	public final String getEpisodeTitle()
	{
		return EpisodeTitle;
	}
	public final void setEpisodeTitle(String value)
	{
		EpisodeTitle = value;
	}

	/** 
	 Gets or sets the image tags.
	 
	 <value>The image tags.</value>
	*/
	private java.util.HashMap<ImageType, String> ImageTags;
	public final java.util.HashMap<ImageType, String> getImageTags()
	{
		return ImageTags;
	}
	public final void setImageTags(java.util.HashMap<ImageType, String> value)
	{
		ImageTags = value;
	}

	/** 
	 Gets or sets the user data.
	 
	 <value>The user data.</value>
	*/
	private UserItemDataDto UserData;
	public final UserItemDataDto getUserData()
	{
		return UserData;
	}
	public final void setUserData(UserItemDataDto value)
	{
		UserData = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is movie.
	 
	 <value><c>true</c> if this instance is movie; otherwise, <c>false</c>.</value>
	*/
	private boolean IsMovie;
	public final boolean getIsMovie()
	{
		return IsMovie;
	}
	public final void setIsMovie(boolean value)
	{
		IsMovie = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is sports.
	 
	 <value><c>true</c> if this instance is sports; otherwise, <c>false</c>.</value>
	*/
	private boolean IsSports;
	public final boolean getIsSports()
	{
		return IsSports;
	}
	public final void setIsSports(boolean value)
	{
		IsSports = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is series.
	 
	 <value><c>true</c> if this instance is series; otherwise, <c>false</c>.</value>
	*/
	private boolean IsSeries;
	public final boolean getIsSeries()
	{
		return IsSeries;
	}
	public final void setIsSeries(boolean value)
	{
		IsSeries = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is live.
	 
	 <value><c>true</c> if this instance is live; otherwise, <c>false</c>.</value>
	*/
	private boolean IsLive;
	public final boolean getIsLive()
	{
		return IsLive;
	}
	public final void setIsLive(boolean value)
	{
		IsLive = value;
	}

	/** 
	 Gets or sets the type.
	 
	 <value>The type.</value>
	*/
	private String Type;
	public final String getType()
	{
		return Type;
	}
	public final void setType(String value)
	{
		Type = value;
	}

	/** 
	 Gets or sets the run time ticks.
	 
	 <value>The run time ticks.</value>
	*/
	private Long RunTimeTicks = null;
	public final Long getRunTimeTicks()
	{
		return RunTimeTicks;
	}
	public final void setRunTimeTicks(Long value)
	{
		RunTimeTicks = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is news.
	 
	 <value><c>true</c> if this instance is news; otherwise, <c>false</c>.</value>
	*/
	private boolean IsNews;
	public final boolean getIsNews()
	{
		return IsNews;
	}
	public final void setIsNews(boolean value)
	{
		IsNews = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is kids.
	 
	 <value><c>true</c> if this instance is kids; otherwise, <c>false</c>.</value>
	*/
	private boolean IsKids;
	public final boolean getIsKids()
	{
		return IsKids;
	}
	public final void setIsKids(boolean value)
	{
		IsKids = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is premiere.
	 
	 <value><c>true</c> if this instance is premiere; otherwise, <c>false</c>.</value>
	*/
	private boolean IsPremiere;
	public final boolean getIsPremiere()
	{
		return IsPremiere;
	}
	public final void setIsPremiere(boolean value)
	{
		IsPremiere = value;
	}

	/** 
	 Gets a value indicating whether this instance has primary image.
	 
	 <value><c>true</c> if this instance has primary image; otherwise, <c>false</c>.</value>
	*/
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [IgnoreDataMember] public bool HasPrimaryImage
	public final boolean getHasPrimaryImage()
	{
		return getImageTags() != null && getImageTags().containsKey(ImageType.Primary);
	}

	public ProgramInfoDto()
	{
		setGenres(new java.util.ArrayList<String>());
		setImageTags(new java.util.HashMap<ImageType, String>());
	}

//C# TO JAVA CONVERTER TODO TASK: Events are not available in Java:
//	public event PropertyChangedEventHandler PropertyChanged;
}