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

package com.adjecti.meeting.model.impl;

import com.adjecti.meeting.model.Meeting;
import com.adjecti.meeting.model.MeetingModel;
import com.adjecti.meeting.model.MeetingSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Meeting service. Represents a row in the &quot;meeting_Meeting&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MeetingModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MeetingImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MeetingImpl
 * @generated
 */
@JSON(strict = true)
public class MeetingModelImpl
	extends BaseModelImpl<Meeting> implements MeetingModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a meeting model instance should use the <code>Meeting</code> interface instead.
	 */
	public static final String TABLE_NAME = "meeting_Meeting";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"meetingId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"title", Types.VARCHAR}, {"dateAndTime", Types.VARCHAR},
		{"location", Types.VARCHAR}, {"agenda", Types.VARCHAR},
		{"description", Types.VARCHAR}, {"createdBy", Types.VARCHAR},
		{"hostedBy", Types.VARCHAR}, {"meetingType", Types.VARCHAR},
		{"meetingLink", Types.VARCHAR}, {"meetingRoom", Types.VARCHAR},
		{"assetsName", Types.VARCHAR}, {"internalGuest", Types.VARCHAR},
		{"externalGuest", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("meetingId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateAndTime", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("location", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("agenda", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createdBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hostedBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("meetingType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("meetingLink", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("meetingRoom", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("assetsName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("internalGuest", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("externalGuest", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table meeting_Meeting (uuid_ VARCHAR(75) null,meetingId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,title VARCHAR(75) null,dateAndTime VARCHAR(75) null,location VARCHAR(75) null,agenda VARCHAR(75) null,description VARCHAR(75) null,createdBy VARCHAR(75) null,hostedBy VARCHAR(75) null,meetingType VARCHAR(75) null,meetingLink VARCHAR(75) null,meetingRoom VARCHAR(75) null,assetsName VARCHAR(75) null,internalGuest VARCHAR(75) null,externalGuest VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table meeting_Meeting";

	public static final String ORDER_BY_JPQL =
		" ORDER BY meeting.title ASC, meeting.dateAndTime ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY meeting_Meeting.title ASC, meeting_Meeting.dateAndTime ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDBY_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long HOSTEDBY_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long LOCATION_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TITLE_COLUMN_BITMASK = 32L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 64L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long DATEANDTIME_COLUMN_BITMASK = 128L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static Meeting toModel(MeetingSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Meeting model = new MeetingImpl();

		model.setUuid(soapModel.getUuid());
		model.setMeetingId(soapModel.getMeetingId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTitle(soapModel.getTitle());
		model.setDateAndTime(soapModel.getDateAndTime());
		model.setLocation(soapModel.getLocation());
		model.setAgenda(soapModel.getAgenda());
		model.setDescription(soapModel.getDescription());
		model.setCreatedBy(soapModel.getCreatedBy());
		model.setHostedBy(soapModel.getHostedBy());
		model.setMeetingType(soapModel.getMeetingType());
		model.setMeetingLink(soapModel.getMeetingLink());
		model.setMeetingRoom(soapModel.getMeetingRoom());
		model.setAssetsName(soapModel.getAssetsName());
		model.setInternalGuest(soapModel.getInternalGuest());
		model.setExternalGuest(soapModel.getExternalGuest());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<Meeting> toModels(MeetingSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Meeting> models = new ArrayList<Meeting>(soapModels.length);

		for (MeetingSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public MeetingModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _meetingId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMeetingId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _meetingId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Meeting.class;
	}

	@Override
	public String getModelClassName() {
		return Meeting.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Meeting, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Meeting, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Meeting, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Meeting)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Meeting, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Meeting, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Meeting)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Meeting, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Meeting, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Meeting>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Meeting.class.getClassLoader(), Meeting.class, ModelWrapper.class);

		try {
			Constructor<Meeting> constructor =
				(Constructor<Meeting>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Meeting, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Meeting, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Meeting, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Meeting, Object>>();
		Map<String, BiConsumer<Meeting, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Meeting, ?>>();

		attributeGetterFunctions.put("uuid", Meeting::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Meeting, String>)Meeting::setUuid);
		attributeGetterFunctions.put("meetingId", Meeting::getMeetingId);
		attributeSetterBiConsumers.put(
			"meetingId", (BiConsumer<Meeting, Long>)Meeting::setMeetingId);
		attributeGetterFunctions.put("groupId", Meeting::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Meeting, Long>)Meeting::setGroupId);
		attributeGetterFunctions.put("companyId", Meeting::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Meeting, Long>)Meeting::setCompanyId);
		attributeGetterFunctions.put("userId", Meeting::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Meeting, Long>)Meeting::setUserId);
		attributeGetterFunctions.put("userName", Meeting::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Meeting, String>)Meeting::setUserName);
		attributeGetterFunctions.put("createDate", Meeting::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Meeting, Date>)Meeting::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Meeting::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Meeting, Date>)Meeting::setModifiedDate);
		attributeGetterFunctions.put("title", Meeting::getTitle);
		attributeSetterBiConsumers.put(
			"title", (BiConsumer<Meeting, String>)Meeting::setTitle);
		attributeGetterFunctions.put("dateAndTime", Meeting::getDateAndTime);
		attributeSetterBiConsumers.put(
			"dateAndTime",
			(BiConsumer<Meeting, String>)Meeting::setDateAndTime);
		attributeGetterFunctions.put("location", Meeting::getLocation);
		attributeSetterBiConsumers.put(
			"location", (BiConsumer<Meeting, String>)Meeting::setLocation);
		attributeGetterFunctions.put("agenda", Meeting::getAgenda);
		attributeSetterBiConsumers.put(
			"agenda", (BiConsumer<Meeting, String>)Meeting::setAgenda);
		attributeGetterFunctions.put("description", Meeting::getDescription);
		attributeSetterBiConsumers.put(
			"description",
			(BiConsumer<Meeting, String>)Meeting::setDescription);
		attributeGetterFunctions.put("createdBy", Meeting::getCreatedBy);
		attributeSetterBiConsumers.put(
			"createdBy", (BiConsumer<Meeting, String>)Meeting::setCreatedBy);
		attributeGetterFunctions.put("hostedBy", Meeting::getHostedBy);
		attributeSetterBiConsumers.put(
			"hostedBy", (BiConsumer<Meeting, String>)Meeting::setHostedBy);
		attributeGetterFunctions.put("meetingType", Meeting::getMeetingType);
		attributeSetterBiConsumers.put(
			"meetingType",
			(BiConsumer<Meeting, String>)Meeting::setMeetingType);
		attributeGetterFunctions.put("meetingLink", Meeting::getMeetingLink);
		attributeSetterBiConsumers.put(
			"meetingLink",
			(BiConsumer<Meeting, String>)Meeting::setMeetingLink);
		attributeGetterFunctions.put("meetingRoom", Meeting::getMeetingRoom);
		attributeSetterBiConsumers.put(
			"meetingRoom",
			(BiConsumer<Meeting, String>)Meeting::setMeetingRoom);
		attributeGetterFunctions.put("assetsName", Meeting::getAssetsName);
		attributeSetterBiConsumers.put(
			"assetsName", (BiConsumer<Meeting, String>)Meeting::setAssetsName);
		attributeGetterFunctions.put(
			"internalGuest", Meeting::getInternalGuest);
		attributeSetterBiConsumers.put(
			"internalGuest",
			(BiConsumer<Meeting, String>)Meeting::setInternalGuest);
		attributeGetterFunctions.put(
			"externalGuest", Meeting::getExternalGuest);
		attributeSetterBiConsumers.put(
			"externalGuest",
			(BiConsumer<Meeting, String>)Meeting::setExternalGuest);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getMeetingId() {
		return _meetingId;
	}

	@Override
	public void setMeetingId(long meetingId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_meetingId = meetingId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return "";
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_title = title;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalTitle() {
		return getColumnOriginalValue("title");
	}

	@JSON
	@Override
	public String getDateAndTime() {
		if (_dateAndTime == null) {
			return "";
		}
		else {
			return _dateAndTime;
		}
	}

	@Override
	public void setDateAndTime(String dateAndTime) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateAndTime = dateAndTime;
	}

	@JSON
	@Override
	public String getLocation() {
		if (_location == null) {
			return "";
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_location = location;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalLocation() {
		return getColumnOriginalValue("location");
	}

	@JSON
	@Override
	public String getAgenda() {
		if (_agenda == null) {
			return "";
		}
		else {
			return _agenda;
		}
	}

	@Override
	public void setAgenda(String agenda) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_agenda = agenda;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_description = description;
	}

	@JSON
	@Override
	public String getCreatedBy() {
		if (_createdBy == null) {
			return "";
		}
		else {
			return _createdBy;
		}
	}

	@Override
	public void setCreatedBy(String createdBy) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createdBy = createdBy;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalCreatedBy() {
		return getColumnOriginalValue("createdBy");
	}

	@JSON
	@Override
	public String getHostedBy() {
		if (_hostedBy == null) {
			return "";
		}
		else {
			return _hostedBy;
		}
	}

	@Override
	public void setHostedBy(String hostedBy) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hostedBy = hostedBy;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalHostedBy() {
		return getColumnOriginalValue("hostedBy");
	}

	@JSON
	@Override
	public String getMeetingType() {
		if (_meetingType == null) {
			return "";
		}
		else {
			return _meetingType;
		}
	}

	@Override
	public void setMeetingType(String meetingType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_meetingType = meetingType;
	}

	@JSON
	@Override
	public String getMeetingLink() {
		if (_meetingLink == null) {
			return "";
		}
		else {
			return _meetingLink;
		}
	}

	@Override
	public void setMeetingLink(String meetingLink) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_meetingLink = meetingLink;
	}

	@JSON
	@Override
	public String getMeetingRoom() {
		if (_meetingRoom == null) {
			return "";
		}
		else {
			return _meetingRoom;
		}
	}

	@Override
	public void setMeetingRoom(String meetingRoom) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_meetingRoom = meetingRoom;
	}

	@JSON
	@Override
	public String getAssetsName() {
		if (_assetsName == null) {
			return "";
		}
		else {
			return _assetsName;
		}
	}

	@Override
	public void setAssetsName(String assetsName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assetsName = assetsName;
	}

	@JSON
	@Override
	public String getInternalGuest() {
		if (_internalGuest == null) {
			return "";
		}
		else {
			return _internalGuest;
		}
	}

	@Override
	public void setInternalGuest(String internalGuest) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_internalGuest = internalGuest;
	}

	@JSON
	@Override
	public String getExternalGuest() {
		if (_externalGuest == null) {
			return "";
		}
		else {
			return _externalGuest;
		}
	}

	@Override
	public void setExternalGuest(String externalGuest) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_externalGuest = externalGuest;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Meeting.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Meeting.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Meeting toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Meeting>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MeetingImpl meetingImpl = new MeetingImpl();

		meetingImpl.setUuid(getUuid());
		meetingImpl.setMeetingId(getMeetingId());
		meetingImpl.setGroupId(getGroupId());
		meetingImpl.setCompanyId(getCompanyId());
		meetingImpl.setUserId(getUserId());
		meetingImpl.setUserName(getUserName());
		meetingImpl.setCreateDate(getCreateDate());
		meetingImpl.setModifiedDate(getModifiedDate());
		meetingImpl.setTitle(getTitle());
		meetingImpl.setDateAndTime(getDateAndTime());
		meetingImpl.setLocation(getLocation());
		meetingImpl.setAgenda(getAgenda());
		meetingImpl.setDescription(getDescription());
		meetingImpl.setCreatedBy(getCreatedBy());
		meetingImpl.setHostedBy(getHostedBy());
		meetingImpl.setMeetingType(getMeetingType());
		meetingImpl.setMeetingLink(getMeetingLink());
		meetingImpl.setMeetingRoom(getMeetingRoom());
		meetingImpl.setAssetsName(getAssetsName());
		meetingImpl.setInternalGuest(getInternalGuest());
		meetingImpl.setExternalGuest(getExternalGuest());

		meetingImpl.resetOriginalValues();

		return meetingImpl;
	}

	@Override
	public int compareTo(Meeting meeting) {
		int value = 0;

		value = getTitle().compareTo(meeting.getTitle());

		if (value != 0) {
			return value;
		}

		value = getDateAndTime().compareTo(meeting.getDateAndTime());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Meeting)) {
			return false;
		}

		Meeting meeting = (Meeting)object;

		long primaryKey = meeting.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Meeting> toCacheModel() {
		MeetingCacheModel meetingCacheModel = new MeetingCacheModel();

		meetingCacheModel.uuid = getUuid();

		String uuid = meetingCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			meetingCacheModel.uuid = null;
		}

		meetingCacheModel.meetingId = getMeetingId();

		meetingCacheModel.groupId = getGroupId();

		meetingCacheModel.companyId = getCompanyId();

		meetingCacheModel.userId = getUserId();

		meetingCacheModel.userName = getUserName();

		String userName = meetingCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			meetingCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			meetingCacheModel.createDate = createDate.getTime();
		}
		else {
			meetingCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			meetingCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			meetingCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		meetingCacheModel.title = getTitle();

		String title = meetingCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			meetingCacheModel.title = null;
		}

		meetingCacheModel.dateAndTime = getDateAndTime();

		String dateAndTime = meetingCacheModel.dateAndTime;

		if ((dateAndTime != null) && (dateAndTime.length() == 0)) {
			meetingCacheModel.dateAndTime = null;
		}

		meetingCacheModel.location = getLocation();

		String location = meetingCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			meetingCacheModel.location = null;
		}

		meetingCacheModel.agenda = getAgenda();

		String agenda = meetingCacheModel.agenda;

		if ((agenda != null) && (agenda.length() == 0)) {
			meetingCacheModel.agenda = null;
		}

		meetingCacheModel.description = getDescription();

		String description = meetingCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			meetingCacheModel.description = null;
		}

		meetingCacheModel.createdBy = getCreatedBy();

		String createdBy = meetingCacheModel.createdBy;

		if ((createdBy != null) && (createdBy.length() == 0)) {
			meetingCacheModel.createdBy = null;
		}

		meetingCacheModel.hostedBy = getHostedBy();

		String hostedBy = meetingCacheModel.hostedBy;

		if ((hostedBy != null) && (hostedBy.length() == 0)) {
			meetingCacheModel.hostedBy = null;
		}

		meetingCacheModel.meetingType = getMeetingType();

		String meetingType = meetingCacheModel.meetingType;

		if ((meetingType != null) && (meetingType.length() == 0)) {
			meetingCacheModel.meetingType = null;
		}

		meetingCacheModel.meetingLink = getMeetingLink();

		String meetingLink = meetingCacheModel.meetingLink;

		if ((meetingLink != null) && (meetingLink.length() == 0)) {
			meetingCacheModel.meetingLink = null;
		}

		meetingCacheModel.meetingRoom = getMeetingRoom();

		String meetingRoom = meetingCacheModel.meetingRoom;

		if ((meetingRoom != null) && (meetingRoom.length() == 0)) {
			meetingCacheModel.meetingRoom = null;
		}

		meetingCacheModel.assetsName = getAssetsName();

		String assetsName = meetingCacheModel.assetsName;

		if ((assetsName != null) && (assetsName.length() == 0)) {
			meetingCacheModel.assetsName = null;
		}

		meetingCacheModel.internalGuest = getInternalGuest();

		String internalGuest = meetingCacheModel.internalGuest;

		if ((internalGuest != null) && (internalGuest.length() == 0)) {
			meetingCacheModel.internalGuest = null;
		}

		meetingCacheModel.externalGuest = getExternalGuest();

		String externalGuest = meetingCacheModel.externalGuest;

		if ((externalGuest != null) && (externalGuest.length() == 0)) {
			meetingCacheModel.externalGuest = null;
		}

		return meetingCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Meeting, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Meeting, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Meeting, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Meeting)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Meeting, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Meeting, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Meeting, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Meeting)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Meeting>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private long _meetingId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _title;
	private String _dateAndTime;
	private String _location;
	private String _agenda;
	private String _description;
	private String _createdBy;
	private String _hostedBy;
	private String _meetingType;
	private String _meetingLink;
	private String _meetingRoom;
	private String _assetsName;
	private String _internalGuest;
	private String _externalGuest;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Meeting, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Meeting)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("meetingId", _meetingId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("title", _title);
		_columnOriginalValues.put("dateAndTime", _dateAndTime);
		_columnOriginalValues.put("location", _location);
		_columnOriginalValues.put("agenda", _agenda);
		_columnOriginalValues.put("description", _description);
		_columnOriginalValues.put("createdBy", _createdBy);
		_columnOriginalValues.put("hostedBy", _hostedBy);
		_columnOriginalValues.put("meetingType", _meetingType);
		_columnOriginalValues.put("meetingLink", _meetingLink);
		_columnOriginalValues.put("meetingRoom", _meetingRoom);
		_columnOriginalValues.put("assetsName", _assetsName);
		_columnOriginalValues.put("internalGuest", _internalGuest);
		_columnOriginalValues.put("externalGuest", _externalGuest);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("meetingId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("title", 256L);

		columnBitmasks.put("dateAndTime", 512L);

		columnBitmasks.put("location", 1024L);

		columnBitmasks.put("agenda", 2048L);

		columnBitmasks.put("description", 4096L);

		columnBitmasks.put("createdBy", 8192L);

		columnBitmasks.put("hostedBy", 16384L);

		columnBitmasks.put("meetingType", 32768L);

		columnBitmasks.put("meetingLink", 65536L);

		columnBitmasks.put("meetingRoom", 131072L);

		columnBitmasks.put("assetsName", 262144L);

		columnBitmasks.put("internalGuest", 524288L);

		columnBitmasks.put("externalGuest", 1048576L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Meeting _escapedModel;

}