package com.cognifide.slice.api.injector;

//@formatter:off
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
//@formatter:on

import org.apache.sling.api.resource.Resource;

/**
 * @author Witold Szczerba
 * @author Rafał Malinowski
 * @class InjectorsRepository
 * 
 * Helper class to get Injector instances. Slice supports multiple injectors installed on one instance, with
 * each injector being tagged with name of the application that created it. By standard, the application name
 * is the name of its folder under /apps.
 * 
 * Injector can be retrieved in three different ways:
 * <ul>
 * <li>by specifying injector / application name ({@link #getInjector(String injectorName)}),</li>
 * <li>for specific resource, by passing the resource ({@link #getInjectorForResource(Resource resource)}), or
 * </li>
 * <li>for specific resource, by passing it's path ({@link #getInjectorForResource(String resourcePath)}).</li>
 * </ul>
 */
public interface InjectorsRepository {

	/**
	 * Returns injector (with context) for specific application, or null if no such injector was registered.
	 * 
	 * @param injectorName name of required injector (same as application name)
	 * @return InjectorWithContext for given application
	 * @throws IllegalStateException if Slice is not running
	 */
	InjectorWithContext getInjector(final String injectorName);

	/**
	 * Returns the default injector for the provided resource, or null if no feasible injector was registered.
	 * 
	 * @param resource resource to find the default injector for.
	 * @return default injector for the specified resource, or null if no feasible injector was registered.
	 */
	InjectorWithContext getInjectorForResource(final Resource resource);

	/**
	 * Returns the default injector for the resource under provided path, or null if no feasible injector was
	 * registered.
	 * 
	 * @param resourcePath path to the resource to find the default injector for.
	 * @return default injector for the specified resource, or null if no feasible injector was registered.
	 */
	InjectorWithContext getInjectorForResource(final String resourcePath);
}
