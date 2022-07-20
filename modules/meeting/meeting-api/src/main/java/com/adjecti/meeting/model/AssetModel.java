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
 * The base model interface for the Asset service. Represents a row in the &quot;meeting_Asset&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.adjecti.meeting.model.impl.AssetModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.adjecti.meeting.model.impl.AssetImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Asset
 * @generated
 */
@ProviderType
public interface AssetModel
	extends BaseModel<Asset>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset model instance should use the {@link Asset} interface instead.
	 */

	/**
	 * Returns the primary key of this asset.
	 *
	 * @return the primary key of this asset
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset.
	 *
	 * @param primaryKey the primary key of this asset
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this asset.
	 *
	 * @return the uuid of this asset
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this asset.
	 *
	 * @param uuid the uuid of this asset
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the asset ID of this asset.
	 *
	 * @return the asset ID of this asset
	 */
	public long getAssetId();

	/**
	 * Sets the asset ID of this asset.
	 *
	 * @param assetId the asset ID of this asset
	 */
	public void setAssetId(long assetId);

	/**
	 * Returns the group ID of this asset.
	 *
	 * @return the group ID of this asset
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this asset.
	 *
	 * @param groupId the group ID of this asset
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this asset.
	 *
	 * @return the company ID of this asset
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset.
	 *
	 * @param companyId the company ID of this asset
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this asset.
	 *
	 * @return the user ID of this asset
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this asset.
	 *
	 * @param userId the user ID of this asset
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset.
	 *
	 * @return the user uuid of this asset
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this asset.
	 *
	 * @param userUuid the user uuid of this asset
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this asset.
	 *
	 * @return the user name of this asset
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this asset.
	 *
	 * @param userName the user name of this asset
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this asset.
	 *
	 * @return the create date of this asset
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset.
	 *
	 * @param createDate the create date of this asset
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this asset.
	 *
	 * @return the modified date of this asset
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this asset.
	 *
	 * @param modifiedDate the modified date of this asset
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this asset.
	 *
	 * @return the name of this asset
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this asset.
	 *
	 * @param name the name of this asset
	 */
	public void setName(String name);

	/**
	 * Returns the asset model of this asset.
	 *
	 * @return the asset model of this asset
	 */
	@AutoEscape
	public String getAssetModel();

	/**
	 * Sets the asset model of this asset.
	 *
	 * @param assetModel the asset model of this asset
	 */
	public void setAssetModel(String assetModel);

	/**
	 * Returns the purchase date of this asset.
	 *
	 * @return the purchase date of this asset
	 */
	@AutoEscape
	public String getPurchaseDate();

	/**
	 * Sets the purchase date of this asset.
	 *
	 * @param purchaseDate the purchase date of this asset
	 */
	public void setPurchaseDate(String purchaseDate);

	/**
	 * Returns the serial no of this asset.
	 *
	 * @return the serial no of this asset
	 */
	@AutoEscape
	public String getSerialNo();

	/**
	 * Sets the serial no of this asset.
	 *
	 * @param serialNo the serial no of this asset
	 */
	public void setSerialNo(String serialNo);

	/**
	 * Returns the status of this asset.
	 *
	 * @return the status of this asset
	 */
	public boolean getStatus();

	/**
	 * Returns <code>true</code> if this asset is status.
	 *
	 * @return <code>true</code> if this asset is status; <code>false</code> otherwise
	 */
	public boolean isStatus();

	/**
	 * Sets whether this asset is status.
	 *
	 * @param status the status of this asset
	 */
	public void setStatus(boolean status);

	/**
	 * Returns the room assigned of this asset.
	 *
	 * @return the room assigned of this asset
	 */
	public boolean getRoomAssigned();

	/**
	 * Returns <code>true</code> if this asset is room assigned.
	 *
	 * @return <code>true</code> if this asset is room assigned; <code>false</code> otherwise
	 */
	public boolean isRoomAssigned();

	/**
	 * Sets whether this asset is room assigned.
	 *
	 * @param roomAssigned the room assigned of this asset
	 */
	public void setRoomAssigned(boolean roomAssigned);

}