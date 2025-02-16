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

package top.charles7c.cnadmin.common.config.properties;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import cn.hutool.extra.spring.SpringUtil;

/**
 * RSA 配置属性
 *
 * @author Zheng Jie（ELADMIN）
 * @author Charles7c
 * @since 2022/12/21 20:21
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RsaProperties {

    /** 私钥 */
    public static final String PRIVATE_KEY;

    static {
        PRIVATE_KEY = SpringUtil.getProperty("rsa.privateKey");
    }
}
