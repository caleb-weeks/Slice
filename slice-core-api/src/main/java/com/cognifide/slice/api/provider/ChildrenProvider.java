package com.cognifide.slice.api.provider;

/*
 * #%L
 * Slice - Core API
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2012 Cognifide Limited
 * %%
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
 * #L%
 */


import java.util.List;

import org.apache.sling.api.resource.Resource;

public interface ChildrenProvider {

	/**
	 * Returns paths of child resources of a resource under specified path. If a resource under specified path doesn't
	 * exist, empty list is returned. The method is not recursive - it reads only direct children.
	 * 
	 * @param path resource path
	 * @return list of paths of child resources or empty list if resource doesn't exist
	 */
	List<String> getChildren(final String path);

	/**
	 * Returns child resources of a resource under specified path. If a resource under specified path doesn't
	 * exist, empty list is returned. The method is not recursive - it reads only direct children.
	 * 
	 * @param path resource path
	 * @return list of child resources or empty list if resource doesn't exist
	 */
	List<Resource> getChildResources(final String path);

}
