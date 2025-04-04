package io.graversen.minecraft.rcon.service;

import io.graversen.minecraft.rcon.Defaults;

import java.time.Duration;

public class ConnectOptions {
    private final int maxRetries;
    private final Duration timeBetweenRetries;
    private final Duration initialDelayConnectionWatcherInterval;


    private final Duration connectionWatcherInterval;

    public ConnectOptions(int maxRetries, Duration timeBetweenRetries, Duration initialDelayConnectionWatcherInterval, Duration connectionWatcherInterval) {
        this.maxRetries = maxRetries;
        this.timeBetweenRetries = timeBetweenRetries;
        this.initialDelayConnectionWatcherInterval = initialDelayConnectionWatcherInterval;
        this.connectionWatcherInterval = connectionWatcherInterval;
    }

    public static ConnectOptions defaults() {
        return new ConnectOptions(3, Duration.ofSeconds(3), Defaults.CONNECTION_WATCHER_INTERVAL, Defaults.CONNECTION_WATCHER_INTERVAL);
    }

    public static ConnectOptions defaultInit1sAfter1Min() {
        return new ConnectOptions(3, Duration.ofSeconds(3), Defaults.CONNECTION_WATCHER_INTERVAL, Defaults.CONNECTION_WATCHER_INTERVAL_1MIN);
    }

    public static ConnectOptions neverStopTrying() {
        return new ConnectOptions(Integer.MAX_VALUE, Duration.ofSeconds(3), Defaults.CONNECTION_WATCHER_INTERVAL, Defaults.CONNECTION_WATCHER_INTERVAL);
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public Duration getTimeBetweenRetries() {
        return timeBetweenRetries;
    }

    public Duration getInitialDelayConnectionWatcherInterval() {
        return initialDelayConnectionWatcherInterval;
    }


    public Duration getConnectionWatcherInterval() {
        return connectionWatcherInterval;
    }

    @Override
    public String toString() {
        return "ConnectOptions{" +
                "maxRetries=" + maxRetries +
                ", timeBetweenRetries=" + timeBetweenRetries +
                ", initialDelayConnectionWatcherInterval=" + initialDelayConnectionWatcherInterval +
                ", connectionWatcherInterval=" + connectionWatcherInterval +
                '}';
    }
}
