/**
 * Copyright © 2010 Nokia
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

package com.googlecode.jsonschema2pojo.rules;

import org.codehaus.jackson.JsonNode;

import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JDocCommentable;

/**
 * @see <a
 *      href="http://tools.ietf.org/html/draft-zyp-json-schema-02#section-5.19">http://tools.ietf.org/html/draft-zyp-json-schema-02#section-5.19</a>
 */
public class DescriptionRule implements SchemaRule<JDocCommentable, JDocComment> {

    @Override
    public JDocComment apply(String nodeName, JsonNode node, JDocCommentable generatableType) {
        JDocComment javadoc = generatableType.javadoc();

        javadoc.append(node.getTextValue());

        return javadoc;
    }

}