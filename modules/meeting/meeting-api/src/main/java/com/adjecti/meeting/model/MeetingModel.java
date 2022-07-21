/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.adjecti.meeting.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Meeting service. Represents a row in the &quot;meeting_Meeting&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.adjecti.meeting.model.impl.MeetingModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.adjecti.meeting.model.impl.MeetingImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Meeting
 * @generated
 */
@ProviderType
public interface MeetingModel
	extends BaseModel<Meeting>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a meeting model instance should use the {@link Meeting} interface instead.
	 */

	/**
	 * Returns the primary key of this meeting.
	 *
	 * @return the primary key of this meeting
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this meeting.
	 *
	 * @param primaryKey the primary key of this meeting
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this meeting.
	 *
	 * @return the uuid of this meeting
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this meeting.
	 *
	 * @param uuid the uuid of this meeting
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the meeting ID of this meeting.
	 *
	 * @return the meeting ID of this meeting
	 */
	public long getMeetingId();

	/**
	 * Sets the meeting ID of this meeting.
	 *
	 * @param meetingId the meeting ID of this meeting
	 */
	public void setMeetingId(long meetingId);

	/**
	 * Returns the group ID of this meeting.
	 *
	 * @return the group ID of this meeting
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this meeting.
	 *
	 * @param groupId the group ID of this meeting
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this meeting.
	 *
	 * @return the company ID of this meeting
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this meeting.
	 *
	 * @param companyId the company ID of this meeting
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this meeting.
	 *
	 * @return the user ID of this meeting
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this meeting.
	 *
	 * @param userId the user ID of this meeting
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this meeting.
	 *
	 * @return the user uuid of this meeting
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this meeting.
	 *
	 * @param userUuid the user uuid of this meeting
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this meeting.
	 *
	 * @return the user name of this meeting
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this meeting.
	 *
	 * @param userName the user name of this meeting
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this meeting.
	 *
	 * @return the create date of this meeting
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this meeting.
	 *
	 * @param createDate the create date of this meeting
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this meeting.
	 *
	 * @return the modified date of this meeting
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this meeting.
	 *
	 * @param modifiedDate the modified date of this meeting
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this meeting.
	 *
	 * @return the title of this meeting
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this meeting.
	 *
	 * @param title the title of this meeting
	 */
	public void setTitle(String title);

	/**
	 * Returns the date and time of this meeting.
	 *
	 * @return the date and time of this meeting
	 */
	@AutoEscape
	public String getDateAndTime();

	/**
	 * Sets the date and time of this meeting.
	 *
	 * @param dateAndTime the date and time of this meeting
	 */
	public void setDateAndTime(String dateAndTime);

	/**
	 * Returns the location of this meeting.
	 *
	 * @return the location of this meeting
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this meeting.
	 *
	 * @param location the location of this meeting
	 */
	public void setLocation(String location);

	/**
	 * Returns the agenda of this meeting.
	 *
	 * @return the agenda of this meeting
	 */
	@AutoEscape
	public String getAgenda();

	/**
	 * Sets the agenda of this meeting.
	 *
	 * @param agenda the agenda of this meeting
	 */
	public void setAgenda(String agenda);

	/**
	 * Returns the description of this meeting.
	 *
	 * @return the description of this meeting
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this meeting.
	 *
	 * @param description the description of this meeting
	 */
	public void setDescription(String description);

	/**
	 * Returns the created by of this meeting.
	 *
	 * @return the created by of this meeting
	 */
	@AutoEscape
	public String getCreatedBy();

	/**
	 * Sets the created by of this meeting.
	 *
	 * @param createdBy the created by of this meeting
	 */
	public void setCreatedBy(String createdBy);

	/**
	 * Returns the hosted by of this meeting.
	 *
	 * @return the hosted by of this meeting
	 */
	@AutoEscape
	public String getHostedBy();

	/**
	 * Sets the hosted by of this meeting.
	 *
	 * @param hostedBy the hosted by of this meeting
	 */
	public void setHostedBy(String hostedBy);

	/**
	 * Returns the meeting type of this meeting.
	 *
	 * @return the meeting type of this meeting
	 */
	@AutoEscape
	public String getMeetingType();

	/**
	 * Sets the meeting type of this meeting.
	 *
	 * @param meetingType the meeting type of this meeting
	 */
	public void setMeetingType(String meetingType);

	/**
	 * Returns the meeting link of this meeting.
	 *
	 * @return the meeting link of this meeting
	 */
	@AutoEscape
	public String getMeetingLink();

	/**
	 * Sets the meeting link of this meeting.
	 *
	 * @param meetingLink the meeting link of this meeting
	 */
	public void setMeetingLink(String meetingLink);

	/**
	 * Returns the meeting room of this meeting.
	 *
	 * @return the meeting room of this meeting
	 */
	@AutoEscape
	public String getMeetingRoom();

	/**
	 * Sets the meeting room of this meeting.
	 *
	 * @param meetingRoom the meeting room of this meeting
	 */
	public void setMeetingRoom(String meetingRoom);

	/**
	 * Returns the assets name of this meeting.
	 *
	 * @return the assets name of this meeting
	 */
	@AutoEscape
	public String getAssetsName();

	/**
	 * Sets the assets name of this meeting.
	 *
	 * @param assetsName the assets name of this meeting
	 */
	public void setAssetsName(String assetsName);

	/**
	 * Returns the internal guest of this meeting.
	 *
	 * @return the internal guest of this meeting
	 */
	@AutoEscape
	public String getInternalGuest();

	/**
	 * Sets the internal guest of this meeting.
	 *
	 * @param internalGuest the internal guest of this meeting
	 */
	public void setInternalGuest(String internalGuest);

	/**
	 * Returns the external guest of this meeting.
	 *
	 * @return the external guest of this meeting
	 */
	@AutoEscape
	public String getExternalGuest();

	/**
	 * Sets the external guest of this meeting.
	 *
	 * @param externalGuest the external guest of this meeting
	 */
	public void setExternalGuest(String externalGuest);

}