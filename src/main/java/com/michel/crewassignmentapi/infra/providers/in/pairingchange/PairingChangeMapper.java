package com.michel.crewassignmentapi.infra.providers.in.pairingchange;

import com.michel.crewassignmentapi.domain.model.PairingChange;
import com.michel.crewassignmentapi.infra.providers.in.pairingchange.model.PairingChangeNotification;

public class PairingChangeMapper {

    PairingChange map(PairingChangeNotification notification) {
        PairingChange pairingChange = new PairingChange();
        //do mapping
        return pairingChange;
    }

}
