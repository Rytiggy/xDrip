package com.eveningoutpost.dexdrip.G5Model;

import com.eveningoutpost.dexdrip.Models.JoH;

// created by jamorham

public class SessionStopTxMessage extends TransmitterMessage {

    final byte opcode = 0x28;

    SessionStopTxMessage(int stopTime) {
        init(opcode, 7);
        data.putInt(stopTime);
        appendCRC();
    }

    SessionStopTxMessage(String transmitterId) {
        final int stopTime = DexTimeKeeper.getDexTime(transmitterId, JoH.tsl());
        init(opcode, 7);
        data.putInt(stopTime);
        appendCRC();
    }


}
