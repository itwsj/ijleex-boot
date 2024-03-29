/*
 * Copyright 2011-2018 ijym-lee
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

package me.ijleex.dev.test.unihan;

import com.ibm.icu.text.UnicodeSet;

/**
 * 简单测试
 *
 * @author liym
 * @since 2017-09-07 09:12 新建
 */
final class Icu4jTest {

    public static void main(String[] args) {
        UnicodeSet unicodeSet = new UnicodeSet();
        unicodeSet.add(0xFA0E);
        unicodeSet.add(0xFA0F);
        unicodeSet.add(0xFA11);
        unicodeSet.add(0xFA13);
        unicodeSet.add(0xFA14);
        unicodeSet.add(0xFA1F);
        unicodeSet.add(0xFA21);
        unicodeSet.add(0xFA23);
        unicodeSet.add(0xFA24);
        unicodeSet.add(0xFA27);
        unicodeSet.add(0xFA28);
        unicodeSet.add(0xFA29);

        int size = unicodeSet.size();
        System.out.println(size);

        unicodeSet.forEach(System.out::println);

        int codePoint = CodePointUtil.getCodePoint("\uD869\uDC1A");
        System.out.println(codePoint);
        System.out.println(CodePointUtil.intAsHex(codePoint));
    }

}
