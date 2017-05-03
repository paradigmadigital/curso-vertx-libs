package io.vertx.blueprint.microservice.common.cpu;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

/**
 * Util for cpu measure
 * 
 * @author manuel
 *
 */
public class CPULevel {

	private final OperatingSystemMXBean operatingSystemMXBean;

	private CPULevel(OperatingSystemMXBean operatingSystemMXBean) {
		this.operatingSystemMXBean = operatingSystemMXBean;
	}

	/**
	 * Create a CPU Level measurer
	 * 
	 * @return
	 */
	public static CPULevel create() {
		OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
		return new CPULevel(operatingSystemMXBean);
	}

	public OperatingSystemMXBean getOperatingSystemMXBean() {
		return operatingSystemMXBean;
	}

}
