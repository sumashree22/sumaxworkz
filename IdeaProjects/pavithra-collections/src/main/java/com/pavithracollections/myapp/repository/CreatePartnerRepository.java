package com.pavithracollections.myapp.repository;

import com.pavithracollections.myapp.dto.DistributersPartnerDto;

public interface CreatePartnerRepository {
    boolean savePartner(DistributersPartnerDto dto);
}
