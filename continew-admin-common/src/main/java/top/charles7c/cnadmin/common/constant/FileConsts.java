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
 * 文件相关常量
 *
 * @author Charles7c
 * @since 2023/1/2 21:19
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileConsts {

    /**
     * 头像支持的图片类型
     */
    public static final String[] AVATAR_SUPPORTED_IMG_TYPES = {"jpg", "png", "gif", "jpeg"};
}
