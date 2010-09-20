/*
 * Copyright 2010 Capgemini
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
 * 
 */
package net.sf.appstatus.agent.service.spi;

import net.sf.appstatus.agent.service.IServiceAgentFactory;
import net.sf.appstatus.agent.service.ServiceAgentFactory;

/**
 * An internal interface which helps the static {@link ServiceAgentFactory}
 * class bind with the appropriate {@link IServiceAgentFactory} instance.
 * 
 * @author Guillaume Mary
 */
public interface IServiceAgentFactoryBinder {

	/**
	 * Return the instance of {@link IServiceAgentFactory} that
	 * {@link ServiceAgentFactory} class should bind to.
	 * 
	 * @return the instance of {@link IServiceAgentFactory} that
	 *         {@link ServiceAgentFactory} class should bind to.
	 */
	IServiceAgentFactory getServiceAgentFactory();

	/**
	 * The String form of the {@link IServiceAgentFactory} object that this
	 * <code>ServiceAgentFactoryBinder</code> instance is <em>intended</em> to
	 * return.
	 * 
	 * @return the class name of the intended {@link IServiceAgentFactory}
	 *         instance
	 */
	String getServiceAgentFactoryStr();
}
