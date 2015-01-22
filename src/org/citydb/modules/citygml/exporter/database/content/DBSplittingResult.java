/*
 * This file is part of the 3D City Database Importer/Exporter.
 * Copyright (c) 2007 - 2013
 * Institute for Geodesy and Geoinformation Science
 * Technische Universitaet Berlin, Germany
 * http://www.gis.tu-berlin.de/
 * 
 * The 3D City Database Importer/Exporter program is free software:
 * you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program. If not, see 
 * <http://www.gnu.org/licenses/>.
 * 
 * The development of the 3D City Database Importer/Exporter has 
 * been financially supported by the following cooperation partners:
 * 
 * Business Location Center, Berlin <http://www.businesslocationcenter.de/>
 * virtualcitySYSTEMS GmbH, Berlin <http://www.virtualcitysystems.de/>
 * Berlin Senate of Business, Technology and Women <http://www.berlin.de/sen/wtf/>
 */
package org.citydb.modules.citygml.exporter.database.content;

import org.citydb.modules.citygml.exporter.util.GlobalAppearanceResolver;
import org.citygml4j.model.citygml.CityGMLClass;

public class DBSplittingResult {
	private final long primaryKey;
	private final CityGMLClass cityObjectType;
	private final String gmlId;
	private final GlobalAppearanceResolver globalAppResolver;
	
	private boolean checkIfAlreadyExported = false;

	public DBSplittingResult(long primaryKey, CityGMLClass cityObjectType) {
		this(null, null, primaryKey, cityObjectType);
	}
		
	public DBSplittingResult(String gmlId, long primaryKey, CityGMLClass cityObjectType) {
		this(null, gmlId, primaryKey, cityObjectType);
	}
	
	public  DBSplittingResult(GlobalAppearanceResolver globalAppResolver) {
		this(globalAppResolver, globalAppResolver.getGmlId(), globalAppResolver.getId(), CityGMLClass.APPEARANCE);
	}

	private DBSplittingResult(GlobalAppearanceResolver globalAppResolver, String gmlId, long primaryKey, CityGMLClass cityObjectType) {
		this.globalAppResolver = globalAppResolver;
		this.gmlId = gmlId;
		this.primaryKey = primaryKey;
		this.cityObjectType = cityObjectType;
	}

	public String getGmlId() {
		return gmlId;
	}

	public long getPrimaryKey() {
		return primaryKey;
	}

	public CityGMLClass getCityObjectType() {
		return cityObjectType;
	}

	public boolean isCheckIfAlreadyExported() {
		return checkIfAlreadyExported;
	}

	public void setCheckIfAlreadyExported(boolean checkIfAlreadyExported) {
		this.checkIfAlreadyExported = checkIfAlreadyExported;
	}

	public GlobalAppearanceResolver getGlobalAppearanceResolver() {
		return globalAppResolver;
	}
	
}
