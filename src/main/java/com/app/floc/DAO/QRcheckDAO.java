package com.app.floc.DAO;

import com.app.floc.mapper.ParticipantQRcheckMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class QRcheckDAO {
    private final ParticipantQRcheckMapper participantQRcheckMapper;
}
