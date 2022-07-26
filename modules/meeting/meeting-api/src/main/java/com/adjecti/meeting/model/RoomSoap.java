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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.adjecti.meeting.service.http.RoomServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RoomSoap implements Serializable {

	public static RoomSoap toSoapModel(Room model) {
		RoomSoap soapModel = new RoomSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRoomId(model.getRoomId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRoomNo(model.getRoomNo());
		soapModel.setFloorNo(model.getFloorNo());
		soapModel.setCapacity(model.getCapacity());
		soapModel.setBuilding(model.getBuilding());

		return soapModel;
	}

	public static RoomSoap[] toSoapModels(Room[] models) {
		RoomSoap[] soapModels = new RoomSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RoomSoap[][] toSoapModels(Room[][] models) {
		RoomSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RoomSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RoomSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RoomSoap[] toSoapModels(List<Room> models) {
		List<RoomSoap> soapModels = new ArrayList<RoomSoap>(models.size());

		for (Room model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RoomSoap[soapModels.size()]);
	}

	public RoomSoap() {
	}

	public long getPrimaryKey() {
		return _roomId;
	}

	public void setPrimaryKey(long pk) {
		setRoomId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRoomId() {
		return _roomId;
	}

	public void setRoomId(long roomId) {
		_roomId = roomId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getRoomNo() {
		return _roomNo;
	}

	public void setRoomNo(String roomNo) {
		_roomNo = roomNo;
	}

	public String getFloorNo() {
		return _floorNo;
	}

	public void setFloorNo(String floorNo) {
		_floorNo = floorNo;
	}

	public String getCapacity() {
		return _capacity;
	}

	public void setCapacity(String capacity) {
		_capacity = capacity;
	}

	public String getBuilding() {
		return _building;
	}

	public void setBuilding(String building) {
		_building = building;
	}

	private String _uuid;
	private long _roomId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _roomNo;
	private String _floorNo;
	private String _capacity;
	private String _building;

}