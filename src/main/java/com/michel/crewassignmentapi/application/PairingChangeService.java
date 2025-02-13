package com.michel.crewassignmentapi.application;

import com.michel.crewassignmentapi.application.port.in.PairingChangeUseCase;
import com.michel.crewassignmentapi.application.port.out.PairingChangePort;
import com.michel.crewassignmentapi.domain.model.PairingChange;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PairingChangeService implements PairingChangeUseCase {

    private final PairingChangePort pairingChangePort;

    @Override
    public void handle(PairingChange pairingChange) {
        //Business logic if any goes here or, preferably, inside the Domain model directly if sensible.
        //If other services need to be called to enrich data then the ports to do so can be injected/called here.
        pairingChangePort.publish(pairingChange);
    }
}
