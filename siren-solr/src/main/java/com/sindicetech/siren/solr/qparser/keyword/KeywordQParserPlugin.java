/**
 * Copyright (c) 2014, Sindice Limited. All Rights Reserved.
 *
 * This file is part of the SIREn project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sindicetech.siren.solr.qparser.keyword;

import org.apache.solr.common.params.SolrParams;
import org.apache.solr.request.SolrQueryRequest;
import org.apache.solr.search.QParser;

import com.sindicetech.siren.solr.qparser.SirenQParserPlugin;

/**
 * Implementation of {@link SirenQParserPlugin} for the {@link KeywordQParser}.
 */
public class KeywordQParserPlugin extends SirenQParserPlugin {

  @Override
  public QParser createParser(final String qstr, final SolrParams localParams,
                              final SolrParams params, final SolrQueryRequest req) {
    final KeywordQParser qparser = new KeywordQParser(qstr, localParams, params, req);
    qparser.setQNames(this.getQNames());
    qparser.setAllowLeadingWildcard(this.getAllowLeadingWildcard());
    return qparser;
  }

}
