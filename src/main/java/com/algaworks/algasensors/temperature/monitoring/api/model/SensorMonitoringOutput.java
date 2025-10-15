package com.algaworks.algasensors.temperature.monitoring.api.model;

import io.hypersistence.tsid.TSID;

import java.time.OffsetDateTime;

public record SensorMonitoringOutput(TSID id, Double lastTemperature, OffsetDateTime updateAt, Boolean enabled) {
}
