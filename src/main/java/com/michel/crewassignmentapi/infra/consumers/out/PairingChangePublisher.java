package com.michel.crewassignmentapi.infra.consumers.out;

import com.michel.crewassignmentapi.application.port.out.PairingChangePort;
import com.michel.crewassignmentapi.domain.model.PairingChange;

public class PairingChangePublisher implements PairingChangePort {

    @Override
    public void publish(PairingChange pairingChange) {
        //If necessary we can map again here
        //Kafka(?) publishing logic goes here
    }
}
