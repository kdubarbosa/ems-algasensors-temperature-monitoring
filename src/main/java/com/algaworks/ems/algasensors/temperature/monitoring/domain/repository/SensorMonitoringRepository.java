package com.algaworks.ems.algasensors.temperature.monitoring.domain.repository;

import com.algaworks.ems.algasensors.temperature.monitoring.domain.model.SensorId;
import com.algaworks.ems.algasensors.temperature.monitoring.domain.model.SensorMonitoring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorMonitoringRepository extends JpaRepository<SensorMonitoring, SensorId> {
}
