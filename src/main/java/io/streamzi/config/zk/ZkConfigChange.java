package io.streamzi.config.zk;

/**
 * This event is raised when some Zookeeper configuration change is mande.
 * @author hhiden
 */
public class ZkConfigChange {
    /** Name of the property that has changed */
    private String propertyName;

    public ZkConfigChange(String propertyName) {
        this.propertyName = propertyName;
    }    
}