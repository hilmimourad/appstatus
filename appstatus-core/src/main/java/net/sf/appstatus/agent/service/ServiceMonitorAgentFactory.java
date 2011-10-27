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
package net.sf.appstatus.agent.service;

import net.sf.appstatus.agent.MonitorFactory;

/**
 * Service Monitor Agent factory.
 * 
 * @author Guillaume Mary
 * 
 */
public final class ServiceMonitorAgentFactory {

	/**
	 * Retrieve the agent used to monitor the specified service.
	 * 
	 * @param serviceName
	 *            service name
	 * @return agent used to monitor
	 */
	public static IServiceStatisticsMonitorAgent getAgent(String serviceName) {
		return getAgent(MonitorFactory.DEFAULT_MONITOR_NAME, serviceName);
	}

	/**
	 * Retrieve the agent used to monitor the specified service.
	 * 
	 * @param serviceName
	 *            service name
	 * @return agent used to monitor
	 */
	public static IServiceStatisticsMonitorAgent getAgent(String monitorName,
			String serviceName) {
		return MonitorFactory.getAgent(IServiceStatisticsMonitorAgent.class, monitorName,
				serviceName);
	}

	/**
	 * Default constructor.
	 */
	private ServiceMonitorAgentFactory() {
		// prevent instantiation
	}
}