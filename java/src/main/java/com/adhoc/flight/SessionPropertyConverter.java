/*
 * Copyright (C) 2017-2021 Dremio Corporation
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

package com.adhoc.flight;

import com.beust.jcommander.IStringConverter;

/**
 * Converter for the SessionProperty key value pairs provided in the command line.
 */
public class SessionPropertyConverter implements IStringConverter<SessionProperty> {
  @Override
  public SessionProperty convert(String keyValuePair) {
    final String[] parts = keyValuePair.split(":");

    final String key = parts[0].trim();
    final String value = parts[1].trim();

    return new SessionProperty(key, value);
  }
}
