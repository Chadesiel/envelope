/*
 * Copyright (c) 2015-2019, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */

package com.cloudera.labs.envelope.schema;

import com.cloudera.labs.envelope.component.Component;
import org.apache.spark.sql.types.StructType;

/**
 * Schemas provide alternative methods to define the SparkSQL Row schema 
 */
public interface Schema extends Component {

  /**
   * Get the schema.
   * @return The normalized schema
   */
  StructType getSchema();

}
