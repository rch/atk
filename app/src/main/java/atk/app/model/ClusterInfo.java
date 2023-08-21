package atk.app.model;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import atk.msg.clusterinfo.ClusterInfo.ClusterInfoState;

/**
 *   "clusterInfo": {
 *     "id": 1687498463283,
 *     "startedOn": 1687498463283,
 *     "state": "STARTED",
 *     "haState": "ACTIVE",
 *     "rmStateStoreName": "org.apache.hadoop.yarn.server.resourcemanager.recovery.ZKRMStateStore",
 *     "resourceManagerVersion": "3.0.0-cdh6.3.3",
 *     "resourceManagerBuildVersion": "3.0.0-cdh6.3.3 from cf849054a5901ece520f9ced04374604acdf43dc by jenkins source checksum fbdc34c999acc7fde8b1aaf4c3ec4e4",
 *     "resourceManagerVersionBuiltOn": "2023-03-21T16:05Z",
 *     "hadoopVersion": "3.0.0-cdh6.3.3",
 *     "hadoopBuildVersion": "3.0.0-cdh6.3.3 from cf849054a5901ece520f9ced04374604acdf43dc by jenkins source checksum 99ddbd8a29104326ee08d96e9e5d580",
 *     "hadoopVersionBuiltOn": "2023-03-21T16:01Z",
 *     "haZooKeeperConnectionState": "CONNECTED"
 *   }
 */
public class ClusterInfo {
    public int id;
    public ZonedDateTime startedOn;
    public ZoneOffset startedOnOffsetTime;
    public ClusterInfoState state;
    public String resourceManagerVersion;
}
