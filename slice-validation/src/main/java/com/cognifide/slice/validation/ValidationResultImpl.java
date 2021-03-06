package com.cognifide.slice.validation;

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

import com.cognifide.slice.validation.api.ErrorMessage;
import com.cognifide.slice.validation.api.ValidationResult;
import com.cognifide.slice.validation.api.ValidationState;

/**
 * Result of validation.
 * 
 * @author Rafał Malinowski
 */
public class ValidationResultImpl implements ValidationResult {

	private final ValidationState validationState;

	private final List<ErrorMessage> errorMessages;

	public ValidationResultImpl(final ValidationState validationState,
			final List<ErrorMessage> errorMessages) {
		this.validationState = validationState;
		this.errorMessages = errorMessages;
	}

	@Override
	public ValidationState getValidationState() {
		return validationState;
	}

	@Override
	public boolean isBlank() {
		return validationState.isBlank();
	}

	@Override
	public boolean isValid() {
		return validationState.isValid();
	}

	@Override
	public List<ErrorMessage> getErrorMessages() {
		return errorMessages;
	}

}
