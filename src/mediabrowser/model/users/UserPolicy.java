package mediabrowser.model.users;

import mediabrowser.model.configuration.*;

public class UserPolicy
{
	/** 
	 Gets or sets a value indicating whether this instance is administrator.
	 
	 <value><c>true</c> if this instance is administrator; otherwise, <c>false</c>.</value>
	*/
	private boolean IsAdministrator;
	public final boolean getIsAdministrator()
	{
		return IsAdministrator;
	}
	public final void setIsAdministrator(boolean value)
	{
		IsAdministrator = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is hidden.
	 
	 <value><c>true</c> if this instance is hidden; otherwise, <c>false</c>.</value>
	*/
	private boolean IsHidden;
	public final boolean getIsHidden()
	{
		return IsHidden;
	}
	public final void setIsHidden(boolean value)
	{
		IsHidden = value;
	}

	/** 
	 Gets or sets a value indicating whether this instance is disabled.
	 
	 <value><c>true</c> if this instance is disabled; otherwise, <c>false</c>.</value>
	*/
	private boolean IsDisabled;
	public final boolean getIsDisabled()
	{
		return IsDisabled;
	}
	public final void setIsDisabled(boolean value)
	{
		IsDisabled = value;
	}

	/** 
	 Gets or sets the max parental rating.
	 
	 <value>The max parental rating.</value>
	*/
	private Integer MaxParentalRating;
	public final Integer getMaxParentalRating()
	{
		return MaxParentalRating;
	}
	public final void setMaxParentalRating(Integer value)
	{
		MaxParentalRating = value;
	}

	private String[] BlockedTags;
	public final String[] getBlockedTags()
	{
		return BlockedTags;
	}
	public final void setBlockedTags(String[] value)
	{
		BlockedTags = value;
	}
	private boolean EnableUserPreferenceAccess;
	public final boolean getEnableUserPreferenceAccess()
	{
		return EnableUserPreferenceAccess;
	}
	public final void setEnableUserPreferenceAccess(boolean value)
	{
		EnableUserPreferenceAccess = value;
	}
	private AccessSchedule[] AccessSchedules;
	public final AccessSchedule[] getAccessSchedules()
	{
		return AccessSchedules;
	}
	public final void setAccessSchedules(AccessSchedule[] value)
	{
		AccessSchedules = value;
	}
	private UnratedItem[] BlockUnratedItems;
	public final UnratedItem[] getBlockUnratedItems()
	{
		return BlockUnratedItems;
	}
	public final void setBlockUnratedItems(UnratedItem[] value)
	{
		BlockUnratedItems = value;
	}
	private String[] BlockedMediaFolders;
	public final String[] getBlockedMediaFolders()
	{
		return BlockedMediaFolders;
	}
	public final void setBlockedMediaFolders(String[] value)
	{
		BlockedMediaFolders = value;
	}
	private String[] BlockedChannels;
	public final String[] getBlockedChannels()
	{
		return BlockedChannels;
	}
	public final void setBlockedChannels(String[] value)
	{
		BlockedChannels = value;
	}
	private boolean EnableRemoteControlOfOtherUsers;
	public final boolean getEnableRemoteControlOfOtherUsers()
	{
		return EnableRemoteControlOfOtherUsers;
	}
	public final void setEnableRemoteControlOfOtherUsers(boolean value)
	{
		EnableRemoteControlOfOtherUsers = value;
	}
	private boolean EnableSharedDeviceControl;
	public final boolean getEnableSharedDeviceControl()
	{
		return EnableSharedDeviceControl;
	}
	public final void setEnableSharedDeviceControl(boolean value)
	{
		EnableSharedDeviceControl = value;
	}

	private boolean EnableLiveTvManagement;
	public final boolean getEnableLiveTvManagement()
	{
		return EnableLiveTvManagement;
	}
	public final void setEnableLiveTvManagement(boolean value)
	{
		EnableLiveTvManagement = value;
	}
	private boolean EnableLiveTvAccess;
	public final boolean getEnableLiveTvAccess()
	{
		return EnableLiveTvAccess;
	}
	public final void setEnableLiveTvAccess(boolean value)
	{
		EnableLiveTvAccess = value;
	}

	private boolean EnableMediaPlayback;
	public final boolean getEnableMediaPlayback()
	{
		return EnableMediaPlayback;
	}
	public final void setEnableMediaPlayback(boolean value)
	{
		EnableMediaPlayback = value;
	}
	private boolean EnableContentDeletion;
	public final boolean getEnableContentDeletion()
	{
		return EnableContentDeletion;
	}
	public final void setEnableContentDeletion(boolean value)
	{
		EnableContentDeletion = value;
	}

	/** 
	 Gets or sets a value indicating whether [enable synchronize].
	 
	 <value><c>true</c> if [enable synchronize]; otherwise, <c>false</c>.</value>
	*/
	private boolean EnableSync;
	public final boolean getEnableSync()
	{
		return EnableSync;
	}
	public final void setEnableSync(boolean value)
	{
		EnableSync = value;
	}

	private String[] EnabledDevices;
	public final String[] getEnabledDevices()
	{
		return EnabledDevices;
	}
	public final void setEnabledDevices(String[] value)
	{
		EnabledDevices = value;
	}
	private boolean EnableAllDevices;
	public final boolean getEnableAllDevices()
	{
		return EnableAllDevices;
	}
	public final void setEnableAllDevices(boolean value)
	{
		EnableAllDevices = value;
	}

	public UserPolicy()
	{
		setEnableLiveTvManagement(true);
		setEnableMediaPlayback(true);
		setEnableLiveTvAccess(true);
		setEnableSharedDeviceControl(true);

		setBlockedMediaFolders(new String[] { });
		setBlockedTags(new String[] { });
		setBlockedChannels(new String[] { });
		setBlockUnratedItems(new UnratedItem[] { });

		setEnableUserPreferenceAccess(true);

		setAccessSchedules(new AccessSchedule[] { });

		setEnabledDevices(new String[] { });
		setEnableAllDevices(true);
	}
}