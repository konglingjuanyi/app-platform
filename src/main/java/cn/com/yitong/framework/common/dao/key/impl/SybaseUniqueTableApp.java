/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.com.yitong.framework.common.dao.key.impl;

import javax.sql.DataSource;

public class SybaseUniqueTableApp extends DefaultUniqueTableApp {
	
	public SybaseUniqueTableApp(DataSource dataSource) {
		super(dataSource);
		
		this.selectSQL = "SELECT code FROM YITONG_PRIMARYKEY HOLDLOCK WHERE name = ? ";
		this.updateSQL = "UPDATE YITONG_PRIMARYKEY SET code = code + ? WHERE name = ? ";
		this.insertSQL = "INSERT INTO YITONG_PRIMARYKEY (code, name) VALUES (?, ?)";
	}
}