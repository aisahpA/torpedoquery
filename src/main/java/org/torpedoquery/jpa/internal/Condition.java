/**
 * Copyright (C) ${project.inceptionYear} Xavier Jodoin (xavier@jodoin.me)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.torpedoquery.jpa.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
public interface Condition {

	/**
	 * <p>createQueryFragment.</p>
	 *
	 * @param incrementor a {@link java.util.concurrent.atomic.AtomicInteger} object.
	 * @return a {@link java.lang.String} object.
	 */
	String createQueryFragment(AtomicInteger incrementor);

	/**
	 * <p>getParameters.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	List<Parameter> getParameters();
}
