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

package top.charles7c.cnadmin.common.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * 系统相关常量
 *
 * @author Charles7c
 * @since 2023/2/9 22:11
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SysConsts {

    /**
     * 管理员角色编码
     */
    public static final String ADMIN_ROLE_CODE = "admin";

    /**
     * 顶级父 ID
     */
    public static final Long SUPER_PARENT_ID = 0L;

    /**
     * 全部权限标识
     */
    public static final String ALL_PERMISSION = StringConsts.ASTERISK;

    /**
     * 默认密码
     */
    public static final String DEFAULT_PASSWORD = "123456";

    /**
     * 登录 URI
     */
    public static final String LOGIN_URI = "/auth/login";

    /**
     * 退出登录 URI
     */
    public static final String LOGOUT_URI = "/auth/logout";
}
