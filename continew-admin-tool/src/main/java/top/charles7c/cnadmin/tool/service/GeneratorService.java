/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.charles7c.cnadmin.tool.service;

import java.sql.SQLException;
import java.util.List;

import top.charles7c.cnadmin.common.model.query.PageQuery;
import top.charles7c.cnadmin.common.model.vo.PageDataVO;
import top.charles7c.cnadmin.tool.model.entity.FieldConfigDO;
import top.charles7c.cnadmin.tool.model.entity.GenConfigDO;
import top.charles7c.cnadmin.tool.model.query.TableQuery;
import top.charles7c.cnadmin.tool.model.request.GenConfigRequest;
import top.charles7c.cnadmin.tool.model.vo.TableVO;

/**
 * 代码生成业务接口
 *
 * @author Charles7c
 * @since 2023/4/12 23:57
 */
public interface GeneratorService {

    /**
     * 分页查询表信息列表
     *
     * @param query
     *            查询条件
     * @param pageQuery
     *            分页查询条件
     * @return 表信息分页列表
     * @throws SQLException
     *             /
     */
    PageDataVO<TableVO> pageTable(TableQuery query, PageQuery pageQuery) throws SQLException;

    /**
     * 查询生成配置信息
     *
     * @param tableName
     *            表名称
     * @return 生成配置信息
     * @throws SQLException
     *             /
     */
    GenConfigDO getGenConfig(String tableName) throws SQLException;

    /**
     * 查询字段配置列表
     *
     * @param tableName
     *            表名称
     * @param requireSync
     *            是否需要同步
     * @return 字段配置列表
     */
    List<FieldConfigDO> listFieldConfig(String tableName, Boolean requireSync);

    /**
     * 保存代码生成配置信息
     *
     * @param request
     *            代码生成配置信息
     * @param tableName
     *            表名称
     */
    void saveConfig(GenConfigRequest request, String tableName);

    /**
     * 生成代码
     *
     * @param tableName
     *            表名称
     */
    void generate(String tableName);
}
