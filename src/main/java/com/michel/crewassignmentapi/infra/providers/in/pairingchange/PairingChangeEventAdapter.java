package com.michel.crewassignmentapi.infra.providers.in.pairingchange;

import com.michel.crewassignmentapi.application.port.in.PairingChangeUseCase;
import com.michel.crewassignmentapi.domain.model.PairingChange;
import com.michel.crewassignmentapi.infra.providers.in.pairingchange.model.PairingChangeNotification;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PairingChangeEventAdapter {

    private final PairingChangeUseCase pairingChangeUseCase;
    private final PairingChangeMapper mapper;

    public void handlePairingChange(PairingChangeNotification pairingChangeNotification) {
        //If event caching is desirable, we could do it here.
        PairingChange pairingChange = mapper.map(pairingChangeNotification);
        pairingChangeUseCase.handle(pairingChange);
    }
}
