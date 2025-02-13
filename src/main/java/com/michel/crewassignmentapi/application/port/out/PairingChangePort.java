package com.michel.crewassignmentapi.application.port.out;

import com.michel.crewassignmentapi.domain.model.PairingChange;

public interface PairingChangePort {
    void publish(PairingChange pairingChange);
}
