/*
 * Created on Oct 20, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api.abstract_;

import static org.mockito.Mockito.verify;

import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.api.AbstractAssertTest;
import org.fest.assertions.api.ConcreteAssert;

/**
 * Tests for <code>{@link AbstractAssert#isSameAs(Object)}</code>.
 * 
 * @author Alex Ruiz
 */
public class AbstractAssert_isSameAs_Test extends AbstractAssertTest {

  @Override
  protected ConcreteAssert invoke_api_method() {
    return assertions.isSameAs(8L);
  }

  @Override
  protected void verify_internal_object_was_invoked() {
    verify(objects).assertSame(assertionsInfo(), assertionsActual(), 8L);
  }
}