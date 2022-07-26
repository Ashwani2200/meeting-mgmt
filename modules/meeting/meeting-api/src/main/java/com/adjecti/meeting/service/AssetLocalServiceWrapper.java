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

package com.adjecti.meeting.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssetLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetLocalService
 * @generated
 */
public class AssetLocalServiceWrapper
	implements AssetLocalService, ServiceWrapper<AssetLocalService> {

	public AssetLocalServiceWrapper(AssetLocalService assetLocalService) {
		_assetLocalService = assetLocalService;
	}

	/**
	 * Adds the asset to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asset the asset
	 * @return the asset that was added
	 */
	@Override
	public com.adjecti.meeting.model.Asset addAsset(
		com.adjecti.meeting.model.Asset asset) {

		return _assetLocalService.addAsset(asset);
	}

	@Override
	public com.adjecti.meeting.model.Asset addAsset(
		String name, String assetModel, String purchaseDate, String serialNo,
		boolean status, boolean roomAssigned,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _assetLocalService.addAsset(
			name, assetModel, purchaseDate, serialNo, status, roomAssigned,
			serviceContext);
	}

	/**
	 * Creates a new asset with the primary key. Does not add the asset to the database.
	 *
	 * @param assetId the primary key for the new asset
	 * @return the new asset
	 */
	@Override
	public com.adjecti.meeting.model.Asset createAsset(long assetId) {
		return _assetLocalService.createAsset(assetId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the asset from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asset the asset
	 * @return the asset that was removed
	 */
	@Override
	public com.adjecti.meeting.model.Asset deleteAsset(
		com.adjecti.meeting.model.Asset asset) {

		return _assetLocalService.deleteAsset(asset);
	}

	/**
	 * Deletes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset that was removed
	 * @throws PortalException if a asset with the primary key could not be found
	 */
	@Override
	public com.adjecti.meeting.model.Asset deleteAsset(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.deleteAsset(assetId);
	}

	@Override
	public com.adjecti.meeting.model.Asset deleteContact(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.deleteContact(assetId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _assetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.AssetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _assetLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.AssetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _assetLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _assetLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _assetLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.adjecti.meeting.model.Asset fetchAsset(long assetId) {
		return _assetLocalService.fetchAsset(assetId);
	}

	/**
	 * Returns the asset matching the UUID and group.
	 *
	 * @param uuid the asset's UUID
	 * @param groupId the primary key of the group
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	@Override
	public com.adjecti.meeting.model.Asset fetchAssetByUuidAndGroupId(
		String uuid, long groupId) {

		return _assetLocalService.fetchAssetByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _assetLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Asset> getAllAsset()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.getAllAsset();
	}

	/**
	 * Returns the asset with the primary key.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset
	 * @throws PortalException if a asset with the primary key could not be found
	 */
	@Override
	public com.adjecti.meeting.model.Asset getAsset(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.getAsset(assetId);
	}

	/**
	 * Returns the asset matching the UUID and group.
	 *
	 * @param uuid the asset's UUID
	 * @param groupId the primary key of the group
	 * @return the matching asset
	 * @throws PortalException if a matching asset could not be found
	 */
	@Override
	public com.adjecti.meeting.model.Asset getAssetByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.getAssetByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.AssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @return the range of assets
	 */
	@Override
	public java.util.List<com.adjecti.meeting.model.Asset> getAssets(
		int start, int end) {

		return _assetLocalService.getAssets(start, end);
	}

	/**
	 * Returns all the assets matching the UUID and company.
	 *
	 * @param uuid the UUID of the assets
	 * @param companyId the primary key of the company
	 * @return the matching assets, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.meeting.model.Asset>
		getAssetsByUuidAndCompanyId(String uuid, long companyId) {

		return _assetLocalService.getAssetsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of assets matching the UUID and company.
	 *
	 * @param uuid the UUID of the assets
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching assets, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.meeting.model.Asset>
		getAssetsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.adjecti.meeting.model.Asset> orderByComparator) {

		return _assetLocalService.getAssetsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of assets.
	 *
	 * @return the number of assets
	 */
	@Override
	public int getAssetsCount() {
		return _assetLocalService.getAssetsCount();
	}

	@Override
	public com.adjecti.meeting.model.Asset getByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.getByAssetId(assetId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _assetLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _assetLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assetLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the asset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param asset the asset
	 * @return the asset that was updated
	 */
	@Override
	public com.adjecti.meeting.model.Asset updateAsset(
		com.adjecti.meeting.model.Asset asset) {

		return _assetLocalService.updateAsset(asset);
	}

	@Override
	public com.adjecti.meeting.model.Asset updateAsset(
			long assetId, String name, String assetModel, String purchaseDate,
			String serialNo, boolean status, boolean roomAssigned,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetLocalService.updateAsset(
			assetId, name, assetModel, purchaseDate, serialNo, status,
			roomAssigned, serviceContext);
	}

	@Override
	public AssetLocalService getWrappedService() {
		return _assetLocalService;
	}

	@Override
	public void setWrappedService(AssetLocalService assetLocalService) {
		_assetLocalService = assetLocalService;
	}

	private AssetLocalService _assetLocalService;

}