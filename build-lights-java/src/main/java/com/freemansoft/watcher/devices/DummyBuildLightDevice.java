package com.freemansoft.watcher.devices;

/*
 * Copyright 2011 FreemanSoft Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

import org.apache.log4j.Logger;

import com.freemansoft.IBuildLightDevice;

/**
 * Base class for different dummy devices. Used to play with software when you
 * don't have physical build light
 * 
 * @since Jan, 11, 2013
 */
public class DummyBuildLightDevice implements IBuildLightDevice {

	private static Logger LOG = Logger.getLogger(DummyBuildLightDevice.class);

	@Override
	public int bldGetNumLights() {
		LOG.info("Received bldGetNumLights returning 4");
		return 30;
	}

	@Override
	public int bldGetMaxColor() {
		LOG.info("Received bldGetMaxColor returning 255");
		return 255;
	}

	@Override
	public void bldClear(int deviceNumber) {
		LOG.info("Received bldClr()");
	}

	@Override
	public void bldSolid(int deviceNumber, int red, int green, int blue) {
		LOG.info("Received bldSolid(" + deviceNumber + "," + red + "," + green
				+ "," + blue + ")");
	}

	@Override
	public void bldBlink(int deviceNumber, int red, int green, int blue) {
		LOG.info("Received bldBlink(" + deviceNumber + "," + red + "," + green
				+ "," + blue + ")");
	}

}
