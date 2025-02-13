package com.michel.crewassignmentapi.application.port.in;

import com.michel.crewassignmentapi.domain.model.PairingChange;

public interface PairingChangeUseCase {
    void handle(PairingChange pairingChange);
}
