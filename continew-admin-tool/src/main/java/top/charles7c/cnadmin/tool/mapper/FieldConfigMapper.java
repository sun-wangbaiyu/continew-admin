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

package top.charles7c.cnadmin.tool.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import top.charles7c.cnadmin.common.base.BaseMapper;
import top.charles7c.cnadmin.tool.model.entity.FieldConfigDO;

/**
 * 字段配置 Mapper
 *
 * @author Charles7c
 * @since 2023/4/12 23:56
 */
public interface FieldConfigMapper extends BaseMapper<FieldConfigDO> {

    /**
     * 根据表名称查询
     * 
     * @param tableName
     *            表名称
     * @return 字段配置信息
     */
    @Select("SELECT * FROM `gen_field_config` WHERE `table_name` = #{tableName}")
    List<FieldConfigDO> selectListByTableName(@Param("tableName") String tableName);
}
